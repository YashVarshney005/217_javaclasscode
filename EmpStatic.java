public class EmpStatic {
    
    int id;
    static String org;//static krne ke baad ab baar baar hr obj ke liye declare nhi krna padega
    static{
        org = "KIEt";
    }
    static void staticmethod(){
        System.out.println("This is a static method");
    }
    void details(){
        System.out.println(id + " " + org);
    }

    public static void main(String[] argvs){
        EmpStatic e = new EmpStatic();
        e.id = 67;
        // e.org = "ISI";
        e.details();

        EmpStatic e2 = new EmpStatic();
        e2.id = 697;
        // e2.org = "OISI";
        e2.details();
        staticmethod();
        
    }
}
