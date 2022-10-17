public class barra extends javax.swing.JFrame {

    public barra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        barra1 = new javax.swing.JScrollBar();
        label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        radio1.setText("0.25");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });
        getContentPane().add(radio1);
        radio1.setBounds(60, 40, 70, 23);

        radio2.setText("0.5");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });
        getContentPane().add(radio2);
        radio2.setBounds(160, 40, 60, 23);

        radio3.setText("1.0");
        radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio3ActionPerformed(evt);
            }
        });
        getContentPane().add(radio3);
        radio3.setBounds(250, 40, 60, 23);

        barra1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        barra1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                barra1AdjustmentValueChanged(evt);
            }
        });
        getContentPane().add(barra1);
        barra1.setBounds(10, 110, 340, 17);
        getContentPane().add(label1);
        label1.setBounds(60, 70, 250, 30);

        jLabel2.setText("Copiryng K-rloz Medina");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 180, 130, 14);

        jLabel1.setText("Seleccione la escala a la q la barra avazara");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 20, 290, 14);
        getContentPane().add(l1);
        l1.setBounds(150, 140, 50, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-379)/2, (screenSize.height-232)/2, 379, 232);
    }// </editor-fold>//GEN-END:initComponents

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed

    if(radio1.isSelected())
    {
        barra1.setValue(0);
        label1.setText("La barra se moverá cada 0.25 unidades.");
        radio2.setSelected(false);
        radio3.setSelected(false);
    }
    else
    {
        label1.setText("La barra se moverá cada 0 unidades.");
    }

    }//GEN-LAST:event_radio1ActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed

        if(radio2.isSelected())
        {
            barra1.setValue(0);
            label1.setText("La barra se moverá cada 0.5 unidades.");
            radio1.setSelected(false);
            radio3.setSelected(false);
        }
        else
        {
            label1.setText("La barra se moverá cada 0 unidades.");
        }

    }//GEN-LAST:event_radio2ActionPerformed

    private void radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio3ActionPerformed

        if(radio3.isSelected())
        {
            barra1.setValue(0);
            label1.setText("La barra se movera cada 1.0 unidades");
            radio2.setSelected(false);
            radio1.setSelected(false);
        }
        else
        {
            label1.setText("La barra se moverá cada 0 unidades.");
        }

    }//GEN-LAST:event_radio3ActionPerformed

    private void barra1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_barra1AdjustmentValueChanged

        int x,y;
        double k,h;
        x=barra1.getValue();
        if(radio3.isSelected())
        {
            l1.setText(String.valueOf(x));
        }
        if(radio2.isSelected())
        {
            double f=(double)(x);
            k=f/2;
            l1.setText(String.valueOf(k));
        }
        if(radio1.isSelected())
        {
            double q=(double)(x);
            h=q/4;
            l1.setText(String.valueOf(h));
        }

    }//GEN-LAST:event_barra1AdjustmentValueChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar barra1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel label1;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    // End of variables declaration//GEN-END:variables

}
