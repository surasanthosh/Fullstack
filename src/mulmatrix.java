import java.util.*;
public class mulmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        System.out.println("Enter number of rows and columns: ");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int matrix1[][]=new int[row1][col1];
        int matrix2[][]=new int[row2][col2];
        int matrix[][]=new int[row1][col2];
        System.out.println("enter the elements of matrix1: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of matrix2: ");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                matrix[i][j]=0;
                for(int k=0;k<col1;k++){
                    matrix[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0;i<row1;i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}