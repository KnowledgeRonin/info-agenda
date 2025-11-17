package com.ronincompany.infoagenda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;

public class CreateContactDialog extends javax.swing.JDialog {
    
    private GUI parent;
    private Person newPerson = null;
    private String selectedImagePath = "";
    private static final String DEFAULT_IMAGE_PATH = "./resources/no_img.jpg";
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CreateContactDialog.class.getName());

    public CreateContactDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadImageAndDisplay(DEFAULT_IMAGE_PATH);
        pack();
        this.setLocationRelativeTo(parent);
    }
    
    public Person getNewPerson() {
        return newPerson;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        imgPanel = new javax.swing.JPanel();
        addImgBtn = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        addressLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        birthDateLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        birthdateTextField = new javax.swing.JTextField();
        optionsPanel = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(730, 500));

        titlePanel.setLayout(new java.awt.BorderLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Create new contact");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titlePanel.add(Title, java.awt.BorderLayout.CENTER);

        addImgBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addImgBtn.setText("Add new photo");
        addImgBtn.setFocusable(false);
        addImgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImgBtnActionPerformed(evt);
            }
        });

        imageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setText("text");
        imageLabel.setToolTipText("");
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout imgPanelLayout = new javax.swing.GroupLayout(imgPanel);
        imgPanel.setLayout(imgPanelLayout);
        imgPanelLayout.setHorizontalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addImgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        imgPanelLayout.setVerticalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addImgBtn)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressLabel.setText("Address:");

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastNameLabel.setText("Last name:");

        lastNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        lastNameTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabel.setText("Phone:");

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstNameLabel.setText("First name:");

        birthDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthDateLabel.setText("Birthdate:");

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idLabel.setText("ID:");

        phoneTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneTextField.setForeground(new java.awt.Color(0, 0, 0));
        phoneTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        idTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idTextField.setForeground(new java.awt.Color(0, 0, 0));
        idTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        firstNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        firstNameTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        addressTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressTextField.setForeground(new java.awt.Color(0, 0, 0));
        addressTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addressTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        birthdateTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthdateTextField.setForeground(new java.awt.Color(0, 0, 0));
        birthdateTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthDateLabel)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneTextField)
                            .addComponent(addressTextField)
                            .addComponent(lastNameTextField)
                            .addComponent(firstNameTextField)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addComponent(birthdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        infoPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressTextField, birthdateTextField, firstNameTextField, idTextField, lastNameTextField, phoneTextField});

        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthDateLabel)
                    .addComponent(birthdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        optionsPanel.setPreferredSize(new java.awt.Dimension(438, 52));

        saveBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelBtn)
                    .addComponent(saveBtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadImageAndDisplay(String path) {
        Image image = null;

        try {
            if (path.startsWith("http") || path.startsWith("https")) {
                image = ImageIO.read(new URL(path));
            } else if (path.startsWith("/")) {
                URL imageUrl = getClass().getResource(path);
                if (imageUrl != null) {
                    image = ImageIO.read(imageUrl);
                } else {
                    throw new java.io.FileNotFoundException("Resource not found: " + path);
                }
            } else {
                image = ImageIO.read(new java.io.File(path));
            }
        } catch (java.io.IOException ex) {
            System.err.println("Error loading image from: " + path + ". Detail: " + ex.getMessage());
            imageLabel.setIcon(null);
            imageLabel.setText("Error");
            return;
        }

        if (image != null) {
            
            int labelWidth = imageLabel.getWidth() > 0 ? imageLabel.getWidth() : 200;
            int labelHeight = imageLabel.getHeight() > 0 ? imageLabel.getHeight() : 200;
            
            Image scaledImage = image.getScaledInstance(
                labelWidth,
                labelHeight,
                Image.SCALE_SMOOTH
            );
            
            imageLabel.setIcon(new ImageIcon(scaledImage));
            imageLabel.setText(null);
        } else {
            imageLabel.setIcon(null);
            imageLabel.setText("No Image"); 
        }
    }
    
    private void addImgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImgBtnActionPerformed
    
        Object[] options = {"Local File", "URL from Internet", "Cancel"};
        int choice = JOptionPane.showOptionDialog(
            this,
            "Select the image source:",
            "Load Image",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        String newImagePath = null;

        if (choice == 0) { // Local File
            JFileChooser fileChooser = new JFileChooser();

            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                newImagePath = fileChooser.getSelectedFile().getAbsolutePath();
            }
        } else if (choice == 1) { // URL from Internet
            newImagePath = JOptionPane.showInputDialog(
                this,
                "Enter the image URL (e.g., https://example.com/pic.jpg):",
                "Enter URL",
                JOptionPane.PLAIN_MESSAGE
            );
        }

        if (newImagePath != null && !newImagePath.isEmpty()) {
            
            loadImageAndDisplay(newImagePath);
            this.selectedImagePath = newImagePath;

        }
    }//GEN-LAST:event_addImgBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

        dispose();
        
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        newPerson = new Person();
        newPerson.setId(idTextField.getText());
        newPerson.setFirstName(firstNameTextField.getText());
        newPerson.setLastName(lastNameTextField.getText());
        newPerson.setAddress(addressTextField.getText());
        newPerson.setPhone(phoneTextField.getText());
        newPerson.setBirthdate(birthdateTextField.getText());
        
        if (selectedImagePath.equals(DEFAULT_IMAGE_PATH) || selectedImagePath.isEmpty()) {
            newPerson.setImagePath(null); 
        } else {
            newPerson.setImagePath(selectedImagePath); 
        }
        
        dispose();
       
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton addImgBtn;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JTextField birthdateTextField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
