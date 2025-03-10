class Drama(var empName: String, var empAuthor: String, var empYear: Int, var empVolumePages: Int, var empPrice: Double):Book(empName, empAuthor, empYear, empVolumePages, empPrice) {

    var ageLimit = 0
    var age = 18

    fun AgeForReading(){
        println("Выберите возрастное ограничение для книги")
        println("[1] - 18+")
        println("[2] - 16+")
        println("[3] - 12+")
        println("[4] - 6+")
        println("[5] - 0+")
        ageLimit = readLine()!!.toInt()

        when{
            (ageLimit<1 || ageLimit>5) -> {
                println("Неверное ограничение. Введите заново")
                AgeForReading()
            }
            else->{
                when(ageLimit){
                    1-> ageLimit = 18
                    2->ageLimit = 16
                    3->ageLimit = 12
                    4->ageLimit = 6
                    5->ageLimit = 0
                }
                when{
                    (age>=ageLimit) -> println("Приятного прочтения")
                    else -> println("Вам рано такое читать!")
                }
            }
        }
    }

    override fun GetInfo(){
        AgeForReading()

        println("Название \"${name}\". Автор: ${author}")
        println("Год выпуска: ${year}. Количество страниц: ${countPages}. Цена: ${price}p")
        println("Возрастное ограничение: ${ageLimit}+")
    }

    override fun TypeOfBook() {
        println("Драма - это художественный вид книги. Она подходит для чтения в свободное время")
    }
}
