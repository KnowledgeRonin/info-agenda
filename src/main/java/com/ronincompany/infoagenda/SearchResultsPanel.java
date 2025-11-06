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
        resultsTable.setRowHeight(25);
        resultsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultsTableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(resultsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void resultsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultsTableMouseClicked
        
        int selectedRow = resultsTable.getSelectedRow();
        if (selectedRow != -1) {
            Person selectedPerson = searchResults.get(selectedRow);
            
            parent.showContactById(selectedPerson.getId());
        }
        
    }//GEN-LAST:event_resultsTableMouseClicked

    public void loadResults(List<Person> results, String searchTerm) {
        
        this.searchResults = results; 
        
        String[] columnNames = {"ID", "First Name", "Last Name", "Address", "Phone", "Birthday"};
        Object[][] data = new Object[results.size()][6];

        for (int i = 0; i < results.size(); i++) {
            Person p = results.get(i);
            data[i][0] = p.getId();
            data[i][1] = p.getFirstName();
            data[i][2] = p.getLastName();
            data[i][3] = p.getAddress();
            data[i][4] = p.getPhone();
            data[i][5] = p.getBirthDate();
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

        private String searchText;

        public HighlightRenderer(String searchText) {
            this.searchText = searchText;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (value != null && value.toString().toLowerCase().contains(searchText)) {
                c.setBackground(Color.YELLOW);
            } else {
                c.setBackground(Color.WHITE);
            }

            return c;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable resultsTable;
    // End of variables declaration//GEN-END:variables
}
