
package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class ComboBoxListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        //codice
        JComboBox cb=(JComboBox)ae.getSource();
        String s=(String)cb.getSelectedItem();
        System.out.println("Scelto "+s);
    }
}
