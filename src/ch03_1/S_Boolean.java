package ch03_1;

public class S_Boolean {
    public static void main(String[] args) {
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if(isTall){
            System.out.println("키가 큽니다.");
        }

        int i = 3;
        boolean isOdd = i%2 == 1;
        System.out.println(isOdd);
    }
}
