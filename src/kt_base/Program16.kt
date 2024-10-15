public Program16 {
    fun main() {
        println("Введите длину списка:") // длина списка
        val size = readLine()?.toIntOrNull() ?: return println("Некорректная длина.") // проверка

        val list = mutableListOf<String>() // список

        for (i in 0 until size) { // ввод элементов
            val element = readLine() // чтение
            if (element != null) list.add(element) // добавление
        }

        val uniqueList = list.distinct() // уникальные элементы
        println("Уникальные элементы:") // вывод

        for (element in uniqueList) { // печать
            println(element) // элемент
        }
    }
}
