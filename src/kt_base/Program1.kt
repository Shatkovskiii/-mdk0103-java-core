class Program1 {
    fun main() {
        // ввод 3 числа
        println("Введите первое число:")
        val num1 = readLine()!!.toDouble()

        println("Введите второе число:")
        val num2 = readLine()!!.toDouble()

        println("Введите третье число:")
        val num3 = readLine()!!.toDouble()

        //вычисление среднего ариф
        val average = (num1 + num2 + num3) / 3

        // результат
        println("Среднее арифметическое: $average")
    }
}