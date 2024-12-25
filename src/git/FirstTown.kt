package git

class FirstTown(name: String): Town(name),InfoSity {

    var countOne = 0
    var countTwo = 0
    var countThree = 0
    var countFour = 0
    var countSum = 0

    private val model = listOf(
        "1.Alcatel One Toch - 12000руб.",
        "2.Iphone 4s - 9000руб.",
        "3.Samsung gt100 - 22000руб.",
        "4.Xiaomi 10c - 15000руб.")

    override fun getModelInfo() {
        model.forEach { it -> println(it) }
    }

    override fun getChoise() {
        when(readln().toInt()){
            1 -> {
                println("Куплен телефон: ${model[0]}")
                countOne++
                countSum += 12000
            }
            2 -> {
                println("Куплен телефон: ${model[1]}")
                countTwo++
                countSum += 9000
            }
            3 -> {
                println("Куплен телефон: ${model[2]}")
                countThree++
                countSum += 22000
            }
            4 -> {
                println("Куплен телефон: ${model[3]}")
                countFour++
                countSum += 15000
            }
        }
    }

    override fun getInfoMagazine() {
        println("Магазин в городе:$name\n" +
                "Число купленных телефонов:\n" +
                "${model[0].drop(2).take(16)}:$countOne\n" +
                "${model[1].drop(2).take(9)}:$countTwo\n" +
                "${model[2].drop(2).take(13)}:$countThree\n" +
                "${model[3].drop(2).take(10)}:$countFour\n" +
                "Общая сумма покупок:$countSum")
    }

    override fun printObjectInfo() {
        println("1.$name")
    }

    fun repair(){
        println("Ваше устройство нуждается в починке?\n1.Да\n2.Нет")
        if (readln().toInt() == 1){
            println("Устройство отремонтировано")
        }else{
            println("В ремонте не нуждается")
        }
    }
}