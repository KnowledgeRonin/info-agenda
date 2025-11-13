package com.ronincompany.infoagenda;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import org.apache.commons.text.similarity.LevenshteinDistance;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GUI extends javax.swing.JFrame { 
    
    private final List<Person> agenda;
    private int currentIndex = 0;
    private static final int LEVENSHTEIN_THRESHOLD = 3;
    
    private ContactPanel contactPanel;
    private SearchResultsPanel searchResultsPanel;
    
    public GUI() {
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        } catch (ClassNotFoundException | InstantiationException | 
                 IllegalAccessException | UnsupportedLookAndFeelException e1) {
            
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | 
                     IllegalAccessException | UnsupportedLookAndFeelException e2) {
                
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e3) {
                }
            }
        }
        
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
        String ids[] = {"23.456.789", "18.234.567", "20.743.854", "19.345.678", "22.567.890"};
        String firstNames[] = {"María", "Juan", "Ana", "Carlos", "José"};
        String lastNames[] = {"Pérez", "López", "Castillo", "Morales", "Torres"};
        String addresses[] = {"Los Almendros Ave, Caracas", "Solano Street, Maracaibo", "La Trinidad Res., Valencia", "Las Palmas Ave, Barquisimeto", "Los Próceres Street, Mérida"};
        String phones[] = {"0412-1234567", "0414-2345678", "0416-3456789", "0412-4567890", "0414-5678901"};
        String birthDates[] = {"15/03/1985", "22/07/1990", "30/11/1992", "10/01/1988", "05/05/1983"};

        for (int i = 0; i < ids.length; i++) {
            Person p = new Person(ids[i], firstNames[i], lastNames[i], addresses[i], phones[i], birthDates[i]);
            contacts.add(p);
        }
        return contacts;
    }
    
    private Comparator<Person> getComparator(String sortKey) {
    if (sortKey == null) {
        return null; 
    }
    
        switch (sortKey) {
            case "First Name":
                return Comparator.comparing(Person::getFirstName, String.CASE_INSENSITIVE_ORDER);
            case "Last Name":
                return Comparator.comparing(Person::getLastName, String.CASE_INSENSITIVE_ORDER);
            case "ID":
                return Comparator.comparing(Person::getId, String.CASE_INSENSITIVE_ORDER);
            default:
                return null;
        }
    }
    
    public void showContactPanel() {
        CardLayout cl = (CardLayout) placeholderPanel.getLayout();
        contactPanel.resetSearchField();
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
    
    public void updateContact(Person updatedPerson) {
        
        agenda.set(currentIndex, updatedPerson);
    
        javax.swing.JOptionPane.showMessageDialog(this, "Contact information updated successfully.", "Saved", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        this.contactPanel.displayContact(updatedPerson, this.currentIndex);
    }
    
    public void addNewContact(Person person) {
        
        this.agenda.add(person);
        
        List<Person> listToShow = this.agenda;

        int newIndex = -1;
        
        for (int i = 0; i < listToShow.size(); i++) {
            
            if (listToShow.get(i).getId().equals(person.getId())) {
                newIndex = i;
                break;
            }
        }

        if (newIndex != -1) {
            
            this.currentIndex = newIndex; 

            this.contactPanel.displayContact(listToShow.get(newIndex), newIndex);
        }
        
        
    }
    
    private boolean isFuzzyMatch(Person person, String normalizedTerm) {
        
        if (normalizedTerm.isEmpty()) return true;

        LevenshteinDistance distance = LevenshteinDistance.getDefaultInstance();

        String normTerm = normalizedTerm;

        String normFirstName = ContactPanel.normalize(person.getFirstName());
        if (distance.apply(normFirstName, normTerm) <= LEVENSHTEIN_THRESHOLD) {
            return true;
        }

        String normLastName = ContactPanel.normalize(person.getLastName());
        if (distance.apply(normLastName, normTerm) <= LEVENSHTEIN_THRESHOLD) {
            return true;
        }
    
        String normId = ContactPanel.normalize(person.getId());
        if (distance.apply(normId, normTerm) <= LEVENSHTEIN_THRESHOLD) {
            return true;
        }
    
        String normPhone = ContactPanel.normalize(person.getPhone());
        if (distance.apply(normPhone, normTerm) <= LEVENSHTEIN_THRESHOLD) {
            return true;
        }
        
        String normAddress = ContactPanel.normalize(person.getAddress());
        if (normAddress.contains(normTerm)) {
            return true;
        }
    
        return false;
        }

    public void performSearchAndSort(String searchTerm, String sortKey) {
        
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a search term.");
        return;
        }
        
        String normalizedTerm = ContactPanel.normalize(searchTerm); 
        List<Person> results = new ArrayList<>();

        for (Person person : agenda) {
            if (isFuzzyMatch(person, normalizedTerm)) {
                results.add(person);
            }
        }
        
        Comparator<Person> comparator = getComparator(sortKey);
        if (comparator != null) {
            results.sort(comparator);
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
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);

        javax.swing.GroupLayout placeholderPanelLayout = new javax.swing.GroupLayout(placeholderPanel);
        placeholderPanel.setLayout(placeholderPanelLayout);
        placeholderPanelLayout.setHorizontalGroup(
            placeholderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        placeholderPanelLayout.setVerticalGroup(
            placeholderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
