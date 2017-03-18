/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Orm.DaoCandidatesEntretien;
import OrmMapping.Candidates;
import OrmMapping.CandidatesEntretien;
import OrmMapping.Jobs;
import static com.alee.laf.filechooser.FileChooserViewType.table;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author regragui
 */
public class ServiceAfficheCandidat {
    
    public static void insertCandidateEntretien(int CandidateId,int JobId){
        Candidates c = new Candidates();
        c.setId(CandidateId);
        Jobs j = new Jobs();
        j.setId(JobId);
        CandidatesEntretien ce = new CandidatesEntretien(c,j,1);
        DaoCandidatesEntretien dce = new DaoCandidatesEntretien();
        dce.create(ce);
    }
    
    private static void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(uri);
            } catch (IOException e) {
                /* TODO: error handling */ }
        } else {
            /* TODO: error handling */ }
    }
    public static void displaySearchCandidates(JTable T,List L ){
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("id");
        tableHeaders.add("name");
        tableHeaders.add("age");
        tableHeaders.add("ville");
        tableHeaders.add("email");
        tableHeaders.add("linkedin");

        for (Object o : L) {
            Candidates C = (Candidates) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(C.getId());
            oneRow.add(C.getName());
            oneRow.add(C.getAge());
            oneRow.add(C.getVille());
            oneRow.add(C.getEmail());
            oneRow.add(C.getLinkedinUrl());
            tableData.add(oneRow);
        }
        
        T.setModel(new DefaultTableModel(tableData, tableHeaders));

    }
}
