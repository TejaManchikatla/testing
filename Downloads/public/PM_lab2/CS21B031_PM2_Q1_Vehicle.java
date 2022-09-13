
import java.util.*;

abstract class Vehicle{
    abstract String vehicleType();
    abstract String vehicleColor();
    protected abstract String vehicleNumber();
    abstract void printInfo();
}

//It shows an error when any method in class Vehicle is made private.



interface Safety{
    double rating();
    boolean airbags();
    boolean seatBelts();
}

interface Seats{
    int numberOfSeats();
    String seatType();
    String seatFormat();

}

abstract class Car extends Vehicle{

    String vehicleType(){
        return "Car";
    }
    
}

class customCar extends Car implements Safety, Seats{
    
    String vehicleColor(){
        return "Blue";
    }
    protected String vehicleNumber(){
        return "TS";
    }


    public double rating(){
        return 4.85;
    }
    public boolean airbags(){
        return true;
    }
    public boolean seatBelts(){
        return true;
    }
    public int numberOfSeats(){
        return 8;
    }
    public String seatType(){
        return "White, Comfy and Foldable.";
    }
    public String seatFormat(){
        return "2, 3, 3";
    }


    

    void printInfo(){
        System.out.println(this.vehicleType());
        System.out.println(this.vehicleColor());
        System.out.println(this.vehicleNumber());

        System.out.println(this.rating());
        System.out.println(this.airbags());
        System.out.println(this.seatBelts());

        System.out.println(this.numberOfSeats());
        System.out.println(this.seatType());
        System.out.println(this.seatFormat());
    }
}

public class CS21B031_PM2_Q1_Vehicle{

    

    public static void main(String []args){
        
        Vehicle maruti = new customCar();
        maruti.printInfo();
    }
}


// Vehicle maruti = new customCar()   
// if printInfo() was not declared in abstract class vehicle
// Then I had to print Safety and Seats methods as

//   printInfo(Vehicle v){
//      ((Safety) v).rating();
//       ((Safety) v).airbags();
// }


    //We can also implement Safety and Seats into Vehicle and access the 
    // interface variables from it.
    // like 
    //  Vehicle v = new customCar();
    //  v.rating();
