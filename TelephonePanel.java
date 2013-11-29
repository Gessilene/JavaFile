//************************************************************
// TelephonePanel.java
//
// Lays out a (functionless) GUI like a telephone keypad with a title.
// Illustrates use of BorderLayout and GridLayout.
//************************************************************
import java.awt.*;

import javax.swing.*;

    public class TelephonePanel extends JPanel
    {
        public TelephonePanel()
        {            
            //set BorderLayout for this panel
            this.setLayout(new BorderLayout());
            
            //create a JLabel with "Your Telephone" title
            JLabel telephoneLabel = new JLabel("Your Telephone!!");                  
            
            //add title label to north of this panel
            JPanel title = new JPanel();
            title.add(telephoneLabel);

            //create panel to hold keypad and give it a 4x3 GridLayout
            JPanel keypad = new JPanel();
            keypad.setPreferredSize(new Dimension(230,270));
            keypad.setLayout(new GridLayout(4, 3));
            //telephoneLabel.add(keypad);
            
            //add buttons representing keys to key panel
            JButton button1 = new JButton ("1");
            JButton button2 = new JButton ("2");
            JButton button3 = new JButton ("3");
            JButton button4 = new JButton ("4");
            JButton button5 = new JButton ("5");
            JButton button6 = new JButton ("6");
            JButton button7 = new JButton ("7");
            JButton button8 = new JButton ("8");
            JButton button9 = new JButton ("9");
            JButton button10 = new JButton ("*");
            JButton button11 = new JButton ("0");
            JButton button12 = new JButton ("#");
         
            keypad.add (button1);
            keypad.add (button2);
            keypad.add (button3);
            keypad.add (button4);
            keypad.add (button5);
            keypad.add (button6);
            keypad.add (button7);
            keypad.add (button8);
            keypad.add (button9);
            keypad.add (button10);
            keypad.add (button11);
            keypad.add (button12);
            
            //add key panel to center of this panel
            this.add(title, BorderLayout.NORTH); 
            this.add (keypad, BorderLayout.CENTER);
            this.setBackground(Color.yellow);
            this.setPreferredSize(new Dimension(230, 270));

        }
}