package org.example;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = {
                {23, 45, 12, 37},
                {50, 11, 42, 20},
                {33, 27, 19, 48},
                {8, 39, 6, 4}
        };

        int sumEvenRows = 0;
        int sumOddRows = 0;
        long productEvenColumns = 1;
        long productOddColumns = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) { // Парний рядок
                    sumEvenRows += matrix[i][j];
                } else { // Непарний рядок
                    sumOddRows += matrix[i][j];
                }

                if (j % 2 == 0) { // Парний стовпець
                    productEvenColumns *= matrix[i][j];
                } else { // Непарний стовпець
                    productOddColumns *= matrix[i][j];
                }
            }
        }

        System.out.println("Сума елементів у парних рядках: " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках: " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях: " + productEvenColumns);
        System.out.println("Добуток елементів у непарних стовпцях: " + productOddColumns);

        if (sumEvenRows != sumOddRows && productEvenColumns != productOddColumns) {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}