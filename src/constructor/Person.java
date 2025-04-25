package constructor;

public class Person {
    private String name;
    private int height;
    private int weight;
    public Person(){
        this("Kim",150,100);
    }
    public Person(String name){
        this(name,190,100);
    }
    public Person(String name, int height){
        this(name,height,50);
    }
    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void showlnfo(){
        System.out.println("===info===");
        System.out.println("Name:" + name);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
    }

    // 7 - this()는 현재 클래스의 다른 생성자 함수를 호출한다.
    // this.변수는 현재 클래스의 멤버 변수를 가리킨다.
}
