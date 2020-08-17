/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.site.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Table Model for Site Center.
 * @author abelbcarvalho
 */
public class SiteTable extends AbstractTableModel {
    private final List<Site> data = new ArrayList<>();
    private final String[] columns = {"ID","Nome do Site","Link do Site","Deletar"};

    /**
     * New Instance of SiteTable Model Class.
     */
    public SiteTable() {
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
                return this.data.get(line).getNameSite();
            case 2:
                return this.data.get(line).getUrlSite();
        }
        return null;
    }
    
    /**
     * Inserts a new line.
     * @param site Site Object
     * @param line Line number
     */
    public void addRow(Site site, int line) {
        // creating icon
        this.data.add(site);
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
