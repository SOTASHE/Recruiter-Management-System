/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Dao.DaoCandidatesEntretien;
import OrmMapping.Candidates;
import OrmMapping.CandidatesEntretien;
import OrmMapping.Jobs;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author regragui
 */

public class ServiceCandidatsJob {
    
    
    
    public static void nextInterviewPhase(int idCandidat,int idJob){
        DaoCandidatesEntretien de = new DaoCandidatesEntretien();
        int phase = de.getPhaseById(idCandidat,idJob);
        System.out.println(phase);
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
    
    
}
