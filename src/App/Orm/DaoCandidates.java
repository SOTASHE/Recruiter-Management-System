/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Orm;

import OrmMapping.Candidates;
import java.util.List;

/**
 *
 * @author Ilias Naamane
 */
public class DaoCandidates extends DaoAbstract{
    
    
    public DaoCandidates(){
        super(Candidates.class);
    }
   
    public List getAllByJob(int idJob){
        return getHqlQuery("select c from Candidates c join c.candidatesJobses cj where cj.id.jobsid ="+idJob);
    }
    
    
    public List getAllEmployees(){
        return getHqlQuery("select c,cj,cj.jobs from Candidates c join c.candidatesJobses cj where cj.jobs.status = -1");
    }
    
   
    // add function to get all current candidat by job with details phase entretien etc..
    
    public void delete(int idCandidate){
        //super.UpdateQuery("delete from Candidates_Jobs where Candidatesid ="+idCandidate);
        super.UpdateQuery("delete from Candidates_Entretien where Candidatesid ="+idCandidate);
    }
    
    
}
