package jencryptor;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Marcone Melo Mendonça
 * @version 1.0
 * @see https://github.com/marconemm/JEncryptor
 * @desc Class "Decrypt Graphic User Interface". It's the decryption window.
 */
public class Decrypt_GUI extends javax.swing.JDialog {

    public Decrypt_GUI(Main_GUI parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_TextToDecryptAnchor = new javax.swing.JPanel();
        jPanel_TextToDecrypt = new javax.swing.JPanel();
        lbl_TextToDecrypt = new javax.swing.JLabel();
        jta_TextToDecrypt = new javax.swing.JTextArea();
        jButton_Decrypt = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jPanel_TextDecryptedAnchor = new javax.swing.JPanel();
        jPanel_TextDecrypted = new javax.swing.JPanel();
        jsp__TextDecrypted = new javax.swing.JScrollPane();
        jta_TextDecrypted = new javax.swing.JTextArea();
        jButton_Copy = new javax.swing.JButton();
        lbl_TextEncrypted = new javax.swing.JLabel();
        jButton_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel_TextToDecryptAnchor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Necessários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel_TextToDecrypt.setBackground(new java.awt.Color(204, 255, 255));

        lbl_TextToDecrypt.setText("Informe o texto a ser descriptografado:");

        jta_TextToDecrypt.setColumns(20);
        jta_TextToDecrypt.setLineWrap(true);
        jta_TextToDecrypt.setRows(5);
        jta_TextToDecrypt.setWrapStyleWord(true);
        jta_TextToDecrypt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton_Decrypt.setText("Decriptar");
        jButton_Decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DecryptActionPerformed(evt);
            }
        });

        jButton_Clear.setText("Limpar");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TextToDecryptLayout = new javax.swing.GroupLayout(jPanel_TextToDecrypt);
        jPanel_TextToDecrypt.setLayout(jPanel_TextToDecryptLayout);
        jPanel_TextToDecryptLayout.setHorizontalGroup(
            jPanel_TextToDecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextToDecryptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TextToDecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TextToDecrypt)
                    .addComponent(jta_TextToDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_TextToDecryptLayout.createSequentialGroup()
                        .addComponent(jButton_Clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Decrypt)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel_TextToDecryptLayout.setVerticalGroup(
            jPanel_TextToDecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextToDecryptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TextToDecrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jta_TextToDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_TextToDecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Decrypt)
                    .addComponent(jButton_Clear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_TextToDecryptAnchorLayout = new javax.swing.GroupLayout(jPanel_TextToDecryptAnchor);
        jPanel_TextToDecryptAnchor.setLayout(jPanel_TextToDecryptAnchorLayout);
        jPanel_TextToDecryptAnchorLayout.setHorizontalGroup(
            jPanel_TextToDecryptAnchorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_TextToDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel_TextToDecryptAnchorLayout.setVerticalGroup(
            jPanel_TextToDecryptAnchorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_TextToDecrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_TextDecryptedAnchor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel_TextDecrypted.setBackground(new java.awt.Color(204, 255, 204));

        jta_TextDecrypted.setEditable(false);
        jta_TextDecrypted.setColumns(20);
        jta_TextDecrypted.setLineWrap(true);
        jta_TextDecrypted.setRows(5);
        jta_TextDecrypted.setWrapStyleWord(true);
        jsp__TextDecrypted.setViewportView(jta_TextDecrypted);

        jButton_Copy.setText("Copiar");
        jButton_Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CopyActionPerformed(evt);
            }
        });

        lbl_TextEncrypted.setText("Eis o texto descriptografado:");

        jButton_Back.setText("Voltar");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TextDecryptedLayout = new javax.swing.GroupLayout(jPanel_TextDecrypted);
        jPanel_TextDecrypted.setLayout(jPanel_TextDecryptedLayout);
        jPanel_TextDecryptedLayout.setHorizontalGroup(
            jPanel_TextDecryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextDecryptedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TextDecryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TextDecryptedLayout.createSequentialGroup()
                        .addGroup(jPanel_TextDecryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsp__TextDecrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_TextEncrypted))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TextDecryptedLayout.createSequentialGroup()
                        .addComponent(jButton_Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Copy)))
                .addContainerGap())
        );
        jPanel_TextDecryptedLayout.setVerticalGroup(
            jPanel_TextDecryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextDecryptedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TextEncrypted)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp__TextDecrypted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_TextDecryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Copy)
                    .addComponent(jButton_Back)))
        );

        javax.swing.GroupLayout jPanel_TextDecryptedAnchorLayout = new javax.swing.GroupLayout(jPanel_TextDecryptedAnchor);
        jPanel_TextDecryptedAnchor.setLayout(jPanel_TextDecryptedAnchorLayout);
        jPanel_TextDecryptedAnchorLayout.setHorizontalGroup(
            jPanel_TextDecryptedAnchorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextDecryptedAnchorLayout.createSequentialGroup()
                .addComponent(jPanel_TextDecrypted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel_TextDecryptedAnchorLayout.setVerticalGroup(
            jPanel_TextDecryptedAnchorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_TextDecrypted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_TextDecryptedAnchor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_TextToDecryptAnchor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_TextToDecryptAnchor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_TextDecryptedAnchor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_DecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DecryptActionPerformed
        String hasToDecrypt = jta_TextToDecrypt.getText();
        String msg = null;

        RainbowTable_BL myRainbowTable = new RainbowTable_BL();

        try {
            String textDecrypted = myRainbowTable.read(hasToDecrypt);
            if (textDecrypted != null) {
                jta_TextDecrypted.setText(textDecrypted);
            } else {
                jta_TextDecrypted.setText(null);
                msg = "Hash Code inválido.";
                jta_TextDecrypted.setText(msg);
            }
        } catch (IOException ioe) {
            msg = "Erro de Headless.\n\nErro: ";
            JOptionPane.showMessageDialog(null, msg + ioe.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton_DecryptActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        jta_TextDecrypted.setText(null);
        jta_TextToDecrypt.setText(null);
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CopyActionPerformed
        jta_TextToDecrypt.selectAll();
        String myString = jta_TextToDecrypt.getSelectedText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }//GEN-LAST:event_jButton_CopyActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_BackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Copy;
    private javax.swing.JButton jButton_Decrypt;
    private javax.swing.JPanel jPanel_TextDecrypted;
    private javax.swing.JPanel jPanel_TextDecryptedAnchor;
    private javax.swing.JPanel jPanel_TextToDecrypt;
    private javax.swing.JPanel jPanel_TextToDecryptAnchor;
    private javax.swing.JScrollPane jsp__TextDecrypted;
    private javax.swing.JTextArea jta_TextDecrypted;
    private javax.swing.JTextArea jta_TextToDecrypt;
    private javax.swing.JLabel lbl_TextEncrypted;
    private javax.swing.JLabel lbl_TextToDecrypt;
    // End of variables declaration//GEN-END:variables
}
