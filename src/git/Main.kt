package git

fun main() {
    val firstTown = FirstTown("Ангарск")
    val secondTown = SecondTown("Иркутск")
    do {
        println("Приветствуем Вас в приложении покупки смартфона")
        println("Для продолжения работы выберите пункт:\n1.Продолжить\n2.Выход")
        if (readln().toInt() == 2) {
            break
        } else {
            println("Выберите интересующий Вас город из доступных ниже..")
            firstTown.printObjectInfo()
            secondTown.printObjectInfo()
            if (readln().toInt() == 1) {
                println(
                    "Выберите пункт меню из доступных ниже.." +
                            "\n1.Посмотреть статистику продаж магазина\n2.Выбрать модель"
                )
                if (readln().toInt() == 1) {
                    firstTown.getInfoMagazine()
                } else {
                    firstTown.getModelInfo()
                    firstTown.getChoise()
                }
            } else {
                println(
                    "Выберите пункт меню из доступных ниже.." +
                            "\n1.Посмотреть статистику продаж магазина\n2.Выбрать модель"
                )
                if (readln().toInt() == 1) {
                    secondTown.getInfoMagazine()
                } else {
                    secondTown.getModelInfo()
                    secondTown.getChoise()
                }
            }
        }
    } while (readln() != "dfds")
}
