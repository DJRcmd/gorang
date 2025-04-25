package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound extends JFrame{
    public Sound(){
        JPanel p = new JPanel();
        JButton btn = new JButton("click");
        setSize(300, 300);
        setVisible(true);
        p.add(btn); // 패널에 버튼 추가
        getContentPane().add(p); //프레임 컨텐츠 영역에 패널을 추가
        btn.addActionListener(new ActionListener() { // 버튼을 클릭하면 audio 함수를 실행.
            @Override
            public void actionPerformed(ActionEvent e){
                audio();
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void audio(){
        try{
            File file = new File("home:/myjava/src/graphics/dingdong1.wav"); //사운드 파일의 경로.
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.loop(3);
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Sound();
    }

}
