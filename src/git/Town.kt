package git

abstract class Town(val name:String) {

    abstract fun getModelInfo():List<String>
    abstract fun getChoise()

}