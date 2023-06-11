package hot100;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class 矩阵置零 {


    public static void main(String[] args) {
        int [][] aa =new int[][]{new int[]{1},new int[]{2},new int[]{3}};

    }
    public static void setZeroes(int[][] matrix) {

            int l =matrix.length;

            int r =matrix[0].length;

            boolean ltag = false;

            boolean rtag = false;

            for (int i = 0; i < r; i++) {

                if (matrix[0][i] == 0) {
                    ltag=true;
                    break;
                }
                i++;
            }

            for (int i = 0; i < l; i++) {

                if (matrix[i][0] == 0) {
                    rtag=true;
                    break;
                }
            }

            for (int i = 1; i < matrix[0].length; i++) {

                for (int j = 1; j < matrix.length; j++) {

                    if (matrix[j][i] == 0) {

                        matrix[0][i]=0;
                        matrix[j][0] = 0;
                    }
                }
            }

            for (int i = 1; i < matrix[0].length; i++) {

                if(matrix[0][i]==0){

                    int j=1;
                    while ( j< matrix.length) {
                        matrix[j++][i]=0;
                    }
                }
            }

            for (int i = 1; i < matrix.length; i++) {

                if (matrix[i][0] == 0) {

                    int j=1;
                    while (j < matrix[0].length) {

                        matrix[i][j++]=0;
                    }
                }
            }

            if (ltag) {

                for (int i = 0; i < matrix[0].length; i++) {

                    matrix[0][i]=0;
                }
            }

            if (rtag) {

                for (int i = 0; i < matrix.length; i++) {

                    matrix[i][0]=0;
                }
            }

    }
}
