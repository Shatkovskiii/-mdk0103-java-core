class Program7 {
    fun main() {
        println("Введите строку:")
        val input = readLine()

        // проверка если там ничег онету
        if (input != null) {
            val length = input.length //длина стороки
            println("Длина строки: $length")
        } else {
            println("Ошибка: строка равна null.")
        }
    }

}