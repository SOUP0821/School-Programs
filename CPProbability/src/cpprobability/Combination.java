/*
 This program models the equation for combinations
 */
package cpprobability;

/**
 *
 * @author Saurya21
 */
public class Combination
{
    //defining variables
    private int num1;
    private int num2;
    private int result;
    
    public Combination()
    {
        this.num1 = 0;
        this.num2 = 0;
        this.result = 0;
    }
    public Combination(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0;
    }
    
    public int getNum1() //getter
    {
        return num1;
    }
    
    public void setNum1(int num1) //setter
    {
        this.num1 = num1;
    }
    
    public int getNum2() //getter
    {
        return num2;
    }
    
    public void setNum2(int num2)//setter
    {
        this.num2 = num2;
    }
    
     public int getResult()//getter
    {
        return result;
    }
     
    public void setResult()//setter
    {
        //equation for combination
        this.result = FactorialMethod.factorial(this.num1)/((FactorialMethod.factorial(this.num1))*FactorialMethod.factorial(this.num1 - this.num2));
    }
    
    
    public static void main(String[] args)
    {
        //test
        Combination objectAdd = new Combination(5,4);
        objectAdd.setResult();
        System.out.println("the probability is : " + objectAdd.getResult());
    }
}
