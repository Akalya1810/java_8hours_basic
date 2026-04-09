import java.util.Scanner;
public class pro43 { // school
        String passorfail(int n)
    {
        if(n<35){
            return "fail";
        }
        else{
            return "pass";
        }
        

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pro43 obj1 = new pro43();
        String result =  obj1.passorfail(n);
        System.out.println(result);

    }
}
