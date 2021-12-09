import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class Main extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private Main(){
        this.setSize(1800, 1000);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("main.jpg")), SwingConstants.CENTER);
        getContentPane().add(imgLabel);
    }

    public static void main(String[] args) {
        Main mf = new Main();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}