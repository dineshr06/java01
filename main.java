import java.util.Scanner;

public class main {
    public static void main(String [] args)
    {
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        int num1= scan.nextInt();
        if(num1%2==0){
        System.out.println("even number");
    } else {
            System.out.println("odd number");
        }
        System.out.println("want explanation?type yes for 'y' or no 'n'");
        scan.nextLine();
        String responce= scan.nextLine();

        if (responce.equals("Y"))
        {
            System.out.println("++++++++++++");
            System.out.println();
            System.out.println("explantion");
            System.out.println();
            System.out.println("++++++++++++");

            System.out.println("when you put a module on "+num1+" it's only take the remainder of the value.");
            System.out.println();
            int temp=num1/2;
            System.out.println("  "+temp+" ------->quotient");
            System.out.println(" ------");
            System.out.println("2|"+num1);
            System.out.println(" |" + temp*2);
            System.out.println(" |-----");
            int result=num1-temp*2;
            System.out.println(" |"+result+"-----> remainder");
            System.out.println();
            if (result==0){
                System.out.println("the remainder is 0 so the given number is even");
            }else if (result==1){
                System.out.println("the remainder is 1 so the given number is odd");
            }
        }
        else {
            System.out.println("******");
        }

    }
}