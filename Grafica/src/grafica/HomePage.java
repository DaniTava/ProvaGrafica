/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author cl427862
 */
public class HomePage extends JFrame {
    
    public HomePage(String s)
    {
        super(s);
        
        JPanel pannello=new JPanel();
        
        StartButton st=new StartButton("Start");
        StartButtonListener sbl=new StartButtonListener();
        st.addActionListener(sbl);
        
        ArrayList<String> array=new ArrayList();
        array.add("1");array.add("2");array.add("3");array.add("4");array.add("5");
        JComboBox box=new JComboBox(array.toArray());
        ComboBoxListener cbl=new ComboBoxListener();
        box.addActionListener(cbl);
        
        pannello.add(st,BorderLayout.EAST);
        pannello.add(box,BorderLayout.WEST);
        
        setContentPane(pannello);
        pack();
        setVisible(true);
    }
    
}
