open class Book(var name: String, var author: String, var year: Int, var countPages: Int, var price: Double) {

    var antiqueMarkup:Double = 0.0//наценка за антикварность
    var typeBook = ""
    open fun GetInfo(){
        TypeOfBook()

        println("Название \"${name}\". Автор: ${author}. Тип книги: ${typeBook}")
        println("Год выпуска: ${year}. Количество страниц: ${countPages}. Цена: ${price}p")
    }



    fun OldBookMarkup(){ //определяет наценку за старость
        when{
            (2025-year >=0 && 2025-year <= 5)->{
                antiqueMarkup = price/100
                println("Наценка за старость = ${String.format("%.2f", antiqueMarkup)}p")
            }
            (2025-year >5 && 2025-year <= 10) ->{
                antiqueMarkup = price/75
                println("Наценка за старость = ${String.format("%.2f", antiqueMarkup)}p")
            }
            (2025-year >10) -> {
                antiqueMarkup = price/50
                println("Наценка за старость = ${String.format("%.2f", antiqueMarkup)}p")
            }
            else -> {
                println("Неверный год")
                println("Введите заново")
                OldBookMarkup()
            }
        }
    }

    fun PriceOfOnePage(){//определяет цену одной страницы без наценки за старость
        OldBookMarkup()

        println("Цена одной страницы без наценки за старость = ${String.format("%.2f", (price-(antiqueMarkup))/countPages)}")
    }

    fun PriceDueToMaterial(){ //определение себестоимости книги по материалам
        println("Выберите переплет")
        println("[1] - Твердый переплет")
        println("[2] - Мягкий переплет")
        println("[3] - Клеевое соединение")

        val answer = readLine()!!.toInt()
        var priceOnePage = 0.0

        when(answer){
            1 -> priceOnePage = 1.5
            2 -> priceOnePage = 0.5
            3 -> priceOnePage = 0.2
            else -> {
                println("Неверный выбор")
                println("Выберите заново")
                PriceDueToMaterial()
            }
        }

        println("Себестоимость этой книги = ${priceOnePage*countPages}р")
    }

    open fun TypeOfBook(){
        println("Выберите вид книги")
        println("[1] - Научно-публицистическая")
        println("[2] - Художественная")
        println("[3] - Детская")

        val answer = readLine()!!.toInt()

        when (answer){
            1 ->{
                typeBook = "Научно-публицистическая"
                println("Эта книга подходит для получения знаний")
            }
            2->{
                typeBook = "Художественная"
                println("Эта книга подходит для приятного чтения в свободное время")
            }
            3->{
                typeBook = "Детская"
                println("Эта книга подходит для чтения ребенку на ночь")
            }
            else -> {
                println("Неверный выбор")
                println("Выберите заново")
                TypeOfBook()
            }
        }
    }
}
