public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arrayname1 = {
                {5, 8, 4},
                {4, 0, 32},
                {-5, 15, 9}};
        int[][] arrayname2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println("Первая матрица:");
        for (int i = 0; i < arrayname1.length; i++) { // Вывод первой матрицы
            for (int j = 0; j < arrayname1[i].length; j++) {
                System.out.print(arrayname1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Вторая матрица:");
        for (int i = 0; i < arrayname2.length; i++) { // Вывод второй матрицы
            for (int j = 0; j < arrayname2[i].length; j++) {
                System.out.print(arrayname2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Сумма двух матриц:");
        int[][]arraysum = new int[3][3];
        for (int i = 0; i < 3; i++) { // Сложение матриц
            for (int j = 0; j < 3; j++) {
                arraysum[i][j] = arrayname1[i][j] + arrayname2[i][j];
                System.out.print(arraysum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
