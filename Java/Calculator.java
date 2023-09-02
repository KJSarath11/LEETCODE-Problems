import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator {
    
    public Calculator(){

    JFrame jf=new JFrame("Calculator");

    jf.setLayout(null);
    jf.setSize(600, 600);
    jf.setLocation(300, 130);

    JLabel displayLabel=new JLabel();
    displayLabel.setBounds(100,200,10,30);

    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new Calculator();

    }
}
