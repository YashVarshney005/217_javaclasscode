public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;
    EmployeeCopyConstructor(int i, String name){
        Emp_id = i;
        this.Emp_name = name;

    }

    EmployeeCopyConstructor(EmployeeCopyConstructor e2){
        Emp_id = e2.Emp_id;
        this.Emp_name = e2.Emp_name;

    }
    void print_info(){
        System.out.println("Details of the employee are:" +Emp_id + " " +Emp_name);
    }

    public static void main(String argvs[]){
        EmployeeCopyConstructor e1 = new EmployeeCopyConstructor(1234,"abc");
        e1.print_info();
        EmployeeCopyConstructor e2 = new EmployeeCopyConstructor(e1);
        e2.print_info();
        e2.Emp_id = 300;
        e2.Emp_name = "Yash";
        e2.print_info();
        e1.print_info();
        
    }
}
