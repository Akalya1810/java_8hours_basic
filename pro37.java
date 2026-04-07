public class pro37 {
    void greeting()
    {
        System.out.println("hi");
        dummy();// function to function call pannalam

    }
    void dummy(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        pro37 obj1 = new pro37();// static to unstatic call pannamudiyaadhu adhukaaga dhan object create panranga
        obj1.greeting();
        obj1.dummy();

    }
    


    
}
