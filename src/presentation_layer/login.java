package presentation_layer;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 * @author Jaider Manosalva
 * @author Maria Amado
 * @author Daniel Acosta
 * @author Juan Lamouroux
 * @author Tatiana Saenz
 */
public class login extends javax.swing.JFrame {
    
    //variables para la posicion del formulario
    int xMouse, yMouse;
    
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Conten1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Name_enterprise = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        panelButton = new javax.swing.JPanel();
        labelButton = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        ExitPanel = new javax.swing.JPanel();
        ExitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(800, 500));
        bg.setName(""); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Conten1.setBackground(new java.awt.Color(51, 102, 255));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation_layer/images/popcorn (2).png"))); // NOI18N

        Name_enterprise.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        Name_enterprise.setForeground(new java.awt.Color(204, 204, 204));
        Name_enterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_enterprise.setText("Name Enterprise");

        javax.swing.GroupLayout Conten1Layout = new javax.swing.GroupLayout(Conten1);
        Conten1.setLayout(Conten1Layout);
        Conten1Layout.setHorizontalGroup(
            Conten1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Name_enterprise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        Conten1Layout.setVerticalGroup(
            Conten1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Conten1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name_enterprise)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        bg.add(Conten1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 280, 510));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation_layer/images/popcorn (3).png"))); // NOI18N
        jLabel1.setText("LOGO");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sign in");
        jLabel2.setToolTipText("");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("I forgot the password");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("¿Create account?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        TextEmail.setForeground(new java.awt.Color(204, 204, 204));
        TextEmail.setText("Enter your Email");
        TextEmail.setBorder(null);
        TextEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextEmailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextEmailMousePressed(evt);
            }
        });
        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });
        bg.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 360, 30));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 360, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Email");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Password");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 360, 10));

        TextPassword.setForeground(new java.awt.Color(204, 204, 204));
        TextPassword.setText("!!!!!!!");
        TextPassword.setBorder(null);
        TextPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextPasswordMousePressed(evt);
            }
        });
        bg.add(TextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 360, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation_layer/images/eye-line.png"))); // NOI18N
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 30, 30));

        panelButton.setBackground(new java.awt.Color(51, 102, 255));

        labelButton.setForeground(new java.awt.Color(255, 255, 255));
        labelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButton.setText("Login");
        labelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(panelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 110, 40));

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BarraMouseReleased(evt);
            }
        });

        ExitPanel.setBackground(new java.awt.Color(255, 255, 255));
        ExitPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitPanelMouseEntered(evt);
            }
        });

        ExitLabel.setBackground(new java.awt.Color(255, 255, 255));
        ExitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitLabel.setText("X");
        ExitLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitPanelLayout = new javax.swing.GroupLayout(ExitPanel);
        ExitPanel.setLayout(ExitPanelLayout);
        ExitPanelLayout.setHorizontalGroup(
            ExitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitPanelLayout.setVerticalGroup(
            ExitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addComponent(ExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 770, Short.MAX_VALUE))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //no se usa
    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    //obtener la posicion del formulario
    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        System.out.print(bg);
    }//GEN-LAST:event_BarraMousePressed
    //no se usa
    private void BarraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BarraMouseReleased
    
    //Arrastrar el panel por la pantalla
    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged
    
    //Salir del sistema
    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitLabelMouseClicked
    //no se usa
    private void ExitPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitPanelMouseEntered
        
    }//GEN-LAST:event_ExitPanelMouseEntered
    //estilos del boton
    private void ExitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseEntered
        ExitPanel.setBackground(Color.red);
        ExitLabel.setForeground(Color.white);
    }//GEN-LAST:event_ExitLabelMouseEntered

    private void ExitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseExited
        ExitPanel.setBackground(Color.white);
        ExitLabel.setForeground(Color.black);
    }//GEN-LAST:event_ExitLabelMouseExited

    private void labelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonMouseClicked
        //Eliminar los espacios al inicio y al final; verificar si el usuario solo hizo space en el txt
        String email = TextEmail.getText().trim();
        String pass= String.valueOf(TextPassword.getPassword()).trim();
        
        if(email.equals("Enter your Email")|| pass.equals("!!!!!!!") || email.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(this,"Los campos estan vacios");
        }
    }//GEN-LAST:event_labelButtonMouseClicked

    private void labelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonMouseEntered
        
        //Estilos del Boton
        panelButton.setOpaque(false);
        panelButton.setBackground(new Color(0, 0, 0, 0));
        Border borde = BorderFactory.createLineBorder(black, 2);
        panelButton.setBorder(borde);
        
        //estilos del label del boton
        labelButton.setForeground(Color.black);
    }//GEN-LAST:event_labelButtonMouseEntered

    private void labelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonMouseExited
        panelButton.setBackground(new Color(51,102,255));
        panelButton.setForeground(Color.white);
        panelButton.setBorder(null);
        panelButton.setOpaque(true);
        
        labelButton.setSize(110,30);
        labelButton.setForeground(Color.white);
    }//GEN-LAST:event_labelButtonMouseExited

    private void TextEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextEmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailMouseClicked

    private void TextEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextEmailMousePressed
        if (TextEmail.getText().equals("Enter your Email")) {
            TextEmail.setText("");
            TextEmail.setForeground(black);
        }
        if(String.valueOf(TextPassword.getPassword()).isEmpty()){
            TextPassword.setText("!!!!!!!");
            TextPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TextEmailMousePressed

    private void TextPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextPasswordMousePressed
        if (String.valueOf(TextPassword.getPassword()).equals("!!!!!!!")) {
           TextPassword.setText("");
           TextPassword.setForeground(black);
        }
        if(TextEmail.getText().isEmpty()){
            TextEmail.setText("Enter your Email");
            TextEmail.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_TextPasswordMousePressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        Font font =  new Font("Segoe UI", Font.BOLD, 14);
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabel3.setFont(font.deriveFont(attributes));
        jLabel3.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        Font font =  new Font("Segoe UI", Font.BOLD, 14);
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, -1);
        jLabel3.setFont(font.deriveFont(attributes));
        jLabel3.setForeground(new Color(51,102,255));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        RecoverPassword jframe = new RecoverPassword();
        jframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        Font font =  new Font("Segoe UI", Font.BOLD, 14);
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabel6.setFont(font.deriveFont(attributes));
        jLabel6.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        Font font =  new Font("Segoe UI", Font.BOLD, 14);
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, -1);
        jLabel6.setFont(font.deriveFont(attributes));
        jLabel6.setForeground(new Color(51,102,255));
    }//GEN-LAST:event_jLabel6MouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel Conten1;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JPanel ExitPanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Name_enterprise;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelButton;
    private javax.swing.JPanel panelButton;
    // End of variables declaration//GEN-END:variables
}
