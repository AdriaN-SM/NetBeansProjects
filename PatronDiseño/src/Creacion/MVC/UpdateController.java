/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 *
 * @author ChimoB
 */
public class UpdateController extends Observable implements ActionListener {

    private View view;

    public UpdateController(View view) {
        this.view = view;
        this.addObserver(view);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int filaPulsada = view.getTable().getSelectedRow();
        String text = view.getTextField();
        setChanged();
        notifyObservers(new Object[]{filaPulsada, text});
        
    }
}
