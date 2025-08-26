package KIET;

public class EmployeeKiet {
    public String Emp_name;
    protected int Emp_id;
    String Organisation;
    private int salary;

    void employeeDatails(){
        System.out.println("Details of kiet emp are :\n" + Emp_id + " " + Emp_name + " " + salary + " " + Organisation);
    }

    public static void main(String args[]){
        EmployeeKiet e1 = new EmployeeKiet();
        e1.Emp_name = "Yash";
        e1.salary = 9087653;
        e1.Emp_id = 4503;
        e1.Organisation = "CIA";
        e1.employeeDatails();
    }
}
