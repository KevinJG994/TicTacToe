/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.company.tictactoe;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Quebim
 */
public class VistaTicTacToe extends javax.swing.JFrame {

  boolean estado=true;
  String turno="X";
  String siguientePartida="O";
  JLabel lbs[]= new JLabel[9];
  int ganador[][]={
      {1,2,3},
      {4,5,6},
      {7,8,9},
      {1,5,9},
      {3,5,7},
      {1,4,7},
      {2,5,8},
      {3,6,9},
  };
  
  
    public VistaTicTacToe() {
        initComponents();
              
        setLocationRelativeTo(null);
        
        lbs[0]=posicion1;
        lbs[1]=posicion2;
        lbs[2]=posicion3;
        lbs[3]=posicion4;
        lbs[4]=posicion5;
        lbs[5]=posicion6;
        lbs[6]=posicion7;
        lbs[7]=posicion8;
        lbs[8]=posicion9;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        Tablero = new javax.swing.JPanel();
        posicion7 = new javax.swing.JLabel();
        posicion9 = new javax.swing.JLabel();
        posicion8 = new javax.swing.JLabel();
        posicion4 = new javax.swing.JLabel();
        posicion5 = new javax.swing.JLabel();
        posicion6 = new javax.swing.JLabel();
        posicion1 = new javax.swing.JLabel();
        posicion2 = new javax.swing.JLabel();
        posicion3 = new javax.swing.JLabel();
        lbTurno = new javax.swing.JLabel();
        panelContador = new javax.swing.JPanel();
        lbX = new javax.swing.JLabel();
        lbPuntosX = new javax.swing.JLabel();
        lbO = new javax.swing.JLabel();
        lbPuntosO = new javax.swing.JLabel();
        btnReinicio = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel1");
        jLabel2.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(220, 234, 255));

        Tablero.setBackground(new java.awt.Color(141, 181, 217));

