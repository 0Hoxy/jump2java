package Exercise.method;

public class ex13 {
    public static void main(String[] args) {

        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }    private static void printPay(double basePay, double time) {
        double pay = (basePay*time);
        double overtimePay = (time-40)*basePay*0.5;
        if (time>60) System.out.println("초과 근무시간 에러!");
        else if (time>40) System.out.printf("$ %.2f%n", pay+overtimePay);
        else if (basePay<8) System.out.println("최저 시급 에러!");
        else System.out.printf("$ %.2f%n", pay);
    }
}