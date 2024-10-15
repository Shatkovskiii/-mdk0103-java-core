
    fun main() {
        println("Введите число для поиска:")
        val numberToFind = readLine()?.toIntOrNull()

        if (numberToFind != null) {
            println("Введите количество элементов массива:")
            val sizeInput = readLine()?.toIntOrNull()

            if (sizeInput != null && sizeInput > 0) {
                val num = IntArray(sizeInput) // создаем массив

                println("Введите элементы массива:") // Ввод элементов массива
                for (i in 0 until sizeInput) { // заполнение массива
                    val elementInput = readLine()?.toIntOrNull() // чтение элемента
                    if (elementInput != null) {
                        num[i] = elementInput // сохранение элемента
                    }
                }


                val containsNumber = numberToFind in num // проверка есть ли число в массиве
                println(containsNumber) // вывод результата true или false
            } else {
                println("Некорректное количество элементов.")
            }
        } else {
            println("Некорректное число.")
        }
    }

