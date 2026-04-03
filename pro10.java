import java.util.Scanner;
class pro10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income >7000){
            System.out.println("Scholarship");
        }
        else{
             System.out.println("not scholarship");

        }
    }
}