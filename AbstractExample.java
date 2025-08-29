

abstract class College{
    abstract void Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalFacility(){
        System.out.println("Medical facilities are optional");
    }

}
class KIET extends College{
    void Register(){
        System.out.println("Kiet is registered");
    }
    void Infrastructure(){
        System.out.println("Kiet has digital classroom");
    }
    void Students(){
        System.out.println("Admission open");
    }
    void Staff(){
        System.out.println("Kiet has staff");
    }
    // void medicalFacility(){
    //     System.out.println("it has");
    // }
}


public class AbstractExample {
    public static void main(String[] args) {
        College cg;
        cg = new KIET();
        cg.Infrastructure();
        cg.Register();
        cg.Students();
        cg.Staff();
        cg.medicalFacility();
    }
}
