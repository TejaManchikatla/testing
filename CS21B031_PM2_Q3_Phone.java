import java.util.*;

abstract class Phone{
    protected abstract void getOS();
    public abstract void getDefaultBrowser();
    private String name;
    protected void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void calling(){
        System.out.println("Calling from " + getName() + " Phone");
    }

}

class Android extends Phone{

    Android(String n){
        setName(n);
    }

    protected void getOS(){
        System.out.println("OS: Android");
    }
    public void getDefaultBrowser(){
        System.out.println("Chrome");
    }
    
    
    
    

}
class IOS extends Phone{


    IOS(String n){
        setName(n);
    }

    protected void getOS(){
        System.out.println("OS: IOS");
    }
    public void getDefaultBrowser(){
        System.out.println("Safari");
    }

}


public class CS21B031_PM2_Q3_Phone{
    public static void main(String[] args) {
        
        Android an = new Android("Teja");
        IOS io = new IOS("Preetham");
        Phone p = new Android("Sridhar");
        

        p.getOS();

        an.calling();
        an.getOS();
        an.getDefaultBrowser();

        io.calling();
        io.getOS();
        io.getDefaultBrowser();

    }
}

// Access Modifiers for calling() method;
// public - No problem . Gave output as expected.
// protected - No problem. Gave output as expected.
// private - Did not show output. Gave errors. 
// no access modifier - No problem. Gave output as expected.


// Access Modifiers for abstract methods in abstract class Phone
// public - 
// private - Giving error. When you use private access modifier, you cannot access it from other classes
//            not even from the subclasses. But you have to override the abstract methods in subclasses
//            to define them and use them. So you cannot make them private.
// protected - When you use protected, then you can access only through subclasses.

