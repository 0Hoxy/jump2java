package Exercise.method;

public class ex11 {
    public static void main(String[] args) {
        //비만:30이상/ 과체중: 25이상 /정상: 18.5이상~25미만 /저체중:18.5 미만
        //체중과 키를 입력받아 BMI 지수를 반환하는 calculate()와 BMI지수를 통해 비만도 결과를 반환하는 result()
        //메소드를 완성하여, 출력 예와 같은 결과를 얻으시오. BMI= 몸무게/키(sqrt)
        //BMI: 26.34(81.6kg, 1.76m)
        //결과: 과체중입니다.
        double weight = 81.6;
        double height = 1.76;
        double result = weight / (height*height);
        System.out.printf("BMI: %.2f(%.1fkg, %.2fm)%n",result,weight,height);
        System.out.printf("결과: %s입니다.",calculate(result));
    }

    private static String calculate(double result) {
        if (result >= 30) {
            return "비만";
        } else if (result >= 25) {
            return "과체중";
        } else if (result >= 18.5 && result < 25) {
            return "정상";
        } else {
            return "저체중";
        }
    }
}


