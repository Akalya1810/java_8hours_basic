import java.util.Scanner;
public class pro42 {  // find class
    void evenorodd(int n)
    {
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
       




    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         pro42 obj1 = new pro42();
         obj1.evenorodd(n);

    }

    
}
