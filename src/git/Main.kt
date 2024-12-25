package git


fun main() {
    val firstTown = FirstTown("Ангарск")
    val secondTown = SecondTown("Иркутск")
    loop@ do {
        println("Приветствуем Вас в приложении покупки смартфона")
        println("Для продолжения работы выберите пункт:\n1.Продолжить\n2.Выход")
        if (readln().toInt() == 2) {
            break
        } else {
            println("Выберите интересующий Вас пункт меню..")
            firstTown.printObjectInfo()
            secondTown.printObjectInfo()
            println("3.Выход")
            when (readln().toInt()) {
                3 -> break@loop
                1 -> {
                    if (firstTown.countSum == 0) firstTown.repair()
                    loop@ while (true) {
                        println(
                            "Выберите пункт меню из доступных ниже.." +
                                    "\n1.Посмотреть статистику продаж магазина\n2.Выбрать модель"
                        )
                        if (readln().toInt() == 1) {
                            firstTown.getInfoMagazine()
                            println("Вернуться назад?\n1.Да")
                            if (readln().toInt() == 1) continue@loop
                        } else {
                            firstTown.getModelInfo()
                            firstTown.getChoise()
                            break@loop
                        }
                    }
                }
                2 -> {
                    loop@ while (true) {
                        println(
                            "Выберите пункт меню из доступных ниже.." +
                                    "\n1.Посмотреть статистику продаж магазина\n2.Выбрать модель"
                        )
                        if (readln().toInt() == 1) {
                            secondTown.getInfoMagazine()
                            println("Вернуться назад?\n1.Да")
                            if (readln().toInt() == 1) continue@loop
                        } else {
                            secondTown.getModelInfo()
                            secondTown.getChoise()
                            break@loop
                        }
                    }
                }
            }
        }
    } while (true)
}
