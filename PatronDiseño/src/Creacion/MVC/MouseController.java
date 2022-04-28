
package Creacion.MVC;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseController implements MouseListener {

    private View view;

    public MouseController(View view) {
        this.view   = view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       int filaPulsada = view.getTable().getSelectedRow();
        System.out.println("Fila pulstada es " + filaPulsada);
        view.setTextField((String) view.getTable().getValueAt(filaPulsada, 0));
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
