public class recur2 {
        public static void main(String arges[]){
    int n=1;
    printn(n);
        }
        public static void printn(int n)
        {
            if(n==6){
                return;
            }
            System.out.println(n);
            printn(n+1);
        }
    }
