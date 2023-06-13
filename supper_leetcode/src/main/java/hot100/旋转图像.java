package hot100;

import java.util.Collections;

public class 旋转图像 {

    public static void main(String[] args) {

            int [][] matrix =new int[][]{{1,2,3},{4,5,6},{7,8,9}};

            new 旋转图像().test01(matrix);

            System.out.println(matrix);
    }

    public void test02(int[][] matrix) {

            int c = matrix[0].length;
            int r = matrix.length;

            for (int i = 0; i < r; i++) {

                for (int j = 0; j < c / 2; j++) {

                    int temp = matrix[i][j];

                    matrix[i][j] = matrix[i][c - j - 1];

                    matrix[i][c - j - 1] = temp;
                }
            }
    }


    public void test01(int [][] matrix){

        int c=matrix[0].length;
        int r=matrix.length;


        for (int i = 0; i < r; i++) {


            for (int j = 0; j < c/2; j++) {

                int temp =matrix[i][j];

                matrix[i][j]=matrix[j][i];

                matrix[j][i]=temp;

            }
        }


        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c / 2; j++) {

                int indexJ =c/2-j;

                int temp =matrix[i][j];
                matrix[i][j] = matrix[i][indexJ];
                matrix[i][indexJ]=temp;
            }
        }



    }

    private void swapNum(int[][] matrix, int i, int j) {

        int temp =matrix[i][j];

        matrix[i][j]=matrix[j][i];

        String e ="";

        matrix[j][i]=temp;

    }
}
