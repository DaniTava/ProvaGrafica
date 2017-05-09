
package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class RadioButtonListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //codice
        JRadioButton radio=(JRadioButton)ae.getSource();
        String s=(String)radio.getText();
        System.out.println("Scelto "+s);
    }
}
