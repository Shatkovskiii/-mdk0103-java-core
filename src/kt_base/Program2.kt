class Program2 {
    fun main() {
        println("Введите символ:")
        val input = readLine()

        if (input != null && input.length == 1) { // проверка
            val symbol = input[0] // берём первый символ
            if ((symbol in 'a'..'z') || (symbol in 'A'..'Z')) { // проверка на букву
                println(true)
            } else {
                println(false)
            }
        } else {
            println("Ошибка введите 1 символ")//ошибочко
        }
    }
}