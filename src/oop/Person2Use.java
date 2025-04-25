package oop;

public class Person2Use {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.setName("kim");
        p1.setAge(50);
        p1.setHeight(180);
        System.out.println("Name:" + p1.getName());
        System.out.println("Age:" + p1.getAge());
        System.out.println("Height:" + p1.getHeight());
        // 외부에서 private 변수에 접근할 수 없기에 대신 public 함수를 사용하여 값을 전달한다

    }

}
