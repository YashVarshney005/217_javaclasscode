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


class Faculty extends EmployeePoly{
    @Override
    void details(){
        super.details();
        System.out.println("Welcome faculties");
    }
}

public class Polymorphism_Dynamic {
    public static void main(String[] args) {
        Faculty x = new Faculty();
        x.Emp_name = "Yash Varshney";
        x.details();
        
    }
}
