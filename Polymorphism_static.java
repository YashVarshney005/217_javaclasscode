class EmployeePoly{
    String Emp_name;

    void details(){
        System.out.println("Name: "+Emp_name);
    }

    void details(int salary, String institute){
        System.out.println("Salary: "+salary + ", Institue name = "+ institute);
    }

    void details(String institute){
        System.out.println("Institue name: "+institute);
    }
    void details(String institue, int salary){
        System.out.println(institue+ " " + salary);
    }
}

public class Polymorphism_static {
    public static void main(String[] args) {
        EmployeePoly x = new EmployeePoly();
        x.Emp_name = "Yash Varshney";
        x.details();
        x.details(100000,"Kiet");
        x.details("KIET");
        x.details("kiet", 9087694);
    }
}
