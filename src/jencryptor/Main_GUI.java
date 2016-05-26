package jencryptor;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author Marcone Melo Mendonça
 * @version 1.1
 * @see https://github.com/marconemm/JEncryptor
 * @desc Class "Main Graphic User Interface". It's the application main window.
 */
public class Main_GUI extends javax.swing.JDialog {

    private String msg = "Eis o seu código Hash (Criptografia - ) :";
    private HashCode_BL hashCode;
    private final RainbowTable_BL myRainbowTable;

    public Main_GUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        File tempMyRainbowTableFile = null;
        try {
            //Open a whindow to find the *.txt file:
            JFileChooser findFile = new JFileChooser();
            msg = "Escolha um arquivo \"*.txt\" para \"RainbowTable\"";
            findFile.setDialogTitle(msg);
            findFile.showOpenDialog(rootPane);
            while (!findFile.getSelectedFile().getAbsolutePath().endsWith(".txt")) {
                msg = "Favor,\nselecione um arquivo de texto (*.txt)\npara \"RainbowTable\" ";
                msg += "desta aplicação.";
                JOptionPane.showMessageDialog(rootPane, msg, "Aviso:", JOptionPane.WARNING_MESSAGE);
                findFile.setCurrentDirectory(new File(findFile.getSelectedFile().getAbsolutePath()));
                findFile.setSelectedFile(null);
                findFile.showOpenDialog(rootPane);
                if (findFile.getSelectedFile() == null) {
                    throw new NullPointerException();
                }
            }

            if (findFile.getSelectedFile() != null) {
                tempMyRainbowTableFile = findFile.getSelectedFile();
            }

        } catch (NullPointerException npe) {
            //In case "abort file chooser dialog" (if cancel button was pressed):
            npe.getMessage();
            initComponents();
        }

