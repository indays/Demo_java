package hot100;

import java.util.Collections;

public class 旋转图像 {

    public static void main(String[] args) {

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
