import kotlin.random.Random

fun main(){
    val months = arrayListOf("Январь", "Февраль", "Март",
                                    "Апрель", "Май", "Июнь",
                                     "Июль", "Август", "Сентябрь",
                                    "Октябрь", "Ноябрь", "Декабрь")
    val randomValues = IntArray(months.size + 1)
    for (m in months){
        print("$m|")
        for (values in 0..months.size) {
            randomValues[values] = Random.nextInt(0, 100)
        }
        print(randomValues.contentToString())
        println()
    }
}