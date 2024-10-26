fun main() {
    val words = mutableListOf<String>()

    println("Введите слова (для заверешния ввода оставьте строку пустой + Enter) : ")
    do{
        val input = readLine()!!.trim()
        if (input != "")
            words.add(input)
    } while (input != "")

    println("Группы слов с одинаковыми буквами:")
    val used = BooleanArray(words.size)
    for (i in 0..words.size - 1){
        if (used[i]) continue

        val currentWord = words[i]
        val groups = mutableListOf(currentWord)
        used[i] = true

        for (j in i + 1..words.size - 1){
            val nextWord = words[j]

            if (currentWord.toCharArray().sorted() == nextWord.toCharArray().sorted()){
                groups.add(nextWord)
                used[j] = true
            }
        }
        println(groups)
    }



}

