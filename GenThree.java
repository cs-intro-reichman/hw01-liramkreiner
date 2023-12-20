/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree
{
    public static void main(String[] args)
     {
        //getting the border for genrate the number
        int bordermin = Integer.parseInt(args[0]);
        int bordermax = Integer.parseInt(args[1]);
        int counter = 0;
        int minnumber = bordermax;
        while (counter<3)
        {
            //genrate number for the same range that we get by minus of (bordermax - bordermin), by this we get the same amount of number that coule possibly can been genrate
            // than we add the bordermin in order to get the real range that we inttend to genrate since we have the same amount of opption we can get
            int randomnumber = (int)(Math.random() * (bordermax - bordermin)) + bordermin;
            System.out.println(randomnumber);
            if (minnumber>randomnumber) //checking if the cuurent number that we have genrate is grater than the previous unmber(the bordermax is the first min number but it allways change since this number is not in the range)
                minnumber = randomnumber;
            counter ++;
        }

        //printing the min number that we have genrate
         System.out.println("The minimal generated number was "+ minnumber);

    }
}
