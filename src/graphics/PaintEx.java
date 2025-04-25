package graphics;

import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintEx extends JFrame{
    public PaintEx(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g){ //프레임이 화면에 표시될 때 paint() 가 자동으로 호출된다. 모든 컴포넌트(컨테이너 포함)에는 graphics 기능이 포함되어있다.
        super.paint(g);
        g.drawString("hello java", 10, 60);
        System.out.println("Paint method 호출");
    }
    public static void main(String[] args) {
        new PaintEx();
    }
}
