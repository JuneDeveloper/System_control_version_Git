package git

class FirstTown(name: String): Town(name),InfoSity {

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
            1 -> println("Куплен телефон: ${model[0]}")
            2 -> println("Куплен телефон: ${model[1]}")
            3 -> println("Куплен телефон: ${model[2]}")
            4 -> println("Куплен телефон: ${model[3]}")
            else -> println("Вы не выбрали модель из списка.Повторите попытку..")
        }
    }

    override fun printObjectInfo() {
        println("1.$name")
    }
}