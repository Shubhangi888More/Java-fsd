package com.basics2;

 public class Throws_5
{
    void Division() throws ArithmeticException
    {
        int a=45,b=0,div;
div = a / b;
        System.out.print("\n\tThe result is : " + div);
    }
     public static void main(String[] args)
    {
    	 Throws_5 T = new Throws_5();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
         finally {
        System.out.print("\n\tEnd of program.");
    }}
}
