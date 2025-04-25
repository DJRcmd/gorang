package condition;

import java.util.Scanner;

public class Point1 {
    public static void main(String[] args) { // 다중 조건문
        Scanner sc = new Scanner(System.in); // 키보드 입력을 위해 Scanner 클래스를 사용 . new 연산자는 클래스로부터 새로운 객체를 만드는 명령어
        System.out.println("point:");
        int point = sc.nextInt(); // 키보드로 입력받은 값을 정수로 저장한다.
        String grade = "";
        if (point >= 90 && point <= 100) { // 점수가 90~100인 경우
            grade = "A";
        } else if (point >= 80 && point < 90) {
            grade = "B";  
        } else if (point >= 70 && point < 80) {
            grade = "C";
        } else if (point >= 60 && point < 70) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade:" + grade);
    }

}
