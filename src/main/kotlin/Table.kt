
/**
 * Здесь находится абстрактный класс таблицы, от которого можно делать более конкретные таблицы(горизонтальная, вертикальная
 *
 * @param generateMatrix каждая таблица имеет свою генерацию матрицы, но отличающуюся от других типов
 * @param generateTable так как генерация таблицы отличается от генерации матрицы входящим параметром, необходимо реализовать
 * @param printTable каждая таблица имеет свой принцип отображения
 * Через градл добавил KDOC, но неясно, работает ли, или пишу я обычные комментарии
 */
abstract class Table(protected val  raw:Int, protected val col:Int) : Tables {

    abstract fun generateMatrix(month: ArrayList<String>): Array<IntArray>
    abstract override fun printTable(matrix: Array<IntArray>, month: ArrayList<String>)
    abstract override fun generateTable(month: ArrayList<String>, matrix: Array<IntArray>)
}
