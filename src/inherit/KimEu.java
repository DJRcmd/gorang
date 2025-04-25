package inherit;

public class KimEu extends Sale {
    private int result;
    private double left;
    private double right;
    public void input(int code, String name, int price, int result){
        this.result = result;
    }
    public void calc(){
        left = getPrice() * left;
        right = getPrice() * right;
    }
    public void print(){
        System.out.println("Code:" + getCode());
        System.out.println("Name:" + getName());
        System.out.println("Price:" + getPrice());
        System.out.println("Result:" + result);
        System.out.println("Left:" + left);
        System.out.println("Right:" + right);
        
    }
        
}
