fun main(){
    try {
        println("Введите название сказки, Введите имя автора, Введите год выпуска, Введите кол-во страниц, Введите цену")
        val tale = FairyTale(readLine()!!.toString(), readLine()!!.toString(), readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toDouble())
        when{
            (tale.empYear > 2025 || tale.empYear < 0) -> println("Неверный год")
            (tale.empVolumePages < 0) -> println("Неверное количество страниц")
            (tale.empPrice < 0) -> println("Неверная цена")
            else ->{
                tale.GetInfo()
                tale.OldBookMarkup()
            }
        }

        println("--------------")

        println("Введите название драмы, Введите имя автора, Введите год выпуска, Введите кол-во страниц, Введите цену")
        val dramaBook = Drama(readLine()!!.toString(), readLine()!!.toString(), readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toDouble())
        when{
            (dramaBook.empYear > 2025 || dramaBook.empYear < 0) -> println("Неверный год")
            (dramaBook.empVolumePages < 0) -> println("Неверное количество страниц")
            (dramaBook.empPrice < 0) -> println("Неверная цена")
            else ->{
                println("Введите свой возраст")
                dramaBook.age = readLine()!!.toInt()
                dramabook.AgeForReading()
            }
        }

    }
    catch (e: Exception){
        println("неправильный формат")
    }
}
