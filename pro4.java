import java.util.Scanner;
class pro4{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        double score = sc.nextDouble();
        sc.nextLine();
        String dept = sc.next();
        System.out.println("name : " +Name);
        System.out.println("score : " +score/10+"/10");
        System.out.println("Dept : " +dept);
         

    }
}