        if (tempMyRainbowTableFile != null) {
                this.myRainbowTable = new RainbowTable_BL(tempMyRainbowTableFile);
                initComponents();
        } else {
            this.myRainbowTable = null;
            initComponents();
        }
    }

    private boolean isRunnable() {
        if (myRainbowTable == null) {
            msg = "Não é possível executar esta aplicação\n";
            msg += "sem um arquivo \"*.txt\" como a \"RainbowTable\"";
            JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel_TextToEncryptAnchor = new javax.swing.JPanel();
        jPanel_TextToEncrypt = new javax.swing.JPanel();
        lbl_TextToEncrypt = new javax.swing.JLabel();
        jsp_TextToEncrypt = new javax.swing.JScrollPane();
        jta_TextToEncrypt = new javax.swing.JTextArea();
        lbl_CryptType = new javax.swing.JLabel();
        jcb_CryptType = new javax.swing.JComboBox<>();
        jButton_Encrypt = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jPanel_TextEncrypteAnchor = new javax.swing.JPanel();
        jPanel_TextEncrypted = new javax.swing.JPanel();
        lbl_TextEncrypted = new javax.swing.JLabel();
        jta_TextEncrypted = new javax.swing.JTextArea();
        jButton_Copy = new javax.swing.JButton();
        lbl_QtyCharacters = new javax.swing.JLabel();
        lbl_QtyCharacters_NoChange = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu_About = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encriptar");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/jencryptor/icon.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_TextToEncryptAnchor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Necessários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel_TextToEncrypt.setBackground(new java.awt.Color(204, 255, 204));

        lbl_TextToEncrypt.setText("Informe o texto a ser criptografado:");

        jta_TextToEncrypt.setColumns(20);
        jta_TextToEncrypt.setLineWrap(true);
        jta_TextToEncrypt.setRows(5);
        jta_TextToEncrypt.setWrapStyleWord(true);
        jsp_TextToEncrypt.setViewportView(jta_TextToEncrypt);

        lbl_CryptType.setText("Qual a Cripografia desejada:");

        jcb_CryptType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MD5", "SHA-1", "SHA-256" }));

        jButton_Encrypt.setText("Encriptar");
        jButton_Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EncryptActionPerformed(evt);
            }
        });

        jButton_Clear.setText("Limpar");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TextToEncryptLayout = new javax.swing.GroupLayout(jPanel_TextToEncrypt);
        jPanel_TextToEncrypt.setLayout(jPanel_TextToEncryptLayout);
        jPanel_TextToEncryptLayout.setHorizontalGroup(
            jPanel_TextToEncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextToEncryptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TextToEncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TextToEncrypt)
                    .addGroup(jPanel_TextToEncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_TextToEncryptLayout.createSequentialGroup()
                            .addComponent(lbl_CryptType)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcb_CryptType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Clear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_Encrypt))
                        .addComponent(jsp_TextToEncrypt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TextToEncryptLayout.setVerticalGroup(
            jPanel_TextToEncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextToEncryptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TextToEncrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp_TextToEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_TextToEncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CryptType)
                    .addComponent(jcb_CryptType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Encrypt)
                    .addComponent(jButton_Clear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_TextToEncryptAnchorLayout = new javax.swing.GroupLayout(jPanel_TextToEncryptAnchor);
        jPanel_TextToEncryptAnchor.setLayout(jPanel_TextToEncryptAnchorLayout);
        jPanel_TextToEncryptAnchorLayout.setHorizontalGroup(
            jPanel_TextToEncryptAnchorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_TextToEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel_TextToEncryptAnchorLayout.setVerticalGroup(
            jPanel_TextToEncryptAnchorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_TextToEncrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_TextEncrypteAnchor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel_TextEncrypted.setBackground(new java.awt.Color(204, 255, 255));

        lbl_TextEncrypted.setText("Eis o seu código Hash (Criptografia - ) :");

        jta_TextEncrypted.setEditable(false);
        jta_TextEncrypted.setColumns(20);
        jta_TextEncrypted.setLineWrap(true);
        jta_TextEncrypted.setRows(5);
        jta_TextEncrypted.setWrapStyleWord(true);
        jta_TextEncrypted.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton_Copy.setText("Copiar");
        jButton_Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CopyActionPerformed(evt);
            }
        });

        lbl_QtyCharacters.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_QtyCharacters.setText("...");

        lbl_QtyCharacters_NoChange.setText("Qtd:");

        javax.swing.GroupLayout jPanel_TextEncryptedLayout = new javax.swing.GroupLayout(jPanel_TextEncrypted);
        jPanel_TextEncrypted.setLayout(jPanel_TextEncryptedLayout);
        jPanel_TextEncryptedLayout.setHorizontalGroup(
            jPanel_TextEncryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextEncryptedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TextEncryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TextEncryptedLayout.createSequentialGroup()
                        .addComponent(jButton_Copy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_QtyCharacters_NoChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_QtyCharacters))
                    .addGroup(jPanel_TextEncryptedLayout.createSequentialGroup()
                        .addGroup(jPanel_TextEncryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_TextEncrypted)
                            .addComponent(jta_TextEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_TextEncryptedLayout.setVerticalGroup(
            jPanel_TextEncryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextEncryptedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TextEncrypted)
                .addGap(5, 5, 5)
                .addComponent(jta_TextEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_TextEncryptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Copy)
                    .addComponent(lbl_QtyCharacters)
                    .addComponent(lbl_QtyCharacters_NoChange))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_TextEncrypteAnchorLayout = new javax.swing.GroupLayout(jPanel_TextEncrypteAnchor);
        jPanel_TextEncrypteAnchor.setLayout(jPanel_TextEncrypteAnchorLayout);
        jPanel_TextEncrypteAnchorLayout.setHorizontalGroup(
            jPanel_TextEncrypteAnchorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextEncrypteAnchorLayout.createSequentialGroup()
                .addComponent(jPanel_TextEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel_TextEncrypteAnchorLayout.setVerticalGroup(
            jPanel_TextEncrypteAnchorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_TextEncrypted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Decriptar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu_About.setText("Sobre");
        jMenuBar1.add(jMenu_About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_TextEncrypteAnchor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_TextToEncryptAnchor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_TextToEncryptAnchor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_TextEncrypteAnchor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CopyActionPerformed
        jta_TextEncrypted.selectAll();
        String myString = jta_TextEncrypted.getSelectedText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }//GEN-LAST:event_jButton_CopyActionPerformed

    private void jButton_EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EncryptActionPerformed
        try {
            String txtToEncrypt = jta_TextToEncrypt.getText();
            String encryptType = jcb_CryptType.getSelectedItem().toString();
            String tempStr = this.msg;
            tempStr = tempStr.substring(0, msg.length() - 3);
            tempStr += encryptType + ") :";
            lbl_TextEncrypted.setText(tempStr);
            hashCode = new HashCode_BL(txtToEncrypt, encryptType);
            jta_TextEncrypted.setText(hashCode.getHashCodeStr());
            lbl_QtyCharacters.setText(Integer.toString(hashCode.getHashCodeStr().length()));

            myRainbowTable.write(hashCode.getHashCodeStr());
            myRainbowTable.write(hashCode.getEncryptedTxt());

        } catch (HeadlessException he) {
            msg = "Erro de Headless.\n\nErro: ";
            JOptionPane.showMessageDialog(null, msg + he.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NoSuchAlgorithmException nsae) {
            msg = "NoSuchAlgorithm.\n\nErro: ";
            JOptionPane.showMessageDialog(null, msg + nsae.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            msg = "IOException.\n\nErro: ";
            JOptionPane.showMessageDialog(null, msg + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_EncryptActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        jta_TextToEncrypt.setText(null);
        jta_TextEncrypted.setText(null);
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Decrypt_GUI dGUI = new Decrypt_GUI(this, false, myRainbowTable);
        dGUI.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setVisible(false);
        if (isRunnable()) {
            this.setVisible(true);
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main_GUI mainWindow = new Main_GUI(new javax.swing.JFrame(), true);
                mainWindow.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                mainWindow.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Copy;
    private javax.swing.JButton jButton_Encrypt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenu_About;
    private javax.swing.JPanel jPanel_TextEncrypteAnchor;
    private javax.swing.JPanel jPanel_TextEncrypted;
    private javax.swing.JPanel jPanel_TextToEncrypt;
    private javax.swing.JPanel jPanel_TextToEncryptAnchor;
    private javax.swing.JComboBox<String> jcb_CryptType;
    private javax.swing.JScrollPane jsp_TextToEncrypt;
    private javax.swing.JTextArea jta_TextEncrypted;
    private javax.swing.JTextArea jta_TextToEncrypt;
    private javax.swing.JLabel lbl_CryptType;
    private javax.swing.JLabel lbl_QtyCharacters;
    private javax.swing.JLabel lbl_QtyCharacters_NoChange;
    private javax.swing.JLabel lbl_TextEncrypted;
    private javax.swing.JLabel lbl_TextToEncrypt;
    // End of variables declaration//GEN-END:variables
}
