/*
Saurya Nannapaneni 1/10/2020
This program models classes and objects
 */
package peopleproject;


/**
 *
 * @author Saurya21
 */
public class PersonRunner
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Person p1 = new Person();
        p1.setName("Juan");
        p1.setAge(15);
        p1.setGrade(9);
        p1.setlastName("Hidrowoh");
        p1.setHeight(5);
        
        Person p2 = new Person("Tom" ,6 , 12, "Ford", 6);
        System.out.println(p2);
        
        Person p3 = new Person("Bob", 12, 8, "Davis", 6);
        System.out.println(p3);
        
        
        Person p4 = new Person();
        p4.setName("Shahmeer");
        p4.setAge(15);
        p4.setGrade(9);
        p4.setlastName("Razzak");
        p4.setHeight(5);
        
        
        System.out.print("Name of the person is :  ");
        System.out.println(p1.getName());
        System.out.print("Grade of the person is : ");
        System.out.println(p1.getGrade());
        System.out.print("Age is : ");
        System.out.println(p1.getAge());
        System.out.println();
        
        System.out.print("Name of the person is :  ");
        System.out.println(p4.getName());
        System.out.print("Grade of the person is : ");
        System.out.println(p4.getGrade());
        System.out.print("Age is : ");
        System.out.println(p4.getAge());
        System.out.print("Last Name is : ");
        System.out.println(p4.getlastName());
        System.out.print("The height of the person is : ");
        System.out.println(p4.getHeight());
        
        
    }
    
}
