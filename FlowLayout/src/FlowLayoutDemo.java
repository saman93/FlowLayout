import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.add(new JButton("Button 1"), FlowLayout.LEFT);
        panel1.add(new JButton("Button 2"), FlowLayout.CENTER);
        panel1.add(new JButton("Button 3"), FlowLayout.RIGHT);
        panel2.add(new JButton("Button 4"), FlowLayout.LEFT);
        panel2.add(new JButton("Button 5"), FlowLayout.CENTER);
        panel2.add(new JButton("Button 6"), FlowLayout.RIGHT);;
        
        JFrame frame = new JFrame("FlowLayout Demo"); 
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(panel1);
        frame.add(panel2);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

	}

}
