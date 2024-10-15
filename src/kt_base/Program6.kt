class Program6 {
    fun main() {
        println("Введите строку:")
        val input = readLine()

        if (input != null && input.length >= 2) { // проверка что строка содержит  два символа
            var result = "" // строка для результата


            for (i in 2 until input.length) {
                result += input[i] // добавляем символ в результат
            }

            // добавляем первые два символа в конец
            result += input[0]
            result += input[1]

            println("Новая строка: $result")
        } else {
            println("Ошибка строка должна содержать  два символа.")
        }
    }

}