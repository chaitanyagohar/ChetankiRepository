import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter the size:");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for(int i=1;i<=s;i++){
            for(int j=1;j<=i;j++){                
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 * 
 **
 ***
 **** 
 */