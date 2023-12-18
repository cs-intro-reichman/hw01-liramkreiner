/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle
{
    public static void main(String[] args)
     {
        //train represent sides of the triangle
        int train1 = Integer.parseInt(args[0]);
        int train2 = Integer.parseInt(args[1]);
        int train3 = Integer.parseInt(args[2]);
        boolean iftraingle = //checking if any side is grater than the sum of the other two
        (
            (train1 + train2) > train3 &
            (train2 + train3) >  train1 &
            (train1 + train3) > train2
        );
        //printing the sides of the traingle and if it fitts to the form
        System.out.println( train1 +", " + train2 + ", "+ train3 + ": " + iftraingle);
    }
}

