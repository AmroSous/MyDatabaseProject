/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * 
 *
 * @author lenovo
 */
public class Main {
    
    public static final String URL = "jdbc:oracle:thin:c##company/123@localhost:1521/XE";

    public static void main(String[] args) {

        Thread thread = new Thread(new SplashScreen());
        thread.start();

        //new Home("amrosous").setVisible(true);
   
    }
    
    public static void buildTableModel(ResultSet rs, JTable table)
        throws SQLException {
 
    
    DefaultTableModel dtm = (DefaultTableModel)table.getModel();
    if(rs == null){dtm.setRowCount(0); return;}
    ResultSetMetaData metaData = rs.getMetaData();
    
    int columnCount = metaData.getColumnCount();
    int num = 1;

    dtm.setRowCount(0);
    
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        
        vector.add(num);
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        num++;
        dtm.addRow(vector);
    }
    }
    
}
