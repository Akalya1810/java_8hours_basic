import java.util.Scanner;
class pro13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<50){
            System.out.println("improve ");
        }
        else if(n>50 && n < 70){
            System.out.println("good");
        }
        else if(n>70 ){
            System.out.println("Excellent");
        }
        else{
             System.out.println("no improvement");

        }
    }
}