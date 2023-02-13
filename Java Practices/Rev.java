import java.util.Scanner;

class Reverse {
    public static void main(String args[])
    {
        int n,r=0,d;
        System.out.println(" Enter number ");
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        while(n>0)
        {
            d = n%10;
            r = r*10+d;
            n = n/10;
            System.out.println("Reverse is" + r);
        }
    }
    
}
