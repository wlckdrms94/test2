import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i = N; i >= 1; i--) {
            for(int b = N; b >= i; b--){
                System.out.print("*");
            }
            if (i != 1){
                System.out.println();
            }
        }
        sc.close();
    }
}