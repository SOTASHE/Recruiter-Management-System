/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

import App.Orm.DaoJobs;
import OrmMapping.Candidates;
import OrmMapping.Jobs;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ilias Naamane
 */
public class FilljTableService {
    
    public static void displayJobs(JTable T) {
        DaoJobs dj = new DaoJobs();
        List L = dj.getCurrentJobs();
        
        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("id");
        tableHeaders.add("profil recherché");
        
        Vector tableData = new Vector();
        for (Object o : L) {
            Jobs J = (Jobs) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(J.getId());
            oneRow.add(J.getProfil());
            tableData.add(oneRow);
        }
        T.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
}
