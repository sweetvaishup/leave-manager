package org.itechkenya.leavemanager.gui;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import org.itechkenya.leavemanager.api.JpaManager;
import org.itechkenya.leavemanager.api.UiManager;
import org.itechkenya.leavemanager.domain.LeaveType;
import org.itechkenya.leavemanager.jpa.exceptions.IllegalOrphanException;
import org.itechkenya.leavemanager.jpa.exceptions.NonexistentEntityException;

/**
 *
 * @author gitahi
 */
public class LeaveTypeFrame extends LeaveManagerFrame {

    /**
     * Creates new form LeaveTypeFrame
     * 
     * @param mainForm
     */
    public LeaveTypeFrame(MainForm mainForm) {
        super(mainForm);
        initComponents();
        configureComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        daysPerMonthLabel = new javax.swing.JLabel();
        daysPerMonthTextField = new javax.swing.JTextField();
        regularCheckBox = new javax.swing.JCheckBox();
        absoluteCheckBox = new javax.swing.JCheckBox();
        activeCheckBox = new javax.swing.JCheckBox();
        newButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Leave Types");

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameLabel.setText("Name");

        daysPerMonthLabel.setText("Days per Month");

        daysPerMonthTextField.setText("0.00");

        regularCheckBox.setText("Default (typically for annual leave)");

        absoluteCheckBox.setText("Absolute (check if leave type includes weekends and holidays)");

        activeCheckBox.setSelected(true);
        activeCheckBox.setText("Active");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daysPerMonthLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField)
                    .addComponent(daysPerMonthTextField)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(absoluteCheckBox)
                            .addComponent(regularCheckBox)
                            .addComponent(activeCheckBox))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysPerMonthLabel)
                    .addComponent(daysPerMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regularCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(absoluteCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activeCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPane.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(closeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        clear();
    }//GEN-LAST:event_newButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (nameTextField.getText().equals("")) {
            UiManager.showWarningMessage(this, "Enter name.", nameTextField);
            return;
        }
        if (daysPerMonthTextField.getText().equals("")) {
            UiManager.showWarningMessage(this, "Enter days to be earned per month.", daysPerMonthTextField);
            return;
        }
        try {
            BigDecimal test = new BigDecimal(daysPerMonthTextField.getText());
            if (test.compareTo(new BigDecimal("999.99")) == 1) {
                UiManager.showWarningMessage(this, "Days to be earned cannot exceed 999.99.", daysPerMonthTextField);
                return;
            }
        } catch (NumberFormatException ex) {
            UiManager.showWarningMessage(this, "Days to be earned per month must be a decimal number with the format ###.##.", daysPerMonthTextField);
            Logger.getLogger(LeaveTypeFrame.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        LeaveType leaveType = (LeaveType) getSelectedItem();
        try {
            if (leaveType == null) {
                leaveType = new LeaveType();
                flesh(leaveType);
                JpaManager.getLtjc().create(leaveType);
                updateTable(leaveType, UpdateType.CREATE);
            } else {
                flesh(leaveType);
                JpaManager.getLtjc().edit(leaveType);
                updateTable(leaveType, UpdateType.EDIT);
            }
            mainForm.dataChanged(this);
            clear();
        } catch (NonexistentEntityException ex) {
            UiManager.showErrorMessage(this, ex.getMessage());
            Logger.getLogger(LeaveTypeFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            UiManager.showErrorMessage(this, ex.getMessage());
            Logger.getLogger(LeaveTypeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        List<Object> selectedItems = getSelectedItems();
        if (UiManager.showDeleteConfirmationMessage(this, selectedItems.size())) {
            for (Object item : selectedItems) {
                LeaveType leaveType = (LeaveType) item;
                try {
                    JpaManager.getLtjc().destroy(leaveType.getId());
                    updateTable(leaveType, UpdateType.DESTROY);
                } catch (IllegalOrphanException ex) {
                    UiManager.showConstraintViolationMessage(this, leaveType.toString());
                    Logger.getLogger(LeaveTypeFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NonexistentEntityException ex) {
                    UiManager.showErrorMessage(this, ex.getMessage());
                    Logger.getLogger(LeaveTypeFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            mainForm.dataChanged(this);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox absoluteCheckBox;
    private javax.swing.JCheckBox activeCheckBox;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel daysPerMonthLabel;
    private javax.swing.JTextField daysPerMonthTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton newButton;
    private javax.swing.JPanel panel;
    private javax.swing.JCheckBox regularCheckBox;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    @Override
    public final void loadData() {
        List<LeaveType> organizationsList = JpaManager.getLtjc().findLeaveTypeEntities();
        LeaveTypeTableModel model = new LeaveTypeTableModel();
        for (LeaveType leaveType : organizationsList) {
            model.createRow(leaveType);
        }
        table.setModel(model);
    }

    @Override
    public void flesh(Object item) {
        LeaveType leaveType = (LeaveType) item;
        if (leaveType != null) {
            leaveType.setName(nameTextField.getText());
            leaveType.setDaysPerMonth(new BigDecimal(daysPerMonthTextField.getText()));
            leaveType.setRegular(regularCheckBox.isSelected());
            leaveType.setAbsolute(absoluteCheckBox.isSelected());
            leaveType.setActive(activeCheckBox.isSelected());
        }
    }

    @Override
    public JButton getOkButton() {
        return saveButton;
    }

    @Override
    public JButton getDeleteButton() {
        return deleteButton;
    }

    @Override
    public JTable getTable() {
        return table;
    }

    @Override
    public void clearFields() {
        nameTextField.setText("");
        daysPerMonthTextField.setText("0.00");
        regularCheckBox.setSelected(false);
        absoluteCheckBox.setSelected(false);
        activeCheckBox.setSelected(true);
    }

    @Override
    public void showSelectedItem(Object item) {
        LeaveType leaveType = (LeaveType) item;
        if (leaveType != null) {
            nameTextField.setText(leaveType.getName());
            daysPerMonthTextField.setText(leaveType.getDaysPerMonth().toPlainString());
            regularCheckBox.setSelected(leaveType.getRegular());
            absoluteCheckBox.setSelected(leaveType.getAbsolute());
            activeCheckBox.setSelected(leaveType.getActive());
        }
    }

    private class LeaveTypeTableModel extends LeaveManagerTableModel {

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            if (rowIndex >= getRows().size()) {
                return null;
            }
            LeaveType leaveType = (LeaveType) getRow(rowIndex);
            switch (columnIndex) {
                case 0:
                    return leaveType.getName();
                case 1:
                    return leaveType.getDaysPerMonth();
                case 2:
                    return leaveType.getRegular();
                case 3:
                    return leaveType.getAbsolute();
                case 4:
                    return leaveType.getActive();
                default:
                    return null;
            }
        }

        @Override
        public String[] getColumns() {
            String[] columns = {"Name", "Days per Month", "Default", "Absolute", "Active"};
            return columns;
        }
    }
}
