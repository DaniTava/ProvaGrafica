
package grafica;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Grafica 
{
    //protected Progetto p;
    
    public Grafica(/*Progetto p*/)
    {
        HomePage hp=new HomePage("Home");
        
        ExecutePage ep=new ExecutePage("Esecuzione");
        
        WindowListener l=new WindowListener() {

            @Override
            public void windowOpened(WindowEvent we) {}
            @Override
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
            @Override
            public void windowClosed(WindowEvent we) {}
            @Override
            public void windowIconified(WindowEvent we) {}
            @Override
            public void windowDeiconified(WindowEvent we) {}
            @Override
            public void windowActivated(WindowEvent we) {}
            @Override
            public void windowDeactivated(WindowEvent we) {}
        };
        
        ep.addWindowListener(l);
    }

    
}
