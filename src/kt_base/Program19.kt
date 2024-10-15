class Program19 {
    fun main() {

        val daysOfWeek = mapOf(
            "Понедельник" to 1,"Вторник" to 2,"Среда" to 3, "Четверг" to 4, "Пятница" to 5,"Суббота" to 6, "Воскресенье" to 7)

        //вывод словаря
        for ((day, number) in daysOfWeek) {
            println("$day - $number")
        }
    }

}