package oop;

public class Person2 {
    private String name;
    private int age;
    private double height;
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setAge(int age){
        if (age < 0 || age > 150) {
            System.out.println("error!");
        } else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println("Name" + name + ",Age" + age + "Height" + height);
    }
    // private 변수는 외부 클래스에서 사용할 수 없다.
    // private 변수에 입출력을 하기 위해서는 getter, setter가 필요하다
    // this 변수는 현재 오브젝트의 시작주소를 가르킨다

}