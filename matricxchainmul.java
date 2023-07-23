import java.util.Scanner;

public class matricxchainmul {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of matrices: ");
     int n= sc.nextInt();

     int[] arr = new int[n + 1];

  
    System.out.println("Enter the dimensions of matrices:\n");

    for(int i=0; i<=n; i++){
        arr[i]=sc.nextInt();
        
    }

    System.out.println("Minimum number of multiplications is "+ matrixChainOrder(arr, n+1));
}



public static int matrixChainOrder(int p[], int n)
{
    int [][]m=new int[n][n];

    for (int i = 1; i < n; i++)
        m[i][i] = 0;

    for (int L = 2; L < n; L++)
    {
        for (int i = 1; i < n - L + 1; i++)
        {
            int j = i + L - 1;
            m[i][j] = Integer.MAX_VALUE;

            for (int k = i; k <= j - 1; k++)
            {
                int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];

                if (q < m[i][j])
                    m[i][j] = q;
            }
        }
    }

    return m[1][n - 1];
}
}

