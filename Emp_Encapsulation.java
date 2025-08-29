import java.util.Scanner;

class EmployeeEncap{
    private int Acc_balance;
    private int  upi_pin = 99899;

    public void setBalance(int balance){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter upi pin: ");
        int pin = sc.nextInt();
        if(pin == upi_pin){
            Acc_balance = balance;
            System.out.println("Congrats salary is accredited");
        }else System.out.println("Wrong pin");
        
    }
    
    public int getBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("To know the balance please enter upi pin: ");
        int pin = sc.nextInt();
        
        if(pin == upi_pin){
            System.out.println("Available balance is: "+Acc_balance);
            return Acc_balance;
        }else System.out.println("Wrong pin");
        return -1;
    }
}




public class Emp_Encapsulation {
    public static void main(String[] args) {
        EmployeeEncap ee = new EmployeeEncap();
        ee.setBalance(900000);

        ee.getBalance();
    }
    
}
