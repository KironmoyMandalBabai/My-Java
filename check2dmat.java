import java.util.Scanner;

public class check2dmat {
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
             System.out.println("{enter the ele to be search");
             int x=sc.nextInt();
             for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(num[i][j]==x){
                        System.out.println("found in"+i+" "+j+"");
                    }
                }
             }
        }
            
    }
}
