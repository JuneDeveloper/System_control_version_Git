package git

class SecondTown(name: String) : Town(name),InfoSity {

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
            1 -> println("Куплен телефон: ${model[0]}")
            2 -> println("Куплен телефон: ${model[1]}")
            3 -> println("Куплен телефон: ${model[2]}")
            4 -> println("Куплен телефон: ${model[3]}")
            else -> println("Вы не выбрали модель из списка.Повторите попытку..")
        }
    }

    override fun printObjectInfo() {
        println(name)
    }
}