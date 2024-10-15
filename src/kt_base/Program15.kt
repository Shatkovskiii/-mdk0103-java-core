class Program15{
    fun main() {
        println("Введите длину массива:") // Длина массива
        val sizeInput = readLine() // Чтение
        val size = sizeInput?.toIntOrNull() // Преобразование

        if (size != null && size > 0) { // Проверка
            val originalArray = IntArray(size) // Массив

            println("Введите элементы массива:") // Элементы
            for (i in 0 until size) { // Заполнение
                val elementInput = readLine() // Чтение элемента
                originalArray[i] = elementInput?.toIntOrNull() ?: 0 // Замена
            }

            val reversedArray = IntArray(size) // Новый массив
            for (i in 0 until size) { // Обратный порядок
                reversedArray[i] = originalArray[size - 1 - i]
            }

            println("Массив в обратном порядке:") // Вывод
            for (num in reversedArray) { // Печать
                println(num) // Элемент
            }
        } else {
            println("Некорректная длина массива.") // Ошибка
        }
    }


}