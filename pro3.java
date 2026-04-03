import java.util.Scanner;
class pro3{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a*b*c;
        int add = a+b+c;
        int e = d/add;
        System.out.println("final value : " +e);
         

    }
}