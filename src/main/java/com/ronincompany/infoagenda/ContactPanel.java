package com.ronincompany.infoagenda;

import java.awt.event.KeyEvent;
import java.text.Normalizer;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ContactPanel extends javax.swing.JPanel {
    
    private GUI parent;
    private String currentSortKey = "ID";
    private Person displayedPerson;
    private static final String DEFAULT_IMAGE_PATH = "/resources/no_img.jpg";

    public ContactPanel(GUI parent) {
        this.parent = parent;
        initComponents();
        deleteBtn.setBorderPainted(false);
        deleteBtn.setText("");
        cancelBtn.setBorderPainted(false);
        cancelBtn.setText("");
        addImgBtn.setBorderPainted(false);
        addImgBtn.setText("");
    }
    
    public void displayContact(Person person, int index) {
        
        idTextField.setText(person.getId());
        firstNameTextField.setText(person.getFirstName());
        lastNameTextField.setText(person.getLastName());
        addressTextField.setText(person.getAddress());
        phoneTextField.setText(person.getPhone());
        birthdateTextField.setText(person.getBirthDate());
        indexNumber.setText(String.valueOf(index+1));
        
        String imagePathToUse = person.getImagePath();
          
        if (imagePathToUse == null || imagePathToUse.trim().isEmpty()) {
        imagePathToUse = DEFAULT_IMAGE_PATH;
        }
    
        loadImageAndDisplay(imagePathToUse);
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
        birthdateTextField = new javax.swing.JTextField();
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
        cancelBtn = new javax.swing.JButton();
        addImgBtn = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(860, 700));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setText("Electronic Agenda");

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idLabel.setText("ID:");

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstNameLabel.setText("First name:");

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastNameLabel.setText("Last name:");

        lastNameTextField.setEditable(false);
        lastNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        lastNameTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lastNameTextField.setFocusable(false);

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressLabel.setText("Address:");

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabel.setText("Phone:");

        birthDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthDateLabel.setText("Birthdate:");

        addressTextField.setEditable(false);
        addressTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressTextField.setForeground(new java.awt.Color(0, 0, 0));
        addressTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addressTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        addressTextField.setFocusable(false);

        phoneTextField.setEditable(false);
        phoneTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneTextField.setForeground(new java.awt.Color(0, 0, 0));
        phoneTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        phoneTextField.setFocusable(false);

        birthdateTextField.setEditable(false);
        birthdateTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthdateTextField.setForeground(new java.awt.Color(0, 0, 0));
        birthdateTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        birthdateTextField.setFocusable(false);

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idTextField.setForeground(new java.awt.Color(0, 0, 0));
        idTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        idTextField.setFocusable(false);

        firstNameTextField.setEditable(false);
        firstNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        firstNameTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        firstNameTextField.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(addressLabel)
                    .addComponent(phoneLabel)
                    .addComponent(birthDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressTextField, birthdateTextField, firstNameTextField, idTextField, lastNameTextField, phoneTextField});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthDateLabel)
                    .addComponent(birthdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        nextBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        nextBtn.setText(">>");
        nextBtn.setToolTipText("");
        nextBtn.setFocusable(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        indexLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        indexLabel.setText("Page");
        indexLabel.setToolTipText("");

        prevBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        prevBtn.setText("<<");
        prevBtn.setFocusable(false);
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        indexNumber.setEditable(false);
        indexNumber.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        indexNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        indexNumber.setText("0");
        indexNumber.setCaretColor(new java.awt.Color(0, 0, 0));
        indexNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        indexNumber.setFocusable(false);

        searchTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setFocusable(false);
        searchBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        searchBtn.setPreferredSize(new java.awt.Dimension(100, 34));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        sortOptionsCombo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sortOptionsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "First Name (A-Z)", "Last Name (A-Z)" }));
        sortOptionsCombo.setFocusable(false);
        sortOptionsCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sortOptionsComboItemStateChanged(evt);
            }
        });

        sortLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sortLabel.setText("Sort by:");

        editBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editBtn.setText("Edit");
        editBtn.setFocusable(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteBtn.setText("Delete all");
        deleteBtn.setBorderPainted(false);
        deleteBtn.setEnabled(false);
        deleteBtn.setFocusable(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createBtn.setText("Create new contact");
        createBtn.setFocusable(false);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.setEnabled(false);
        cancelBtn.setFocusable(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        addImgBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addImgBtn.setText("Replace photo");
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addImgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sortLabel)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sortOptionsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addImgBtn)
                        .addGap(63, 63, 63)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortOptionsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editBtn)
                                .addComponent(deleteBtn)
                                .addComponent(createBtn)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
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
            birthdateTextField.setEditable(true);
            idTextField.setFocusable(true);
            firstNameTextField.setFocusable(true);
            lastNameTextField.setFocusable(true);
            addressTextField.setFocusable(true);
            phoneTextField.setFocusable(true);
            birthdateTextField.setFocusable(true);
            editBtn.setText("Save");
            
            deleteBtn.setBorderPainted(true);
            deleteBtn.setText("Delete");
            deleteBtn.setEnabled(true);
            cancelBtn.setBorderPainted(true);
            cancelBtn.setText("Cancel");
            cancelBtn.setEnabled(true);
            addImgBtn.setBorderPainted(true);
            addImgBtn.setText("Replace image");
            addImgBtn.setEnabled(true);
            
            createBtn.setEnabled(false);
            searchBtn.setEnabled(false);
            searchTextField.setEnabled(false);
            
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
            currentPerson.setBirthdate(birthdateTextField.getText());

            parent.updateContact(currentPerson);

            idTextField.setEditable(false);
            firstNameTextField.setEditable(false);
            lastNameTextField.setEditable(false);
            addressTextField.setEditable(false);
            phoneTextField.setEditable(false);
            birthdateTextField.setEditable(false);
            idTextField.setFocusable(false);
            firstNameTextField.setFocusable(false);
            lastNameTextField.setFocusable(false);
            addressTextField.setFocusable(false);
            phoneTextField.setFocusable(false);
            birthdateTextField.setFocusable(false);
            editBtn.setText("Edit");
            
            deleteBtn.setBorderPainted(false);
            deleteBtn.setText("");
            deleteBtn.setEnabled(false);
            cancelBtn.setBorderPainted(false);
            cancelBtn.setText("");
            cancelBtn.setEnabled(false);
            addImgBtn.setBorderPainted(false);
            addImgBtn.setText("");
            addImgBtn.setEnabled(false);
            
            createBtn.setEnabled(true);
            searchBtn.setEnabled(true);
            searchTextField.setEnabled(true);
            
        }
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
 
            idTextField.setText("");
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            addressTextField.setText("");
            phoneTextField.setText("");
            birthdateTextField.setText("");
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed

        CreateContactDialog dialog = new CreateContactDialog(parent, true);
    
        dialog.setVisible(true);

        Person newPerson = dialog.getNewPerson();
    
        if (newPerson != null) {
            this.parent.addNewContact(newPerson); 
        }
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
   
        idTextField.setEditable(false);
        firstNameTextField.setEditable(false);
        lastNameTextField.setEditable(false);
        addressTextField.setEditable(false);
        phoneTextField.setEditable(false);
        birthdateTextField.setEditable(false);
        idTextField.setFocusable(false);
        firstNameTextField.setFocusable(false);
        lastNameTextField.setFocusable(false);
        addressTextField.setFocusable(false);
        phoneTextField.setFocusable(false);
        birthdateTextField.setFocusable(false);
        editBtn.setText("Edit");
            
        deleteBtn.setBorderPainted(false);
        deleteBtn.setText("");
        deleteBtn.setEnabled(false);
        cancelBtn.setBorderPainted(false);
        cancelBtn.setText("");
        cancelBtn.setEnabled(false);
        addImgBtn.setBorderPainted(false);
        addImgBtn.setText("");
        addImgBtn.setEnabled(false);
            
        createBtn.setEnabled(true);
        searchBtn.setEnabled(true);
        searchTextField.setEnabled(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addImgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImgBtnActionPerformed

        /*    Object[] options = {"Local File", "URL from Internet", "Cancel"};
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
            // Opcional: Agregar filtros para solo mostrar archivos de imagen

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
            // 1. Cargar la imagen en la UI para previsualizar.
            loadImageAndDisplay(newImagePath);

            // 2. Almacenar la ruta/URL en el objeto de persona actualmente mostrado.
            // Asumiendo que `this.displayedPerson` es el contacto actual:
            if (this.displayedPerson != null) {
                this.displayedPerson.setImagePath(newImagePath);
            }

            // **IMPORTANTE:** Cuando el usuario presione "Save" (en el modo "Edit"),
            // asegúrate de que el método `editBtnActionPerformed` llame a `parent.updateContact()`
            // y que este método guarde la nueva `imagePath` en la base de datos/archivo.
        }
        */
    }//GEN-LAST:event_addImgBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton addImgBtn;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JTextField birthdateTextField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel imageLabel;
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
