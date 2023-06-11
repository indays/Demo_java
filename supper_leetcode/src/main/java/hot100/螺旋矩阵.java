package hot100;

import java.util.ArrayList;
import java.util.List;

public class 螺旋矩阵 {

    public static void main(String[] args) {


        int [][] aa =new int[][]{new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}};

        spiralOrder(aa);
    }


    public static List<Integer> spiralOrder(int[][] matrix) {


        List<Integer> aa = new ArrayList<>();

        boolean tag =true;

        int i=0;
        int j=0;

        // 行走标识  1  东走    -1  西走     2  北走   -2  南走
        int work =1;
        while(tag){

            while(i>=0&&i<matrix[0].length &&j>=0&& j<matrix.length && matrix[j][i]!=-108){

                aa.add(matrix[j][i]);
                matrix[j][i]=-108;
                if(work==1){
                    i++;
                }else if(work==-1){
                    i--;
                }else if(work==2){
                    j--;
                }else {
                    j++;
                }

            }
            if(work==1){
                i--;
            }else if(work==-1){
                i++;
            }else if(work==2){
                j++;
            }else {
                j--;
            }


            if(work==1 && (j+1>=matrix.length ||matrix[j+1][i]==-108)){

                tag=false;
            }

            if(work==-1 &&( j-1<0 ||matrix[j-1][i]==-108)){

                tag=false;
            }
            if(work==2 && (i+1>=matrix[0].length || matrix[j][i+1]==-108)){

                tag=false;
            }
            if(work==-2 && (i-1<0 ||matrix[j][i-1]==-108)){

                tag=false;
            }
            // 计算跳出循环


            // 如果未跳出循环，重新计算行走方向
            if(work==1){
                work=-2;
                j++;
            }else if(work==-2){
                work=-1;
                i--;
            }else if(work==-1){
                work=2;
                j--;
            }else if(work==2){
                work=1;
                i++;
            }


        }

        return aa;

    }
}
