class Program17 {
    fun main() {
        // Ввод количества элементов первого множества
        println("Введите количество элементов первого множества:")
        val size1 = readLine()?.toIntOrNull() ?: return

        val array1 = IntArray(size1)


        println("Введите элементы первого множества:")
        for (i in 0 until size1) {
            array1[i] = readLine()?.toIntOrNull() ?: 0 // чтение элемента
        }


        println("Введите количество элементов второго множества:")
        val size2 = readLine()?.toIntOrNull() ?: return // чтение и проверка

        val array2 = IntArray(size2)


        println("Введите элементы второго множества:")
        for (i in 0 until size2) {
            array2[i] = readLine()?.toIntOrNull() ?: 0 // чтение элемента
        }


        val result = IntArray(size1 + size2) // массив для результата


        for (i in 0 until size1) { ///оепируем эл 2 масс
            result[i] = array1[i]
        }


        for (i in 0 until size2) { //оепируем эл 2 масс
            result[size1 + i] = array2[i]
        }


        println("Объединение: ${result.joinToString(", ")}")
    }

}