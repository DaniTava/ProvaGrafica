/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

/**
 *
 * @author cl427862
 */
public class RadioButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        JRadioButton radio=(JRadioButton)ae.getSource();
        String s=(String)radio.getText();
        System.out.println("Scelto "+s);
    }
    
    
}
