package com.ronincompany.infoagenda;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;

public class SearchResultsPanel extends javax.swing.JPanel {

    private GUI parent;
    private List<Person> searchResults;
   
    public SearchResultsPanel(GUI parent) {
        
        this.parent = parent;
        this.searchResults = new ArrayList<>();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortOptionsCombo = new javax.swing.JComboBox<>();
        sortLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        resultsTable.setFont(new java.awt.Font("Lilex ExtraLight", 0, 12)); // NOI18N
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Index", "First Name", "Last Name", "ID", "Title 5"
            }
        ));
        resultsTable.setEditingColumn(0);
        resultsTable.setEditingRow(0);
        resultsTable.setRowHeight(32);
        resultsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultsTableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(resultsTable);

        backBtn.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        backBtn.setText("Back");
        backBtn.setFocusable(false);
        backBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        backBtn.setPreferredSize(new java.awt.Dimension(100, 34));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N

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
        sortOptionsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "First Name", "Last Name" }));
        sortOptionsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortOptionsComboActionPerformed(evt);
            }
        });

        sortLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        sortLabel.setText("Sort by:");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Coincidences");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sortLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortOptionsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(344, 344, 344))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortOptionsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortLabel))
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void resultsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultsTableMouseClicked

        int selectedRow = resultsTable.getSelectedRow();
        if (selectedRow != -1) {
            Person selectedPerson = searchResults.get(selectedRow);
            
            parent.showContactById(selectedPerson.getId());
        }
        
    }//GEN-LAST:event_resultsTableMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        this.parent.showContactPanel();
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        String currentSearchTerm = searchTextField.getText().trim();
        String sortKey = (String) sortOptionsCombo.getSelectedItem();
        this.parent.performSearchAndSort(currentSearchTerm, sortKey);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void sortOptionsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortOptionsComboActionPerformed

        String currentSearchTerm = searchTextField.getText().trim();
        String sortKey = (String) sortOptionsCombo.getSelectedItem();
        this.parent.performSearchAndSort(currentSearchTerm, sortKey);

    }//GEN-LAST:event_sortOptionsComboActionPerformed

    public void loadResults(List<Person> results, String searchTerm) {
        
        this.searchResults = results; 
        
        String[] columnNames = {"ID", "First Name", "Last Name", "Address", "Phone", "Birthday"};
        Object[][] data = new Object[results.size()][columnNames.length];

        for (int i = 0; i < results.size(); i++) {
            Person p = results.get(i);
            data[i][0] = p.getId();
            data[i][1] = p.getFirstName();
            data[i][2] = p.getLastName();
            data[i][3] = p.getAddress();
            data[i][4] = p.getPhone();
            data[i][5] = p.getBirthDate();
        }
        
        if (searchTerm != null) {
            searchTextField.setText(searchTerm);
        } else {
            searchTextField.setText("");
        }

        resultsTable.setModel(new javax.swing.table.DefaultTableModel(data, columnNames) {
             @Override
             public boolean isCellEditable(int row, int column) {
                 return false;
             }
        });
        
        resultsTable.setDefaultRenderer(Object.class, new HighlightRenderer(searchTerm));
    }
    
    class HighlightRenderer extends DefaultTableCellRenderer {

        private String normalizedSearchText;

        public HighlightRenderer(String originalSearchText) {
            this.normalizedSearchText = ContactPanel.normalize(originalSearchText);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            
            if (value != null && !normalizedSearchText.isEmpty()) {
            
                String normalizedCellValue = ContactPanel.normalize(value.toString());

                if (normalizedCellValue.contains(normalizedSearchText)) {
                    c.setBackground(Color.YELLOW);
                } else {
                    c.setBackground(Color.WHITE);
                }
            } else {
                c.setBackground(Color.WHITE);
            }

            return c;
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable resultsTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JComboBox<String> sortOptionsCombo;
    // End of variables declaration//GEN-END:variables
}
