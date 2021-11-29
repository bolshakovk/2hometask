import kotlin.random.Random

class VerticalTable(raw: Int, col: Int) : Table(raw, col) {
    /**
     * Обычная генерация двумерного массива, заполнение рандомом от 0 до 10, возвращается матрица по итогу для передачи
     * в таблицу
     */
    override fun generateMatrix(month: ArrayList<String>): Array<IntArray> {
        val matrix = Array(raw + 1) { IntArray(col + 1) }
        for (i in 0 until month.size) {
            for (j in 0..col) {
                matrix[i][j] = Random.nextInt(0, 10)
            }
        }
        return matrix
    }

    override fun printTable(matrix: Array<IntArray>, month: ArrayList<String>) {
        for (row in matrix) {
            /**
             * month[row[raw]] вероятнее всего хардкод
             * @param tmp для удобного отображения элемента матрицы
             * отображение рандомное, нужен фикс
             */
            val tmp = month[row[raw]]
            print("$tmp\t")
            for (col in row) {
                print("$col\t")
            }
            println()
        }
    }

    /**
     * Не помню зачем добавлял @param matrix, но это было обоснованно на тот момент
     */
    override fun generateTable(month: ArrayList<String>, matrix: Array<IntArray>) {
        generateMatrix(month)
    }

}