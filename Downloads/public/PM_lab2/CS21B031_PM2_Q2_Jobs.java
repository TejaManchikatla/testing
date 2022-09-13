import java.util.*;

interface SoftwareDeveloper{
    public void writeCode();
    public void maintainCode();
    public void getSalary();
}

interface Plumber{
    public void cleanPipes();
    public void repairTap();
    public void getSalary();
}

class Person implements SoftwareDeveloper, Plumber{

    public void writeCode(){
        System.out.println("Code is being written. Nigga!");
    }
    public void maintainCode(){
        System.out.println("Yes, I am doing it. Can't you see, blind man!?");
    }

    public void getSalary(){
        System.out.println("Pay me 500000");
    }
    public void cleanPipes(){
        System.out.println("Yes, I know how to clean pipes");
    }
    public void repairTap(){
        System.out.println("Paani jaa raha hai!!!");
    }

    
    
}


// The method getSalary() is same in both the interfaces. However if the return type was different i.e., 
//  int getSalary() for Software and double getSalary() for Plumber, then it would throw a compilation error.

//So we are unable to print different salaries for different occupations of the same person

public class CS21B031_PM2_Q2_Jobs {
    public static void main(String[] args){

        Person p = new Person();
        ((SoftwareDeveloper)p).getSalary();
        p.writeCode();
        p.maintainCode();
        p.cleanPipes();
        p.repairTap();
        ((Plumber)p).getSalary();
        p.getSalary();
    }
}
