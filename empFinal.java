final public class empFinal {
    int id;
    final String org = "kIEt";
        
   final void details(){
        System.out.println("Hello from empFinal"+" "+id + " " + org);
    }

    public static void main(String[] argvs){
        empFinal e = new empFinal();
        e.id = 67;
        // e.org = "ABES";
        e.details();   
        
    }
}

// class Faculty extends empFinal{

//     // void details(){
//     //     System.out.println("This is from faculty class" + " " + id + " " +org);
//     // }
//     public static void main(String[] argvs){
//     Faculty f = new Faculty();
//     f.details();


//     }
// }