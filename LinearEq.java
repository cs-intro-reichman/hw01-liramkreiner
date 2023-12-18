/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq
{
    public static void main(String[] args)
    {
       // a b c represent the value like the original equation  

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c =  Double.parseDouble(args[2]);
        System.out.println(a + " * x "+ b + " = " + c);//printing the equation  𝑎 * 𝑥 + 𝑏 = c
        System.out.println("x = "+ (c-b)/a); //printing the result
    }
}
