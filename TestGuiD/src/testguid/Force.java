/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguid;


/**
 *
 * @author Saurya21
 */
public class Force
{

  private double force;
  private double mass;
  private double acceleration;

  public Force(double force, double mass, double acceleration)
  {
    this.force = force;
    this.mass = mass;
    this.acceleration = acceleration;
  }
  
  public Force()
  {
    this.force = 0;
    this.mass = 0;
    this.acceleration = 0;  
  }

  public double getForce()
  {
    return this.force;
  }

  public double getMass()
  {
    return this.mass;
  }

  public double getAcceleration()
  {
    return this.acceleration;
  }

  public void setForce(double force)
  {
    this.force = force;
  }

  public void setMass(double mass)
  {
    this.mass = mass;
  }

  public void setAcceleration(double acceleration)
  {
    this.acceleration = acceleration;
  }

  public double calculateForce(double m, double a)
  {
    double f;
    f = m * a;
    return f;
  }

  public double calculateMass(double f, double a)
  {
    double m;
    m = f / a;
    return m;
  }

  public double calculateAcceleration(double f, double m)
  {
    double a;
    a = f / m;
    return a;
  }

  public static void main(String[] args)
  {

    double result;
    Force objForce = new Force();
    result = objForce.calculateForce(3, 4);
    System.out.println("Force is " + result);
    result = objForce.calculateMass(8, 4);
    System.out.println("Mass is " + result);
    result = objForce.calculateAcceleration(12, 6);
    System.out.println("Acceleration is " + result);
  }
}
