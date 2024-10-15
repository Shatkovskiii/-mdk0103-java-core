class Program20 {
    fun main() {
        // вводим строку с элементами через запятую
        println("Введите элементы через запятую:")
        val input = readLine() ?: return

        // разбиваем строку на элементы
        val elements = input.split(",").map { it.trim() }

        // создаем словарь для подсчета
        val countMap = mutableMapOf<String, Int>()


        for (item in elements) {
            countMap[item] = countMap.getOrDefault(item, 0) + 1//считаем сколько
        }

        // Выводим результат
        println(countMap)
    }

}