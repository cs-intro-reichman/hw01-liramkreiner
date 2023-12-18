/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins 
{
    public static void main(String[] args) 
    {
        //convert to int the input from user and than check how many quater and cent i need to use
        int ammount =  Integer.parseInt(args[0]);
        System.out.println("Use " + (ammount/25) + " quarters and " + (ammount%25) +" cents");//printing how many quaters and cents we can use that we use minimally ammount of cents that we could
    }
}
