/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Dao.DaoCandidates;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ilias Naamane
 */
public class ServiceJobCandidatsEntre {
    
    public static void displayEmployees(JTable T,int idJob){
        DaoCandidates dc = new DaoCandidates();
        List L = dc.getEmployeesByJob(idJob);
        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("Id");
        tableHeaders.add("Nom");
        tableHeaders.add("Email");
        tableHeaders.add("Satisfaction");
        Vector tableData = new Vector();
        for (Iterator it = L.iterator(); it.hasNext();) {
            Vector<Object> oneRow = new Vector<Object>();
            Object[] o = (Object[]) it.next();
            oneRow.add((int) o[0]);
            oneRow.add((String) o[1]);
            oneRow.add((String) o[2]);
            oneRow.add((int) o[3]);
            tableData.add(oneRow);

        }
        T.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
}
