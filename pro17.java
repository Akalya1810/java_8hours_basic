import java.util.Scanner;
class pro17{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int age = sc.nextInt();
        int loan = sc.nextInt();
        if(salary>=20000 && age<=25 ){
            if(loan<=50000){
                System.out.println("You are eligible for loan");
            }
            else{
                System.out.println("loan amount 50000");
            }
            


        }
        else{
            System.out.println("not eligible");
        }
    }
}