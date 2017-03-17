/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Dao.DaoCandidatesEntretien;
import App.Dao.DaoJobDescription;
import App.Dao.DaoJobs;
import OrmMapping.Clients;
import OrmMapping.JobDescription;
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
public class ServiceJobEnCours {

    public static void insertJob(String profil, String jobDescription, int idClient) {
        Jobs j = new Jobs();
        j.setProfil(profil);
        j.setStatus(0);
        Clients c = new Clients();
        c.setId(idClient);
        j.setClients(c);
        DaoJobs dj = new DaoJobs();
        dj.create(j);
        JobDescription Jd = new JobDescription();
        Jd.setText(jobDescription);
        Jd.setJobs(j);
        DaoJobDescription Djd = new DaoJobDescription();
        Djd.create(Jd);

    }

    public static boolean VerifierPhaseValide(int idJob) {
        DaoCandidatesEntretien de = new DaoCandidatesEntretien();
        List L = de.getCandidatesWithInterviewByJob(idJob);
        for (Iterator it = L.iterator(); it.hasNext();) {
            Object[] o = (Object[]) it.next();
            if ((int) o[3] != 4) {
                return false;
            }
        }
        return true;
    }

    public static void displayJobs(JTable T) {
        DaoJobs dj = new DaoJobs();
        List L = dj.getJobs();

        Vector<String> tableHeaders = new Vector<String>();

        tableHeaders.add("id");

        tableHeaders.add("profil recherché");

        tableHeaders.add("Entreprise");

        tableHeaders.add("Statut");

        Vector tableData = new Vector();

        for (Iterator it = L.iterator(); it.hasNext();) {

            Vector<Object> oneRow = new Vector<Object>();

            Object[] o = (Object[]) it.next();

            oneRow.add((int) o[0]);

            oneRow.add((String) o[1]);

            oneRow.add((String) o[2]);

            if ((int) o[3] == -1) {

                oneRow.add("Validé");

            } else {

                oneRow.add("En cours");

            }

            tableData.add(oneRow);

        }

        T.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
}
