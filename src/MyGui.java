import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui extends JFrame implements ActionListener {
    JButtonHello(){
        JFrame frame = new JFrame();

        JButton b = new JButton("Hello");
        b.setBounds(50, 50, 90, 50);
        frame.add(b);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(null, "Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
/*Question 4 (d)
Inheritance can be used in GUI as it can inherit images, colours and objects from other classes.
GUI is based around inheritance as without inheritance there is not much use for the GUI as it would just be empty.
 */
