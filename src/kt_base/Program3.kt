class Program3 {
    fun main() {
        println("Введите первый символ:")
        val firstInput = readLine()

        println("Введите второй символ:")
        val secondInput = readLine()

        if (firstInput != null && secondInput != null && firstInput.length == 1 && secondInput.length == 1) {
            val firstChar = firstInput[0]
            val secondChar = secondInput[0]

            // преобразуем символы в числа(почему int не работает(()
            val firstUnicode = firstChar.code
            val secondUnicode = secondChar.code

            // разность
            val difference = firstUnicode - secondUnicode
            println("Разность между символами: $difference")
        } else {
            println("Ошибка введите 1 символ.")
        }
    }
}
