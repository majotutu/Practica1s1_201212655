/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class Plantas extends javax.swing.JFrame {
String Nombre;
Boolean estado;
String Cantidad;
String Extra;
int numero=0;
NodoJugadorP Primero;
NodoJugadorP Ultimo;
ListaJugPlanta listaJP =new ListaJugPlanta();
CrearPlanta CP;

    /**
     * Creates new form Plantas
     */
    public Plantas() {
        initComponents();
       
        estado=false;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));
        setForeground(new java.awt.Color(102, 204, 0));
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 417, 349));
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 150, 148, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 210, 148, 30);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 150, 68, 26);

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 210, 75, 26);

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plant.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 20, 230, 88);

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 250, 40, 40);

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setText("Agregar campo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 260, 120, 23);

        jLabel4.setBackground(new java.awt.Color(0, 153, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadenas-verdes,-fondo-verde-198103.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Nombre=jTextField1.getText();
Cantidad=jTextField2.getText();


listaJP.InsertarPrimero(Nombre);
listaJP.InsertarPrimero(Cantidad);
System.out.println("Largo   "+listaJP.Largo());
        System.out.println("cero   "+listaJP.Obtener(listaJP.Largo()-1));
        System.out.println("uno   "+listaJP.Obtener(listaJP.Largo()-2));
CP=new CrearPlanta();
CP.setVisible(true);



   

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jLabel1.setText("Extra");
jLabel2.setText("Extra");

estado=true;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plantas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    public String regresarInf1(String info) {
        return info;
        //To change body of generated methods, choose Tools | Templates.
    }

    private void regresarInf2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
