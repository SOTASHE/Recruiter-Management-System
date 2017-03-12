/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

import App.Orm.DaoCandidates;
import App.Orm.DaoJobs;
import OrmMapping.Candidates;
import OrmMapping.CandidatesJobs;
import OrmMapping.Jobs;
import Ui.Services.StarRater;
import java.awt.Component;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Ilias Naamane
 */
public class FilljTableService {
    // 
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
            oneRow.add(CJ.getSatisfaction());
            tableData.add(oneRow);
          
           
        }
       /* for (Object o : L) {            
            
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(C.getId());
            oneRow.add(C.getName());
            oneRow.add(CJ.getSatisfaction());
            oneRow.add(J.getStatus());
            // oneRow.add();
              //oneRow.add(C.getName());
            tableData.add(oneRow);
        }*/
        T.setModel(new DefaultTableModel(tableData, tableHeaders));
       /* StarRater starRater = new StarRater(5, 2, 1);
        
        T.setDefaultRenderer(columnClass, renderer);*/
        
    }
    
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
    
    public static void displaySearchCandidates(JTable T,List L ){
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("id");
        tableHeaders.add("name");
        tableHeaders.add("age");
        tableHeaders.add("ville");
        tableHeaders.add("email");

        for (Object o : L) {
            Candidates C = (Candidates) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(C.getId());
            oneRow.add(C.getName());
            oneRow.add(C.getAge());
            oneRow.add(C.getVille());
            oneRow.add(C.getEmail());
            tableData.add(oneRow);
        }
        T.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
}
