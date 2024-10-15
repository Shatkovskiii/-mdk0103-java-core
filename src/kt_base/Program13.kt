class Program13 {
    fun main() {
        println("Введите число для обратного отсчета:")
        val input = readLine()
        val count = input?.toIntOrNull()

        if (count != null && count > 0) {
            for (i in count downTo 1) { // обратный отсчет
                println(i) // вывод числа
                Thread.sleep(1000) // задержка
            }
            println("Погнале")
        } else {
            println("Некорректное число.")
        }
    }

}