/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Orm.DaoCandidates;
import App.Orm.DaoCandidatesEntretien;
import App.Orm.DaoClients;
import App.Orm.DaoJobs;
import OrmMapping.Candidates;
import OrmMapping.CandidatesJobs;
import OrmMapping.Jobs;
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
    
    
    public static void nextInterviewPhase(int idCandidat,int idJob){
        DaoCandidatesEntretien de = new DaoCandidatesEntretien();
        int phase = de.getPhaseById(idCandidat, idJob);
        de.updatePhase(idCandidat, idJob, ++phase);
    }
    
    
    
    
    public static void displayCandidatesWithInterviewByJob(JTable T,int idJob){
        DaoCandidatesEntretien de = new DaoCandidatesEntretien();
        List L = de.getCandidatesWithInterviewByJob(idJob);
        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("Id");
        tableHeaders.add("Nom");
        tableHeaders.add("Email");
        tableHeaders.add("Phase Entretien");
        Vector tableData = new Vector();
        for (Iterator it = L.iterator(); it.hasNext();) {
            Vector<Object> oneRow = new Vector<Object>();
            Object[] o = (Object[]) it.next();
            oneRow.add((int) o[0]);
            oneRow.add((String) o[1]);
            oneRow.add((String) o[2]);
            if((int)o[3] == 3) 
                oneRow.add("Final");
            else if((int)o[3] == 4) oneRow.add("Validé");
            else
                oneRow.add("phase "+(int)o[3]);
            
            tableData.add(oneRow);

        }
        T.setModel(new DefaultTableModel(tableData, tableHeaders));
        
        
    }
    
    
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
    
    public static void displayJobs(JTable T) {
        DaoJobs dj = new DaoJobs();
        List L = dj.getJobs();
        
        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("id");     
        tableHeaders.add("profil recherché");
        tableHeaders.add("Entreprise");
        tableHeaders.add("Statut") ;
        Vector tableData = new Vector();
        for (Iterator it = L.iterator(); it.hasNext();) {
            Vector<Object> oneRow = new Vector<Object>();
            Object[] o = (Object[]) it.next();
            oneRow.add((int)o[0]);
            oneRow.add((String)o[1]);
            oneRow.add((String)o[2]);
            
            if ((int)o[3] == -1) {
                oneRow.add("Validé");
            } else {
                oneRow.add("En cours");
            }
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
    
    public static void displayJobs(JTable T, List L){
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
