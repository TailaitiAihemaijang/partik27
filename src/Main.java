import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/14/2023 12:16 PM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int n1 = input.nextInt();
        System.out.print("ikkinci sayi giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        for (int i = 1; i <= n1; i++){
            if (n1 % i ==0 && n2 % i ==0){
                ebob = i;
            }
        }
        System.out.println(ebob);
    }
}
