/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurya21
 */
public class Probability
{
    private int prob1;
    private int prob2;
    private int result;
    
    public Probability()
    {
        this.prob1 = 0;
        this.prob2 = 0;
        this.result = 0;
    }
    public Probability(int num1, int num2)
    {
        this.prob1 = num1;
        this.prob2 = num2;
        this.result = 0;
    }
    
    public int getProb1()
    {
        return prob1;
    }
    
    public void setProb1(int num1)
    {
        this.prob1 = num1;
    }
    
    public int getProb2()
    {
        return prob2;
    }
    
    public void setProb2(int prob2)
    {
        this.prob2 = prob2;
    }
    
     public int getResult()
    {
        return result;
    }
     
    public void setResult()
    {
        this.result = this.prob1 / this.prob2;
    }
    
    
    public static void main(String[] args)
    {
        Probability objectDivide = new Probability(4,5);
        objectDivide.setResult();
        System.out.println("the probaility is is : " + objectDivide.getResult());
    }
}

