class Program12 {
    fun main() {
        println("Введите число n:")
        val input = readLine() // Считываем ввод

        if (input != null) {
            val n = input.toIntOrNull()

            if (n != null && n > 1) { // Проверка числа
                for (i in 1 until n) {
                    println(i * 2) //результат
                }
            } else {
                println("Некорректное значение")
            }
        } else {
            println("Ошибка ввода")
        }
    }

}