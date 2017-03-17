/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Orm;

import OrmMapping.CandidatesEntretien;
import java.util.List;

/**
 *
 * @author Ilias Naamane
 */
public class DaoCandidatesEntretien extends DaoAbstract {

    public DaoCandidatesEntretien() {
        super(CandidatesEntretien.class);
    }
    
    public void create(CandidatesEntretien ce){
        super.create(ce);
    }
    
    public int getPhaseById(int idCandidate,int idJob) {
        List L = super.getHqlQuery("select ce.phase from CandidatesEntretien ce "
                + "where ce.candidatesid = " +idCandidate+ " and ce.jobs.id ="+idJob);
       return (int) L.get(0) ;
    }
    
    public void updatePhase(int idCandidate, int idJob, int phase) {
        super.UpdateQuery("update Candidates_Entretien set phase =" + phase
                + " where Candidatesid = " + idCandidate + " and jobs_id =" + idJob);
    }
    
    public List getCandidatesWithInterviewByJob(int idJob) {
        return getHqlQuery("select c.id,c.name,c.email, ce.phase from Candidates c "
                + "join c.candidatesEntretien ce  where ce.jobs.id =" + idJob);
    }
    
    public void delete(int idCandidate,int idjob) {
        super.UpdateQuery("delete from Candidates_Entretien where Candidatesid =" + idCandidate +
        " and jobs_id = "+idjob);
    }
}
