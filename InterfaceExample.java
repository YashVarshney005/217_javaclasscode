

interface Institute{
    void Register();
    void Infrastructure();
    void Students();
    void Staff();
    
    static void staticConcrete(){
        System.out.println("Static concrete method inside interface");
    }
    default void defConcrete(){
        privateConcrete();
        System.out.println("Default concrete method inside interface");
    }
    private void privateConcrete(){
        System.out.println("Private concrete method inside interface");
    }

}
class ABES implements Institute{
    public void Register(){
        System.out.println("Kiet is registered");
    }
    public void Infrastructure(){
        System.out.println("Kiet has digital classroom");
    }
    public void Students(){
        System.out.println("Admission open");
    }
    public void Staff(){
        System.out.println("Kiet has staff");
    }
    

}


public class InterfaceExample {
    public static void main(String[] args) {
        Institute ii;
        ii = new ABES();
        ii.Infrastructure();
        ii.Register();
        ii.Students();
        ii.Staff();

        Institute.staticConcrete();
        ii.defConcrete();


    }
}
