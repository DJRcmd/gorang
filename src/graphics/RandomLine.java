package graphics;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class RandomLine extends JFrame{
    private Random random;

    public RandomLine(){
        random = new Random();
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g){
        g.clipRect(100, 100, 100, 100); // 화면 일부로 축소 
        for (int i = 0; i < 100; i++){
        int yellow = random.nextInt(256);
        int black = random.nextInt(256); 
        int blue = random.nextInt(256);
        g.setColor(new Color(yellow,black,blue));
        int x1 = random.nextInt(300); 
        int y1 = random.nextInt(300);
        int x2 = random.nextInt(300);
        int y2 = random.nextInt(300);
        g.drawLine(x1, y1, x2, y2);
    }
}
public static void main(String[] args) {
    new RandomLine();
}
}
