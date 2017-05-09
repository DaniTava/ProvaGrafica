
package grafica;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ExecutePage extends JFrame 
{
    public ExecutePage(String s)
    {
        super(s);
        JPanel pannello=new JPanel();
        
        BackButton bb=new BackButton("Back");
        BackButtonListener bbl=new BackButtonListener();
        bb.addActionListener(bbl);
        
        NextButton nb=new NextButton("Next");
        NextButtonListener nbl=new NextButtonListener();
        nb.addActionListener(nbl);
        
        HomeButton hb=new HomeButton("Home");
        HomeButtonListener hbl=new HomeButtonListener();
        hb.addActionListener(hbl);
        
        ArrayList<String> array=new ArrayList();
        array.add("1");array.add("2");array.add("3");array.add("4");array.add("5");
        
        pannello.add(bb,BorderLayout.EAST);
        pannello.add(nb,BorderLayout.WEST);
        pannello.add(hb,BorderLayout.CENTER);
        pannello.add(insertRadioButtonS(5,array),BorderLayout.SOUTH);
        
        setContentPane(pannello);
        pack();
        setVisible(true);
    }
    
    public JPanel insertRadioButtonS(int n, ArrayList<String> s)
    {
        JPanel pannello=new JPanel();
        ButtonGroup gruppo=new ButtonGroup();
        
        int i;
        
        for(i=0;i<n;i++)
        {
                JRadioButton radio=new JRadioButton(s.get(i));
                RadioButtonListener rbl=new RadioButtonListener();
                radio.addActionListener(rbl);
                gruppo.add(radio);
                pannello.add(radio);
                pannello.setLayout(new BoxLayout(pannello, BoxLayout.PAGE_AXIS));
        }
        
        return pannello;
    } 
}
