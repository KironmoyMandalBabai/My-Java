import java.util.Scanner;

public class qus1 {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter price: ");
    int price = input.nextInt();
    if(250000<price){
        if(col==red){
            System.out.println("ok");
        
        }
        else{
            System.out.println("colour is not correct");
        }
    }
    if(250000>price){
        System.out.println("enter the rent");
        int rent = input.nextInt();
        if(3000>rent){
            System.out.println("ok");
        }
        else{
            System.out.println("not acceptable");
        }
    }
   }
}
