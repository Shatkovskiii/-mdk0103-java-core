class Program10 {
    fun main() {
        println("Введите ваш возраст:")
        val input = readLine() // Считываем возраст

        if (input != null) { // Проверка на null
            val age = input.toIntOrNull() // Пробуем преобразовать в число

            if (age != null) {
                if (age < 0) {
                    println("Некорректный возраст")
                } else if (age <= 12) {
                    println("Ребёнок")
                } else if (age <= 17) {
                    println("Подросток")
                } else if (age <= 64) {
                    println("Взрослый")
                } else {
                    println("Пожилой")
                }
            } else {
                println("Некорректный возраст")
            }
        } else {
            println("Ошибка ввода")
        }
    }

}