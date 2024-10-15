
    fun main() {
        println("Введите число:")
        val input = readLine()

        if (input != null) { // проверка если ничего нету
            val number = input.toIntOrNull() // Преобразуем в число

            if (number != null) {
                if (number % 2 == 0) {
                    println("Четное")
                } else {
                    println("Нечетное")
                }
            } else {
                println("Некорректное значение")
            }
        } else {
            println("Ошибка ввода")
        }
    }

