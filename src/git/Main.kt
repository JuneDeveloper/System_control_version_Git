package git

fun main() {
    val firstTown = FirstTown("Ангарск")
    val secondTown = SecondTown("Иркутск")
    do{
        println("Приветствуем Вас в приложении покупки смартфона")
        println("Для продолжения работы выберите пункт:\n1.Продолжить\n2.Выход")
        if (readln().toInt() == 2){ break }
        else   {
            println("Выберите интересующий Вас город из доступных ниже..")
            firstTown.printObjectInfo()
            secondTown.printObjectInfo()
            if (readln().toInt() == 1) {
                println("Выберите интересующую Вас модель..")
                firstTown.getModelInfo()
                firstTown.getChoise()
            }else{
                println("Выберите интересующую Вас модель..")
                secondTown.getModelInfo()
                secondTown.getChoise()
            }
        }
    }while (readln() != "dfds")
}