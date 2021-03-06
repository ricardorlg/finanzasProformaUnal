/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.finanzas.proforma.vista;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author ricardo
 */
public class DecisionesInversion extends javax.swing.JPanel {

    private NumberFormat amountDisplayFormat;
    private NumberFormat amountEditFormat;

    /**
     * Creates new form DecisionesInversion
     */
    public DecisionesInversion() {
        setUpFormats();

        initComponents();
    }

    private void setUpFormats() {
        // NumberFormat nf=NumberFormat.getInstance(Locale.US);
        amountDisplayFormat = NumberFormat.getCurrencyInstance(Locale.US);
        amountDisplayFormat.setMinimumFractionDigits(2);
        amountEditFormat = NumberFormat.getNumberInstance(Locale.US);


    }

    private void camposObligatorios(JFormattedTextField campo, JLabel etiqueta) {
        if (campo.getValue() == null) {
            etiqueta.setIcon(new ImageIcon(getClass().getResource("/co/edu/unal/finanzas/proforma/resources/x.png")));

        } else {
            etiqueta.setIcon(null);
        }
    }

    public JFormattedTextField getShortTermInvestment() {
        return shortTermInvestment;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        shortTermInvLabel = new javax.swing.JLabel();
        shortTermInvestment = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        unitsMacPurLabel = new javax.swing.JLabel();
        unitsMachineryPur = new javax.swing.JFormattedTextField();
        unitsPlantPurLabel = new javax.swing.JLabel();
        unitsPlantPurchased = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Decisiones de Inversión"));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        shortTermInvLabel.setText("Short-term investment:");
        jPanel1.add(shortTermInvLabel);

        shortTermInvestment.setFormatterFactory(new DefaultFormatterFactory(
            new NumberFormatter(amountDisplayFormat),
            new NumberFormatter(amountDisplayFormat),
            new NumberFormatter(amountEditFormat)));
    shortTermInvestment.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            shortTermInvestmentPropertyChange(evt);
        }
    });
    jPanel1.add(shortTermInvestment);

    jLabel2.setText("Risk of short-term investment:");
    jPanel1.add(jLabel2);

    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
    jPanel1.add(jComboBox3);

    unitsMacPurLabel.setText("Units of machinery purchased:");
    jPanel1.add(unitsMacPurLabel);

    unitsMachineryPur.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
    unitsMachineryPur.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            unitsMachineryPurPropertyChange(evt);
        }
    });
    jPanel1.add(unitsMachineryPur);

    unitsPlantPurLabel.setText("Units of plant purchased:");
    jPanel1.add(unitsPlantPurLabel);

    unitsPlantPurchased.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
    unitsPlantPurchased.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            unitsPlantPurchasedPropertyChange(evt);
        }
    });
    jPanel1.add(unitsPlantPurchased);

    jLabel5.setText("Capital budgeting project A:");
    jPanel1.add(jLabel5);

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "no", "yes" }));
    jPanel1.add(jComboBox1);

    jLabel6.setText("Capital budgeting project B:");
    jPanel1.add(jLabel6);

    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "no", "yes" }));
    jPanel1.add(jComboBox2);

    add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void unitsPlantPurchasedPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_unitsPlantPurchasedPropertyChange
        camposObligatorios(unitsPlantPurchased, unitsPlantPurLabel);
    }//GEN-LAST:event_unitsPlantPurchasedPropertyChange

    private void unitsMachineryPurPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_unitsMachineryPurPropertyChange
        camposObligatorios(unitsMachineryPur, unitsMacPurLabel);
    }//GEN-LAST:event_unitsMachineryPurPropertyChange

    private void shortTermInvestmentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_shortTermInvestmentPropertyChange
        camposObligatorios(shortTermInvestment, shortTermInvLabel);
    }//GEN-LAST:event_shortTermInvestmentPropertyChange
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel shortTermInvLabel;
    private javax.swing.JFormattedTextField shortTermInvestment;
    private javax.swing.JLabel unitsMacPurLabel;
    private javax.swing.JFormattedTextField unitsMachineryPur;
    private javax.swing.JLabel unitsPlantPurLabel;
    private javax.swing.JFormattedTextField unitsPlantPurchased;
    // End of variables declaration//GEN-END:variables
}
