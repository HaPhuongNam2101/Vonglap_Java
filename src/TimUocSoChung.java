import java.util.Scanner;

public class TimUocSoChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung lớn nhất: ");
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
                System.out.println("Ước số chung lớn nhất của 2 số : " + a);

            }
        }
    }
}
