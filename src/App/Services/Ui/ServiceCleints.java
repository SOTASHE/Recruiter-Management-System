/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Orm.DaoClients;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author regragui
 */
public class ServiceCleints {
    
    public static void displayClients(JTable T){
        DaoClients dc = new DaoClients();
        List L = dc.getClientsWithStats();
        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("Id");
        tableHeaders.add("Entreprise");
        tableHeaders.add("Email");
        tableHeaders.add("Nb d'employes recrutés");
        tableHeaders.add("Satisfaction");
        Vector tableData = new Vector();
        for (Iterator it = L.iterator(); it.hasNext();) {
            Vector<Object> oneRow = new Vector<Object>();
            Object[] o = (Object[]) it.next();
            oneRow.add((int)o[0]);
            oneRow.add((String)o[1]);
            oneRow.add((String)o[2]);
            oneRow.add((long)o[3]);
            oneRow.add((double)o[4]);
            tableData.add(oneRow);

        }
        T.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
}
