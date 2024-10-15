class Program8 {
    fun main() {
        println("Введите ваш возраст:")
        val input = readLine()

        if (input != null) {

            val age = input.toIntOrNull()//преобразовать строку в целое число

            if (age != null) {
                if (age < 0) {
                    println("Введено некорректное значение")
                } else if (age >= 18) {
                    println("Совершеннолетний")
                } else {
                    println("Несовершеннолетний")
                }
            } else {
                println("Ошибка введено неверное значиени")
            }
        } else {
            println("ничего нету")
        }
    }

}