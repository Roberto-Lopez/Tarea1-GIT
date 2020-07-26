package tarea1_git;

import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desk = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonCargar = new javax.swing.JButton();
        Caja1 = new javax.swing.JTextField();
        Caja2 = new javax.swing.JTextField();
        CajaTextoFinal = new javax.swing.JTextField();
        botonAyuda = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desk.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("Ingrese la primera muestra");

        jLabel2.setText("Ingrese la segunda muestra");

        BotonCargar.setBackground(new java.awt.Color(204, 51, 255));
        BotonCargar.setText("Cargar");
        BotonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarActionPerformed(evt);
            }
        });

        Caja1.setBackground(new java.awt.Color(153, 153, 153));

        Caja2.setBackground(new java.awt.Color(153, 153, 153));

        CajaTextoFinal.setEditable(false);
        CajaTextoFinal.setBackground(new java.awt.Color(153, 153, 153));

        botonAyuda.setBackground(new java.awt.Color(0, 153, 51));
        botonAyuda.setText("Ayuda?");
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(255, 51, 51));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeskLayout = new javax.swing.GroupLayout(Desk);
        Desk.setLayout(DeskLayout);
        DeskLayout.setHorizontalGroup(
            DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskLayout.createSequentialGroup()
                .addGroup(DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeskLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(botonLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(botonAyuda)
                        .addGap(18, 18, 18)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskLayout.createSequentialGroup()
                        .addContainerGap(108, Short.MAX_VALUE)
                        .addGroup(DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)))
                .addGroup(DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaTextoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        DeskLayout.setVerticalGroup(
            DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeskLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BotonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAyuda)
                            .addComponent(botonLimpiar)
                            .addComponent(botonSalir)))
                    .addGroup(DeskLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(CajaTextoFinal)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarActionPerformed

        String muestra1;
        String muestra2;
        String resultado = "";

        muestra1 = Caja1.getText();
        muestra2 = Caja2.getText();

        if (muestra1.length() == muestra2.length()) {
            JOptionPane.showMessageDialog(null, "presiona OK en cada ventana emergente"+"\n"
                    + "para ver las cadenas de ADNs que se forman");
            for (int i = 0; i < muestra1.length(); i++) {
                for (int j = 0; j < muestra2.length(); j++) {
                    if (muestra1.charAt(i) == muestra2.charAt(j)) {
                        resultado += muestra1.charAt(i);
                        CajaTextoFinal.setText(resultado);
                        System.out.println(resultado);
                        JOptionPane.showMessageDialog(null, resultado + "\n"
                                + "");

                    }
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Las cadenas deben de tener las mismas dimensiones" + "\n"
                    + "vuelve a intentarlo porFavor");
            Caja1.setText("");
            Caja2.setText("");

        }


    }//GEN-LAST:event_BotonCargarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed

        Caja1.setText("");
        Caja2.setText("");
        CajaTextoFinal.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        Ayuda ayuda = new Ayuda();
        Desk.add(ayuda);
        ayuda.show();
    }//GEN-LAST:event_botonAyudaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCargar;
    private javax.swing.JTextField Caja1;
    private javax.swing.JTextField Caja2;
    private javax.swing.JTextField CajaTextoFinal;
    private javax.swing.JPanel Desk;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
