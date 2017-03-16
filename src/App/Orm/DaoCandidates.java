/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Orm;

import static App.Orm.DaoAbstract.session;
import OrmMapping.Candidates;
import java.util.List;
import org.hibernate.Query;

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
    
    public List getCandidatesWithInterviewByJob(int idJob){
        return getHqlQuery("select c.id,c.name,c.email, ce.phase from Candidates c "
                + "join c.candidatesEntretien ce  where ce.jobs.id = 1 ="+idJob);
    }
    // add function to get all current candidat by job with details phase entretien etc..
    
    public void delete(int idCandidate){
        super.UpdateQuery("delete from Candidates c INNER JOIN Candidates_Jobs cj INNER JOIN Candidates_Entretien ce"
                + "where c.id = cj.Jobsid and cj.Jobsid = ce.Candidatesid and c.id="+idCandidate);
       
    }
}
