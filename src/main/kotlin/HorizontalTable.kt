class HorizontalTable(raw: Int, col: Int) : Table(raw, col) {
    /**
     * На данный момент ошибка переполнения стека.
     * За идею горизонтальной таблицы было принято решение транспонировании матрицы
     */
    override fun generateMatrix(month: ArrayList<String>): Array<IntArray> {
        val matrix = generateMatrix(month)
        val transpose = Array(col) { IntArray(raw) }
        for (i in 0..raw - 1) {
            for (j in 0..col - 1) {
                transpose[j][i] = matrix[i][j]
            }
        }
        return transpose
    }

    override fun printTable(matrix: Array<IntArray>, month: ArrayList<String>) {
        for (row in matrix) {
            for (column in row) {
                print("$column\t")
            }
            println()
        }
    }

    override fun generateTable(month: ArrayList<String>, matrix: Array<IntArray>) {
        generateMatrix(month)
    }

}