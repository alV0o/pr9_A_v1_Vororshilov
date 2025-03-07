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
                tale.PriceOfOnePage()
                tale.PriceDueToMaterial()
                tale.TypeOfBook()
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
                when{
                    (dramaBook.age<0) -> println("Неверный возраст")
                    else ->{
                        dramaBook.GetInfo()
                        dramaBook.PriceOfOnePage()
                        dramaBook.PriceDueToMaterial()
                        dramaBook.TypeOfBook()
                    }
                }
            }
        }

        println("---------------")

        println("Введите название книги, Введите имя автора, Введите год выпуска, Введите кол-во страниц, Введите цену")
        val book = Book(readLine()!!.toString(), readLine()!!.toString(), readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toDouble())

        when{
            (book.year > 2025 || book.year < 0) -> println("Неверный год")
            (book.countPages < 0) -> println("Неверное количество страниц")
            (book.price < 0) -> println("Неверная цена")
            else ->{
                book.GetInfo()
                book.PriceOfOnePage()
                book.PriceDueToMaterial()
            }
        }
    }
    catch (e: Exception){
        println("неправильный формат")
    }
}