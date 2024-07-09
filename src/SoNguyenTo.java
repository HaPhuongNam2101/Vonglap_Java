import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println("Không phải là số nguyên tố " + number);
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println("Là số nguyên tố " + number);
            else
                System.out.println("Không phải là số nguyên tố " + number);

        }
    }
}
