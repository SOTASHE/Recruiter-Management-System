/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Orm.DaoJobs;
import OrmMapping.Jobs;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author regragui
 */
public class ServiceJobEntreprise {
    
    
    public static void DisplayClientsJob(JTable T ,int idClient) {
        DaoJobs DJ= new DaoJobs() ;
        List L = DJ.getJobsValidByClient(idClient) ;
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("id");
        tableHeaders.add("profile");
        for (Object o : L) {
            Jobs C = (Jobs) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(C.getId());
            oneRow.add(C.getProfil());
            tableData.add(oneRow);
        }
        T.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
}
