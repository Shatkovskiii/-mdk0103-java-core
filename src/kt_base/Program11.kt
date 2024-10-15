class Program11 {
    fun main() {
        println("Введите число от 1 до 7:")
        val input = readLine()

        if (input != null) {
            val day = input.toIntOrNull()

            if (day != null) {
                if (day == 1) {
                    println("Понедельник")
                } else if (day == 2) {
                    println("Вторник")
                } else if (day == 3) {
                    println("Среда")
                } else if (day == 4) {
                    println("Четверг")
                } else if (day == 5) {
                    println("Пятница")
                } else if (day == 6) {
                    println("Суббота")
                } else if (day == 7) {
                    println("Воскресенье")
                } else {
                    println("Некорректное число")
                }
            } else {
                println("Некорректное значение")
            }
        } else {
            println("Ошибка ввода")
        }
    }

}