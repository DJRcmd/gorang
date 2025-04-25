package except;

public class ExceptionEx {
    public static void main(String[] args) {
        try{
        int a = 10, b = 0, c;
        c = a / b;
        System.out.println(c);
        System.out.println("end");
        } catch (Exception o) {
            o.printStackTrace();
        }
        System.out.println("end");
    }

}
