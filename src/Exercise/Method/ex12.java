package Exercise.method;

public class ex12 {
    public static void main(String[] args) {
        //한 소개팅 어플은 다음 요소를 기준으로 회원을 평가하여 점수화(0.0~5.0)한다.
        //성격 외모 능력
        //아래의 등급 기준을 참고하여, 출력 예와 같은 결과를 얻으시오.
        //A-모든 요소가 4.0이상 B-총점 10점 이상이면서, 적어도 하나가 4.0이상 C-그 외
        // X -> A등급
        // Y -> B등급
        // Z -> C등급
        String x = rating(4.2, 4.7, 4.3);
        String y = rating(3.8, 4.1, 3.5);
        String z = rating(3.6, 3.0, 3.4);

        System.out.printf("X -> %s등급%n", x);
        System.out.printf("Y -> %s등급%n", y);
        System.out.printf("Z -> %s등급%n", z);
    }

    private static String rating(double character, double looks, double ability) {
        String result = "";
        double sum = character + looks + ability;
        if (character >= 4 && looks >= 4 && ability >= 4) {
            return "A";
        } else if (sum >= 10 && (character >= 4 || looks >= 4 || ability >= 4)) {
            return "B";
        } else {
            return "C";
        }
    }
}
