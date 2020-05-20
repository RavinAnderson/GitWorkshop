public class Division
{
    /*create a function that takes in two integers.
        It divides the first by the second and prints the equation with the result.
        ie: "4 / 2 = 2"
        Afterwards, create a case in the switch statement in Main.java
        and call your function.
    */

	public static void divide(int a , int b){
		double calc = (double)a / b;
		System.out.println(a + " / " + b + " = " + calc);
	}
}
