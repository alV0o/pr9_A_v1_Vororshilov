open class Book(var name: String, var author: String, var year: Int, var countPages: Int, var price: Double) {

    open fun GetInfo(){
        println("Название \"${name}\". Автор: ${author}")
        println("Год выпуска: ${year}. Количество страниц: ${countPages}. Цена: ${price}p")
    }

    fun OldBookMarkup(){ //определяет наценку за старость
        var antiqueMarkup:Double//наценка за антикварность
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
            else -> println("Неверный год")
        }
    }
}