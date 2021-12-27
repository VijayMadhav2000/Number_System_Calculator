
package number.system;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NUMBERSYSTEM{
    public static void main(String[] args) {
        
    
    P1 obj = new P1();
    } 
}
class P1 extends JFrame 
        
{
     JButton b1,b2,b3,b4; 
    public P1()
    {
         JFrame f= new JFrame("NUMBER SYSTEM CONVERSTIONS"); 
         b1 = new JButton(" Binary to all");
         b2 = new JButton(" octal to all ");
         b3 = new JButton("decimal to all");
         b4 = new JButton("  hexa to all ");
         
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        b1.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e)
             {
                 new p2();
                 //f.dispose();
                 f.setVisible(false);
             }
        });
        b2.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e)
             {
                 new p4();
                 f.dispose();
             }
        });
        b3.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e)
             {
                 new p3();
                 f.dispose();
             }
        });
        b4.addActionListener(new ActionListener() 
        {
             public void actionPerformed(ActionEvent e)
             {
                 new p5();
                 f.dispose();
             }
        });
        f.setLayout(new FlowLayout(FlowLayout.CENTER,100,45));  
        f.setVisible(true);
        f.setSize(400, 450);
        f.setDefaultCloseOperation(1);
    }

   

}