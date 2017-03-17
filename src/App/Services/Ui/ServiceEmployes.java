/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Dao.DaoCandidates;
import OrmMapping.Candidates;
import OrmMapping.CandidatesJobs;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author regragui
 */
public class ServiceEmployes {
    public static void displayEmployees(JTable T){
        DaoCandidates dc = new DaoCandidates();
        List L = dc.getAllEmployees();
        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("Id");
        tableHeaders.add("Nom Complet");
        tableHeaders.add("Age");
        tableHeaders.add("Entreprise");
        tableHeaders.add("Satisfaction");
        
       // tableHeaders.add("Status");
        Vector tableData = new Vector();
        for (Iterator it = L.iterator(); it.hasNext();) {
            Vector<Object> oneRow = new Vector<Object>();
            Object[] o = (Object[]) it.next();
            Candidates C = (Candidates)o[0];
            CandidatesJobs CJ = (CandidatesJobs)o[1];
            oneRow.add(C.getId());
            oneRow.add(C.getName());
            oneRow.add(C.getAge());
            oneRow.add(CJ.getJobs().getProfil());
            if(CJ.getSatisfaction() == 0)
                oneRow.add("-");
            else
            oneRow.add(CJ.getSatisfaction());
            tableData.add(oneRow);
        }
        T.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
}
