import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        if (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật ");
            System.out.println("2. In hình tam giác vuông ");
            System.out.println("3. In tam giác cân ");
            System.out.println("0. Thoát ");
            System.out.println("Nhập lựa chọn của bạn : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("In hình chữ nhật ");
                    System.out.print("Nhập chiều dài: ");
                    int height1 = sc.nextInt();
                    System.out.print("Nhập chiều rộng: ");
                    int width = sc.nextInt();
                    for (int i = 1; i <= width; i++) {
                        for (int j = 1; j <= height1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println(" In hình tam giác vuông");
                    System.out.print("Nhập chiều cao của tam giác: ");
                    int height2 = sc.nextInt();
                    for (int i = 1; i <= height2; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("In tam giác cân");
                    System.out.print("Nhập chiều cao của tam giác: ");
                    int height3 = sc.nextInt();
                    for (int i = 1; i <= height3; i++) {
                        for (int j = 1; j <= height3 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ ");
            }
        }
    }
}



