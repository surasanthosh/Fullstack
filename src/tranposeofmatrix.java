import java.util.*;
public class tranposeofmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        int[][] transpose=new int[col][row];
        System.out.println("enter the elements of matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transpose matrix is: ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}