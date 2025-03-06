class FairyTale(var empName: String, var empAuthor: String, var empYear: Int, var empVolumePages: Int, var empPrice: Double):Book(empName, empAuthor, empYear, empVolumePages, empPrice) {

    var discount = 0.0
    var type = ""

    fun TypeOfFairyTale(){
        println("Выберите вид сказки:")
        println("[1] - Русская народная")
        println("[2] - Иностранная")
        println("[3] - Легенда")

        val answer = readLine()!!.toInt()
        when(answer){
            1 -> {
                type = "Русская народная"
                discount = price/2
                println("Ваша скидка на книгу = ${discount}p")
            }
            2 -> {
                type = "Иностранная"
                discount = price/5
                println("Ваша скидка на книгу = ${discount}p")
            }
            3 ->{
                type = "Легенда"
                discount = price/10
                println("Ваша скидка на книгу = ${discount}p")
            }
            else -> {
                println("Введите заново")
                TypeOfFairyTale()
            }
        }
    }

    override fun GetInfo(){
        TypeOfFairyTale()
        println("Название \"${name}\". Вид сказки: ${type}. Автор: ${author}")
        println("Год выпуска: ${year}. Количество страниц: ${countPages}. Цена: ${price - discount}p")
    }
}