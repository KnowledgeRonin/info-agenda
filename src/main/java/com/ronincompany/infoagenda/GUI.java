package com.ronincompany.infoagenda;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;

public class GUI extends javax.swing.JFrame { 
    
    private final List<Person> agenda;
    private int currentIndex = 0;
    
    private ContactPanel contactPanel;
    private SearchResultsPanel searchResultsPanel;
    
    public GUI() {
        
        initComponents();
        agenda = createInitialData();
        contactPanel = new ContactPanel(this);
        searchResultsPanel = new SearchResultsPanel(this);
        placeholderPanel.setLayout(new java.awt.CardLayout());
        placeholderPanel.add(contactPanel, "CONTACT");
        placeholderPanel.add(searchResultsPanel, "SEARCH");
        placeholderPanel.revalidate();
        placeholderPanel.repaint();
        showContactPanel();
    }
    
    private List<Person> createInitialData() {
        List<Person> contacts = new ArrayList<>();
        String ids[] = {"23.456.789", "18.234.567", "27.678.901", "19.345.678", "22.567.890", "21.234.567", "20.789.012", "25.890.123", "24.678.901", "26.345.678"};
        String firstNames[] = {"María", "Juan", "Ana", "Carlos", "Luisa", "Pedro", "Laura", "José", "Carmen", "Miguel"};
        String lastNames[] = {"Pérez", "López", "Castillo", "Morales", "Torres", "Herrera", "Suárez", "Flores", "Gil", "Mendoza"};
        String addresses[] = {"Los Almendros Ave, Caracas", "Solano Street, Maracaibo", "La Trinidad Res., Valencia", "Las Palmas Ave, Barquisimeto", "Los Próceres Street, Mérida", "El Bosque Res., Puerto Ordaz", "Bolivar Ave, Cumaná", "Main Street, Maturin", "El Hatillo Res., San Cristobal", "Libertador Ave, Maracay"};
        String phones[] = {"0412-1234567", "0414-2345678", "0416-3456789", "0412-4567890", "0414-5678901", "0416-6789012", "0412-7890123", "0414-8901234", "0416-9012345", "0412-0123456"};
        String birthDates[] = {"15/03/1985", "22/07/1990", "30/11/1992", "10/01/1988", "05/05/1983", "12/09/1986", "18/02/1994", "25/06/1987", "09/12/1991", "03/08/1989"};

        for (int i = 0; i < ids.length; i++) {
            Person p = new Person(ids[i], firstNames[i], lastNames[i], addresses[i], phones[i], birthDates[i]);
            contacts.add(p);
        }
        return contacts;
    }
    
    public void showContactPanel() {
        CardLayout cl = (CardLayout) placeholderPanel.getLayout();
        cl.show(placeholderPanel, "CONTACT");
        contactPanel.displayContact(agenda.get(currentIndex), currentIndex);
    }
    
    public void showSearchResultsPanel(List<Person> results, String searchTerm) {
        searchResultsPanel.loadResults(results, searchTerm);
        CardLayout cl = (CardLayout) placeholderPanel.getLayout();
        cl.show(placeholderPanel, "SEARCH");
    }
    
    public void showContactById(String id) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getId().equals(id)) {
                this.currentIndex = i;
                showContactPanel();
                return;
            }
        }
    }
    
    public void nextContact() {
        if (currentIndex < agenda.size() - 1) {
            currentIndex++;
            contactPanel.displayContact(agenda.get(currentIndex), currentIndex);
        }
    }

    public void previousContact() {
        if (currentIndex > 0) {
            currentIndex--;
            contactPanel.displayContact(agenda.get(currentIndex), currentIndex);
        }
    }

    public void performSearch(String searchTerm) {
        String normalizedTerm = ContactPanel.normalize(searchTerm); 
        List<Person> results = new ArrayList<>();

        for (Person person : agenda) {
            if (ContactPanel.normalize(person.getId()).contains(normalizedTerm)
                || ContactPanel.normalize(person.getFirstName()).contains(normalizedTerm)
                || ContactPanel.normalize(person.getLastName()).contains(normalizedTerm)
                || ContactPanel.normalize(person.getAddress()).contains(normalizedTerm)
                || ContactPanel.normalize(person.getPhone()).contains(normalizedTerm)
                || ContactPanel.normalize(person.getBirthDate()).contains(normalizedTerm)) {

                results.add(person);
            }
        }

        if (results.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No results found.");
        } else {
            showSearchResultsPanel(results, normalizedTerm); 
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placeholderPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setResizable(false);

        javax.swing.GroupLayout placeholderPanelLayout = new javax.swing.GroupLayout(placeholderPanel);
        placeholderPanel.setLayout(placeholderPanelLayout);
        placeholderPanelLayout.setHorizontalGroup(
            placeholderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        placeholderPanelLayout.setVerticalGroup(
            placeholderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeholderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeholderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel placeholderPanel;
    // End of variables declaration//GEN-END:variables
}
