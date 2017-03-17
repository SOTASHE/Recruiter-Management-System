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
    
    /**
     * get interview phase for a specific Candidate who applied for a specific job
     * @param idCandidate
     * @param idJob
     * @return phase
     */
    public int getPhaseById(int idCandidate,int idJob){
        return Integer.parseInt(super.getHqlQuery("select ce.phase from CandidatesEntretien ce "
                + "where ce.candidatesid = " +idCandidate+ " and ce.jobs.id ="+idJob).get(0).toString());
    }
    
    /**
     * update interview phase
     * @param idCandidate
     * @param idJob
     * @param phase 
     */
    public void updatePhase(int idCandidate, int idJob, int phase) {
        super.UpdateQuery("update Candidates_Entretien set phase =" + phase
                + " where Candidatesid = " + idCandidate + " and jobs_id =" + idJob);
    }
    
    /**
     * select Candidates with interview phase and client entreprise for a specific job
     * @param idJob
     * @return List
     */
    public List getCandidatesWithInterviewByJob(int idJob) {
        return getHqlQuery("select c.id,c.name,c.email, ce.phase from Candidates c "
                + "join c.candidatesEntretien ce  where ce.jobs.id =" + idJob);
    }
    
    /**
     * delete candidate from interviews table
     * @param idCandidate
     * @param idjob 
     */
    public void delete(int idCandidate,int idjob) {
        super.UpdateQuery("delete from Candidates_Entretien where Candidatesid =" + idCandidate +
        " and jobs_id = "+idjob);
    }
}
