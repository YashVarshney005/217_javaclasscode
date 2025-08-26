import java.util.*;
public class emplo {
    Scanner sc = new Scanner(System.in);

    

    int salary;
    String name;

    public void getInfo(){
        System.out.println("Hello from display method");
        System.out.println("Details are : "+salary + " " +name);
    }



    public static void main(String argvs[]){
        Scanner sc = new Scanner(System.in);
        emplo m1 = new emplo();
        int s = sc.nextInt();
        String n = sc.nextLine();
        m1.salary = s;
        m1.name = n;
        m1.getInfo();
        sc.close();
    }
}


