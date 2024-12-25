package git

class SecondTown(name: String) : Town(name),InfoSity {

    var countOneTownTwo = 0
    var countTwoTownTwo = 0
    var countThreeTownTwo = 0
    var countFourTownTwo = 0
    var countSumTownTwo = 0

    private val model = listOf(
        "1.Alcatel One Toch - 9000руб.",
        "2.Iphone 4s - 11000руб.",
        "3.Samsung gt100 - 20000руб.",
        "4.Xiaomi 10c - 15500руб.")

    override fun getModelInfo() {
        model.forEach { it -> println(it) }
    }

    override fun getChoise() {
        when(readln().toInt()){
            1 -> {
                println("Куплен телефон: ${model[0]}")
                countOneTownTwo++
                countSumTownTwo += 9000
            }
            2 -> {
                println("Куплен телефон: ${model[1]}")
                countTwoTownTwo++
                countSumTownTwo += 11000
            }
            3 -> {
                println("Куплен телефон: ${model[2]}")
                countThreeTownTwo++
                countSumTownTwo += 20000
            }
            4 -> {
                println("Куплен телефон: ${model[3]}")
                countFourTownTwo++
                countSumTownTwo += 15500
            }
            else -> println("Вы не выбрали модель из списка.Повторите попытку..")
        }
    }

    override fun getInfoMagazine() {
        println("Магазин в городе:$name\n" +
                "Число купленных телефонов:${model[0]}:$countOneTownTwo\n" +
                "Число купленных телефонов:${model[1]}:$countTwoTownTwo\n" +
                "Число купленных телефонов:${model[2]}:$countThreeTownTwo\n" +
                "Число купленных телефонов:${model[3]}:$countFourTownTwo\n" +
                "Общая сумма покупок:$countSumTownTwo")
    }

    override fun printObjectInfo() {
        println("2.$name")
    }
}