        posicion7.setBackground(new java.awt.Color(255, 255, 255));
        posicion7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion7.setOpaque(true);
        posicion7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion7MousePressed(evt);
            }
        });

        posicion9.setBackground(new java.awt.Color(255, 255, 255));
        posicion9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion9.setOpaque(true);
        posicion9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion9MousePressed(evt);
            }
        });

        posicion8.setBackground(new java.awt.Color(255, 255, 255));
        posicion8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion8.setOpaque(true);
        posicion8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion8MousePressed(evt);
            }
        });

        posicion4.setBackground(new java.awt.Color(255, 255, 255));
        posicion4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion4.setOpaque(true);
        posicion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion4MousePressed(evt);
            }
        });

        posicion5.setBackground(new java.awt.Color(255, 255, 255));
        posicion5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion5.setOpaque(true);
        posicion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion5MousePressed(evt);
            }
        });

        posicion6.setBackground(new java.awt.Color(255, 255, 255));
        posicion6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion6.setOpaque(true);
        posicion6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion6MousePressed(evt);
            }
        });

        posicion1.setBackground(new java.awt.Color(255, 255, 255));
        posicion1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion1.setOpaque(true);
        posicion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion1MousePressed(evt);
            }
        });

        posicion2.setBackground(new java.awt.Color(255, 255, 255));
        posicion2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion2.setOpaque(true);
        posicion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion2MousePressed(evt);
            }
        });

        posicion3.setBackground(new java.awt.Color(255, 255, 255));
        posicion3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posicion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicion3.setOpaque(true);
        posicion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                posicion3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout TableroLayout = new javax.swing.GroupLayout(Tablero);
        Tablero.setLayout(TableroLayout);
        TableroLayout.setHorizontalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TableroLayout.createSequentialGroup()
                        .addComponent(posicion7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(posicion8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(posicion9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableroLayout.createSequentialGroup()
                        .addComponent(posicion4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(posicion5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(posicion6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableroLayout.createSequentialGroup()
                        .addComponent(posicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(posicion2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(posicion3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TableroLayout.setVerticalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posicion7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicion9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicion8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posicion4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicion6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicion5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicion3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicion2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbTurno.setBackground(new java.awt.Color(87, 120, 176));
        lbTurno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTurno.setText("Turno de X");
        lbTurno.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        panelContador.setBackground(new java.awt.Color(141, 181, 217));
        panelContador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbX.setText("X =");

        lbPuntosX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPuntosX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuntosX.setText("0");

        lbO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbO.setText("O =");

        lbPuntosO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPuntosO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuntosO.setText("0");

        btnReinicio.setText("Reiniciar");
        btnReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinicioActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Puntuación");

        javax.swing.GroupLayout panelContadorLayout = new javax.swing.GroupLayout(panelContador);
        panelContador.setLayout(panelContadorLayout);
        panelContadorLayout.setHorizontalGroup(
            panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContadorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPuntosX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPuntosO)
                .addGap(27, 27, 27))
            .addGroup(panelContadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelContadorLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnReinicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContadorLayout.setVerticalGroup(
            panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContadorLayout.createSequentialGroup()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbO)
                        .addComponent(lbPuntosO))
                    .addGroup(panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbX)
                        .addComponent(lbPuntosX)))
                .addGap(18, 18, 18)
                .addComponent(btnReinicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void posicion7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion7MousePressed
        presionar(7);
    }//GEN-LAST:event_posicion7MousePressed

    private void posicion8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion8MousePressed
        presionar(8);
    }//GEN-LAST:event_posicion8MousePressed

    private void posicion9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion9MousePressed
        presionar(9);
    }//GEN-LAST:event_posicion9MousePressed

    private void posicion4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion4MousePressed
        presionar(4);
    }//GEN-LAST:event_posicion4MousePressed

    private void posicion5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion5MousePressed
        presionar(5);
    }//GEN-LAST:event_posicion5MousePressed

    private void posicion6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion6MousePressed
        presionar(6);
    }//GEN-LAST:event_posicion6MousePressed

    private void posicion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion1MousePressed
        presionar(1);
    }//GEN-LAST:event_posicion1MousePressed

    private void posicion2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion2MousePressed
        presionar(2);
    }//GEN-LAST:event_posicion2MousePressed

    private void posicion3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicion3MousePressed
        presionar(3);
    }//GEN-LAST:event_posicion3MousePressed

    private void btnReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicioActionPerformed
        for (int i=0; i<lbs.length ;i++){
            lbs[i].setText("");
            lbs[i].setBackground(Color.white);
        }
        
        turno=siguientePartida;
        if(siguientePartida.equals("O")){
            siguientePartida="X"; 
        }else{
            siguientePartida="O"; 
        }
        
        lbTurno.setText("Turno de "+turno);
        estado=true;
    }//GEN-LAST:event_btnReinicioActionPerformed

    public void presionar (int casilla){
        if (lbs[casilla-1].getText().equals("")&& estado){
        lbs[casilla-1].setText(turno);
        cambiarTurno();
        comprobarGanador();
        } 
    }
    
    public void cambiarTurno(){
        if (turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }
        lbTurno.setText("Turno de "+turno);
        
    }
    
    public void comprobarGanador(){
        for(int i=0; i<ganador.length;i++){
            if(lbs[ganador[i][0]-1].getText().equals("X")&&
                    lbs[ganador[i][1]-1].getText().equals("X")&&
                        lbs[ganador[i][2]-1].getText().equals("X")){
                
                lbs[ganador[i][0]-1].setBackground(Color.cyan);
                lbs[ganador[i][1]-1].setBackground(Color.cyan);
                lbs[ganador[i][2]-1].setBackground(Color.cyan);
                lbPuntosX.setText(Integer.toString(Integer.parseInt(lbPuntosX.getText())+1));
                lbTurno.setText("El ganador es X");
                estado=false;
            }
            if(lbs[ganador[i][0]-1].getText().equals("O")&&
                    lbs[ganador[i][1]-1].getText().equals("O")&&
                        lbs[ganador[i][2]-1].getText().equals("O")){
                
                lbs[ganador[i][0]-1].setBackground(Color.cyan);
                lbs[ganador[i][1]-1].setBackground(Color.cyan);
                lbs[ganador[i][2]-1].setBackground(Color.cyan);
                lbPuntosO.setText(Integer.toString(Integer.parseInt(lbPuntosO.getText())+1));
                lbTurno.setText("El ganador es O");
                estado=false;
            }
        }
    }

    
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
            java.util.logging.Logger.getLogger(VistaTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tablero;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbO;
    private javax.swing.JLabel lbPuntosO;
    private javax.swing.JLabel lbPuntosX;
    private javax.swing.JLabel lbTurno;
    private javax.swing.JLabel lbX;
    private javax.swing.JPanel panelContador;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel posicion1;
    private javax.swing.JLabel posicion2;
    private javax.swing.JLabel posicion3;
    private javax.swing.JLabel posicion4;
    private javax.swing.JLabel posicion5;
    private javax.swing.JLabel posicion6;
    private javax.swing.JLabel posicion7;
    private javax.swing.JLabel posicion8;
    private javax.swing.JLabel posicion9;
    // End of variables declaration//GEN-END:variables
}
