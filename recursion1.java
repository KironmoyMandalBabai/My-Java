public class recursion1{
    public static void main(String arges[]){
int n=10;
printn(n);
    }
    public static void printn(int n)
    {
        if(n==0){
            return;
        }
        System.out.println(n);
        printn(n-1);
    }
}