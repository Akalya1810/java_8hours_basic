import java.util.Scanner;
public class pro31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i =0;i<=n-1;i++){
            a[i]=sc.nextInt();

        }
        System.out.println(a[0+n/2]);
    }
}
