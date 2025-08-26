public class methodCode {
    

    int id;
    String name;

    public void displayMethod(){
        System.out.println("Hello from display method");
        System.out.println("Details are : "+id + " " +name);
    }



    public static void main(String argvs[]){
        methodCode m1 = new methodCode();
        m1.id = 101;
        m1.name = "Yash";
        m1.displayMethod();


    }
}
