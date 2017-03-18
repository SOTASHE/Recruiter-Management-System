/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Dao;

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
        return getHqlQuery("select c from Candidates "
                + "c join c.candidatesJobses cj where cj.satisfaction = -2 and  cj.id.jobsid ="+idJob);
    }
    
    
    public List getAllEmployees(){
        return getHqlQuery("select c,cj,cj.jobs from Candidates c join c.candidatesJobses cj "
                + "where cj.jobs.status = -1");
    }
    
    public void updateSatisfaction(int idcandidate,int idjob, int satisfaction){  
        System.out.println(idcandidate);
        System.out.println(idjob);
        System.out.println(satisfaction);
        super.UpdateQuery("update Candidates_Jobs cj  set satisfaction = "+satisfaction+ 
                "where CandidatesId = " + idcandidate + " and Jobsid = " + idjob );
    }
   
    // add function to get all current candidat by job with details phase entretien etc..
    
   
    
    
}
