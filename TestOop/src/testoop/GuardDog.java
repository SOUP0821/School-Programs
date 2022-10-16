/*
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
public class GuardDog extends Dog
{

  private String breed;

  // create constructor 
  // class name and constructor name need to be the same
  public GuardDog(String name, int age, String color, String breed)
  {
    // It must be very first statement 
    // 4 attributes because of Dog Class
    super(name, age, color);
    this.breed = breed;
  }

  public void setBreed(String breed)
  {
    this.breed = breed;
  }
  
  //overide
  @Override
  public void barking(String a)
  {
    System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    super.barking(a);
  }

  public String getBreed()
  {
    return this.breed;
  } 

  // Static methods cant be overwritten but can be overloaded
  public static void main(String[] args)
  {
    GuardDog obj3 = new GuardDog("Big Joe", 5, "White", "Poodle");
    obj3.setName("Buster");
    System.out.println(obj3.getName());
    obj3.barking("Ooooooooohhhhhhh");
  }
}


