import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if(N <= 100000){
            for(int i = N; i > 0; i--) {
                System.out.println(i);
            }
        } else{
            System.out.print("범위를 벗어납니다.");
        }
        sc.close();
    }
}