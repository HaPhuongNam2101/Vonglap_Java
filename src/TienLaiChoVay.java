import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn vay : ");
        double money = sc.nextDouble();
        System.out.println("Nhập số tháng : ");
        int month = sc.nextInt();
        System.out.println("Nhập lãi suất năm theo % : ");
        double interestRate = sc.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("Tổng số tiền lãi : " + totalInterest);
        }

    }
}
