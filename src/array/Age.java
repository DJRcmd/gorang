package array;

public class Age {
    public static void main(String[] args) {
        String[] names = {"김", "박", "현"};
        int[] year = {2000, 2010, 2003};
        int[] age = new int [3];
        for (int i = 0; i < names.length; i++){
            age[i] = 2025 - year[i];
        }
        System.out.println("이름\t연도\t나이");
        System.out.println("===========================");
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + "\t" + year[i] + "\t" + age[i]);
        }
    }

}
