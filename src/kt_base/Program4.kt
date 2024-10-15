class Program4 {
    fun main() {
        println("Введите символ в нижнем регистре:")
        val input = readLine()

        if (input != null && input.length == 1) { // проверка введенного символа
            val symbol = input[0]

            if (symbol >= 'a' && symbol <= 'z') { // проверка что символ в ниждем регистре
                val upperSymbol = symbol - 32 // делаем в верхний(умом)
                val unicodeCode = upperSymbol.code // код unicode

                println("Символ в верхнем регистре: ${upperSymbol.toChar()}")
                println("Unicode нового символа: $unicodeCode")
            } else {
                println("Ошибка введите букву в нижнем регистре.")
            }
        } else {
            println("Ошибка: введите один символ.")
        }
    }

}