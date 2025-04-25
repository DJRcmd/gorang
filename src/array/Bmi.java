package array;

public class Bmi {
    public static void main(String[] args) {
        double[] kg = {70.1, 75.2, 60.3, 76.4, 55.5};
        double[] height = { 170.1, 174.2, 160.3, 155.2, 180.2};
        double[] bmi = new double[5];
        String[] result = new String[5];
        for (int i = 0; i < kg.length; i++) {
        height[i] = height[i] / 100;
        bmi[i] = kg[i] / (height[i] * height[i]);
        if (bmi[i] < 18.5) {
            result[i] = "저체중";
        } else if (bmi[i] >= 18.5 && bmi[i] < 23) {
            result[i] = "정상";
        } else if (bmi[i] >= 23 && bmi[i] < 25) {
            result[i] = "과체중";
        } else if (bmi[i] >= 25) {
            result[i] = "비만";
        }
        }
        System.out.println("신장\t체중\tbmi\t결과");
        System.out.println("==================================");
        for (int i = 0; i < kg.length; i++) {
            System.out.println(height[i] * 100 + "\t" + kg + "\t" + String.format("%.2f", bmi[i]) + "\t" + result[i]);
        }
    }

}
