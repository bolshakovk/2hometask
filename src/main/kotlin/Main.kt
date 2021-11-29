/**
 * @param month - массив месяцов
 * @param horizontalTable - инстанс горизонтальной таблицы
 * /**TODO сделать горизонтально столбиковую диаграмму и вертикально столбиковую, узнать про отношение таблиц 1 ко многим
 *     починить визуализуцию отображения месяцов и данных(все пляшет, здесь нужна помощь)
 *     Не работает HorizontalTable*/
 */

fun main(){
    val months = arrayListOf("Январь", "Февраль", "Март",
                             "Апрель", "Май", "Июнь",
                             "Июль", "Август", "Сентябрь",
                             "Октябрь", "Ноябрь", "Декабрь")
    val verticalTable = VerticalTable(months.size, months.size)
    val table = verticalTable.generateMatrix(months)
    verticalTable.printTable(table, months)
}