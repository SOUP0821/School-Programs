/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopleproject;

/**
 *
 * @author Saurya21
 */
public class Person
{
    // member variables
    private String name;
    private int grade;
    private int age;
    private String lastName;
    private int height;
    
    public Person()
    {
        this.name = "No Name";
        this.grade = 0;
        this.age = 0;
        this.lastName = "None";
        this.height = 0;
    }
    
    public Person(String n, int g, int a, String f, int h)
    {
        this.name = n;
        this.grade = g;
        this.age = a;
        this.lastName = f;
        this.height = h;
    }
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    //getters
    public String getName()
    {
        return this.name;
    }
    public int getGrade()
    {
        return this.grade;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getlastName()
    {
        return this.lastName;
    }
    public int getHeight()
    {
        return this.height;
    }
    
    public String toString()
    {
        return "Name of the person is " + this.name
                + "\nGrade of the the person is : " + this.grade
                    + "\nAge is : " + this.age
        +"\n The last name of the person is : " + this.lastName
                +"\n The height of the person is : " + this.height;
    }
    
}