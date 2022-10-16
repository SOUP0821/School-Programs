//*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package testoop;
//
///**
// *
// * @author Saurya21
// */
public class Dog
{

  private String name;
  private int age;
  private String color;

  public Dog(String name, int age, String c)
  {
    // Data Fields in programming
    // Class Variables
    // age Instance variables
    this.name = name;
    this.age = age;
    color = c;
  }

  public Dog()
  {
    this.name = "";
    this.age = 0;
    color = "";
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  public int getAge()
  {
    return this.age;
  }
  
  public void setAge(int age)
  {
    this.age = age;
  }
  public String getColor()
  {
    return this.color;
  }
  
  public void setColor(String c)
  {
    this.color = c;
  }

  public void barking()
  {
    System.out.println("woof woof");
  }
  // overloading barking method
  public void barking (String sound)
  {
    System.out.println(sound);
  }

  public static void main(String[] args)
  {
    //Dog.barking();
    Dog objDog1 = new Dog("Nemo", 4, "Beige");
    System.out.println(objDog1.name);
    Dog objDog2 = new Dog("Joe", 120, "gray");
    objDog1.name = "My Cousin Vinny";
    System.out.println(objDog2.name);
    System.out.println(objDog1.name);
  }

}
