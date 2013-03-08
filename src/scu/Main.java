/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package scu;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception e) { }



         formularios.frmPrincipal form = new formularios.frmPrincipal();
       form.setVisible(true);
       form.iniciar();
    }

}
