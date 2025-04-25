package metgod;

public class VoidEx { //void = 리턴값이 없는 함수에 사용한다.
    static void hello() { // 정적 함수, 프로그램을 시작할 때 곧바로 사용할 수 있는 함수. static이 아닌 함수는 new 연산자로 오브젝트를 만든 후 사용.
        System.out.println("hello");
    }
    public static void main(String[] args) { 
        System.out.println("start");
        hello(); // main 함수 실행을 잠시 멈추고 hello 함수를 실행한다.
        System.out.println("end");
    }

}
