class Emp{

    String name;
    int id;
    String org;
    void EmpDetails(){
        System.out.println(id+ " " +org+" " +name);
    }

}

class Faculty extends Emp{

    String  dept;
    String subj;
    void facultyDetails(){
        System.out.println(dept + " " +subj);
    }
}


public class inheritance_single {


    public static void main(String[] args) {
        Faculty f = new Faculty();
        f.name = "Yash";
        f.id = 908;
        f.org = "KIET";
        f.dept = "AI";
        f.subj = "Machine Learning";
        f.EmpDetails();
        f.facultyDetails();
    }
}
