package com.ronincompany.infoagenda;

import java.awt.event.KeyEvent;
import java.text.Normalizer;

public class ContactPanel extends javax.swing.JPanel {
    
    private GUI parent;
    private String currentSortKey = "ID";
    private Person displayedPerson;

    public ContactPanel(GUI parent) {
        this.parent = parent;
        initComponents();
    }
    
    public void displayContact(Person person, int index) {
        
        idTextField.setText(person.getId());
        firstNameTextField.setText(person.getFirstName());
        lastNameTextField.setText(person.getLastName());
        addressTextField.setText(person.getAddress());
        phoneTextField.setText(person.getPhone());
        birthDateTextField.setText(person.getBirthDate());
        indexNumber.setText(String.valueOf(index+1));
    }
    
    public static String normalize(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{M}", "").toLowerCase();
    }
    
    public void resetSearchField() {
            searchTextField.setText("");
    }
    
    private void executeSearch() {
    String currentSearchTerm = searchTextField.getText().trim();
    String sortKey = (String) sortOptionsCombo.getSelectedItem();
    this.parent.performSearchAndSort(currentSearchTerm, sortKey);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        birthDateLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        birthDateTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        nextBtn = new javax.swing.JButton();
        indexLabel = new javax.swing.JLabel();
        prevBtn = new javax.swing.JButton();
        indexNumber = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortOptionsCombo = new javax.swing.JComboBox<>();
        sortLabel = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();

        Title.setFont(new java.awt.Font("Lilex", 1, 36)); // NOI18N
        Title.setText("Electronic Agenda");

        idLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        idLabel.setText("ID               :");

        firstNameLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        firstNameLabel.setText("First name :");

        lastNameLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        lastNameLabel.setText("Last name :");

        lastNameTextField.setEditable(false);
        lastNameTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        lastNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        lastNameTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        addressLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        addressLabel.setText("Address  :");

        phoneLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        phoneLabel.setText("Phone     :");

        birthDateLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        birthDateLabel.setText("Birthdate :");

        addressTextField.setEditable(false);
        addressTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        addressTextField.setForeground(new java.awt.Color(0, 0, 0));
        addressTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addressTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        phoneTextField.setEditable(false);
        phoneTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        phoneTextField.setForeground(new java.awt.Color(0, 0, 0));
        phoneTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        birthDateTextField.setEditable(false);
        birthDateTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        birthDateTextField.setForeground(new java.awt.Color(0, 0, 0));
        birthDateTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        idTextField.setForeground(new java.awt.Color(0, 0, 0));
        idTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        firstNameTextField.setEditable(false);
        firstNameTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        firstNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        firstNameTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(idLabel))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel)
                            .addComponent(birthDateLabel))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTextField)
                            .addComponent(birthDateTextField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(addressLabel)
                        .addGap(6, 6, 6)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(birthDateLabel)
                    .addComponent(birthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        nextBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        nextBtn.setText(">>");
        nextBtn.setToolTipText("");
        nextBtn.setFocusable(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        indexLabel.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        indexLabel.setText("Page");
        indexLabel.setToolTipText("");

        prevBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        prevBtn.setText("<<");
        prevBtn.setFocusable(false);
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        indexNumber.setEditable(false);
        indexNumber.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        indexNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        indexNumber.setText("0");
        indexNumber.setCaretColor(new java.awt.Color(0, 0, 0));
        indexNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        indexNumber.setFocusable(false);

        searchTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setFocusable(false);
        searchBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        searchBtn.setPreferredSize(new java.awt.Dimension(100, 34));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        sortOptionsCombo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        sortOptionsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "First Name (A-Z)", "Last Name (A-Z)" }));
        sortOptionsCombo.setFocusable(false);
        sortOptionsCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sortOptionsComboItemStateChanged(evt);
            }
        });

        sortLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        sortLabel.setText("Sort by:");

        editBtn.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        editBtn.setText("Edit");
        editBtn.setFocusable(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setFocusable(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        createBtn.setText("Create new contact");
        createBtn.setFocusable(false);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(prevBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indexLabel)
                        .addGap(18, 18, 18)
                        .addComponent(indexNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(sortLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortOptionsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortOptionsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editBtn)
                        .addComponent(deleteBtn)
                        .addComponent(createBtn)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

        parent.nextContact();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed

        parent.previousContact();
    }//GEN-LAST:event_prevBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        executeSearch();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void sortOptionsComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sortOptionsComboItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            currentSortKey = (String) evt.getItem(); 
        }
        
    }//GEN-LAST:event_sortOptionsComboItemStateChanged

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            executeSearch();
        }
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
      
        if ("Edit".equals(editBtn.getText())) {
            idTextField.setEditable(true);
            firstNameTextField.setEditable(true);
            lastNameTextField.setEditable(true);
            addressTextField.setEditable(true);
            phoneTextField.setEditable(true);
            birthDateTextField.setEditable(true);
            editBtn.setText("Save");
        } else {
            
            if (this.displayedPerson == null) {
                this.displayedPerson = new Person();
            }
            
            Person currentPerson = this.displayedPerson;

            currentPerson.setId(idTextField.getText());
            currentPerson.setFirstName(firstNameTextField.getText());
            currentPerson.setLastName(lastNameTextField.getText());
            currentPerson.setAddress(addressTextField.getText());
            currentPerson.setPhone(phoneTextField.getText());
            currentPerson.setBirthDate(birthDateTextField.getText());

            parent.updateContact(currentPerson);

            idTextField.setEditable(false);
            firstNameTextField.setEditable(false);
            lastNameTextField.setEditable(false);
            addressTextField.setEditable(false);
            phoneTextField.setEditable(false);
            birthDateTextField.setEditable(false);
            editBtn.setText("Edit");
        }
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
 
            idTextField.setText("");
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            addressTextField.setText("");
            phoneTextField.setText("");
            birthDateTextField.setText("");
        
            idTextField.setEditable(true);
            firstNameTextField.setEditable(true);
            lastNameTextField.setEditable(true);
            addressTextField.setEditable(true);
            phoneTextField.setEditable(true);
            birthDateTextField.setEditable(true);
            
            if (this.displayedPerson == null) {
                this.displayedPerson = new Person();
            }
            
            Person currentPerson = this.displayedPerson;

            currentPerson.setId(idTextField.getText());
            currentPerson.setFirstName(firstNameTextField.getText());
            currentPerson.setLastName(lastNameTextField.getText());
            currentPerson.setAddress(addressTextField.getText());
            currentPerson.setPhone(phoneTextField.getText());
            currentPerson.setBirthDate(birthDateTextField.getText());

            parent.updateContact(currentPerson);

            idTextField.setEditable(false);
            firstNameTextField.setEditable(false);
            lastNameTextField.setEditable(false);
            addressTextField.setEditable(false);
            phoneTextField.setEditable(false);
            birthDateTextField.setEditable(false);
            editBtn.setText("Edit");
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed

        
        
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JTextField birthDateTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel indexLabel;
    private javax.swing.JTextField indexNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JComboBox<String> sortOptionsCombo;
    // End of variables declaration//GEN-END:variables
}
