/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.login.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Table Model for Login Center.
 * @author abelbcarvalho
 */
public class LoginTable extends AbstractTableModel {
    private final List<Login> data = new ArrayList<>();
    private final String[] columns = {"ID","Site","Link","Usuário","E-Mail","Senha","Deletar"};

    /**
     * New Instance of LoginTable Model Class.
     */
    public LoginTable() {
        super();
    }

    /**
     * Inserts column name.
     * @param column Integer
     * @return String
     */
    @Override
    public String getColumnName(int column) {
        return this.columns[column];
    }

    /**
     * Row Number.
     * @return Integer
     */
    @Override
    public int getRowCount() {
        return this.data.size();
    }

    /**
     * Column number.
     * @return Integer
     */
    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    /**
     * When updates, it is for insert column by column.
     * @param line Integer - Line.
     * @param col Integer - Column.
     * @return Object that represents the cell.
     */
    @Override
    public Object getValueAt(int line, int col) {
        switch (col) {
            case 0:
                return data.get(line).getId();
            case 1:
                return data.get(line).getSiteLogin();
            case 2:
                return data.get(line).getUrlSiteLogin();
            case 3:
                return data.get(line).getEmailLogin();
            case 4:
                return data.get(line).getPassLogin();
        }
        return null;
    }
    
    /**
     * Inserts a new line.
     * @param login Login Object
     * @param line Line number
     */
    public void addRow(Login login, int line) {
        // creating icon
        this.data.add(login);
        this.fireTableDataChanged(); // update table
    }
    
    /**
     * Removes a single row.
     * @param indx Integer
     */
    public void removeRow(int indx) {
        this.data.remove(indx);
        this.fireTableRowsDeleted(indx, indx);
    }
    
    /**
     * Cleans the JTable.
     */
    public void removeAllRows() {
        int end = this.getRowCount();
        this.data.clear();
        this.fireTableRowsDeleted(0, end);
    }
    
}
