public class hi {

    private static String p = "Hello ji";


    public static class hello{
        public void message(){
            System.out.println("The message is: " + p);
            
        }

    }
    public static void main(String args[]){
        hello n = new hello();
        n.message();
    }
}
