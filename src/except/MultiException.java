package except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        int num = 50;
        Scanner sc = null; // 다양한 조건의 예외처리 가능
        try{
            System.out.println("숫자를 입력하세요"); // 이 라인이 없으면 예외가 발생
            sc = new Scanner(System.in);
            int value = sc.nextInt();
        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch (InputMismatchException e){
            System.out.println("InputMismatchException");
        } catch (Exception e){ // Exception 코드는 제일 아래에 작성
            System.out.println("Other Exception");
        } finally{ // 예외처리 후 마지막으로 경유하는 코드
            if (sc != null)
            sc.close();
        }
        System.out.println("end");
    }

}
