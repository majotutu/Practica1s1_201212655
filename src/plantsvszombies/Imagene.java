/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import javax.swing.JLabel;

/**
 *
 * @author MariaJose
 */
public class Imagene extends javax.swing.JLabel{
    int x, y;
    public Imagene(JLabel jLabel1) {
        this.x = jLabel1.getWidth();
        this.y = jLabel1.getHeight();
        this.setSize(x, y);
    }
}
