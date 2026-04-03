import java.util.Scanner;
class pro13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>35 && n<60){
            System.out.println("video game ");
        }
        else if(n>60 && n < 90){
            System.out.println("mac book");
        }
        else if(n>90 ){
            System.out.println("iphone");
        }
        else{
             System.out.println("no gift");

        }
    }
}