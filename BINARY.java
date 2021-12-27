
package number.system;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class BINARY 
{
    public static void main(String[] args) 
    {

        p2 obj = new p2();
    } 
}
class p2 extends JFrame 
        
{     
      
      JTextField t;
      JLabel l0,l1,l2,l3,l4;
      JButton b1,b2,b3;

    public p2()
    {
        t = new JTextField(20);
         b1 = new JButton("convert");
         b2 = new JButton("Back to menu");
         b3 = new JButton("refresh");
         l0 = new JLabel("(input should be in 1s,0s) ");
         l1 = new JLabel("ENTER YOUR BINARY NO : ");
         l2 = new JLabel();
         l3 = new JLabel();
         l4 = new JLabel();
        add(l1);
        add(l0);
        add(t);
        add(b1);
        add(l2);
        add(l3);
        add(l4);
        add(b3);
        add(b2);
        
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
             {
                 t.setText(""); 
               b1.setText("convert");
                l2.setText("");
                l3.setText("");
                l4.setText("");
             }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
             {
                 new P1();
                 dispose();
             }
        });
        
        b1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e) 
             {
                String num = t.getText(); 
                int a = Integer.parseInt(num,2);
                b1.setText("converted");
                l2.setText("Decimal no is :"+a);
                l3.setText("Octal no is :"+Integer.toOctalString(a));
                l4.setText("Hexadecimal no is : "+Integer.toHexString(a));
                
              }

         });
        
        
        b1.setBounds(300, 180, 100, 100);
        b2.setBounds(300, 180, 100, 100);
        b3.setBounds(300, 180, 100, 100);
        setLayout(new FlowLayout(FlowLayout.CENTER,150,25));
        setVisible(true);
        setSize(400, 450);
        setDefaultCloseOperation(1); 
    }    
    
}
        
