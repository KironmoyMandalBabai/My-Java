import java.util.Scanner;

public class arr2d {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the row");
             int row=sc.nextInt();
             System.out.println("enter the colms");
             int col=sc.nextInt();
             int [][]num=new int[row][col];
             for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    num[i][j]=sc.nextInt();
                }
             }
             System.out.println("thwe matrixs is :");
             for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(num[i][j]+" ");
                }
                System.out.println();
             }
        }




    }
}
