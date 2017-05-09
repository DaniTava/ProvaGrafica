/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author cl427862
 */
public class ComboBoxListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        JComboBox cb=(JComboBox)ae.getSource();
        String s=(String)cb.getSelectedItem();
        System.out.println("Scelto "+s);
    }
    
}
