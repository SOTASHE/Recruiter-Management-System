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
 * @author youpi
 */
public class DaoCandidates extends DaoAbstract{
    
    
    public DaoCandidates(){
        super(Candidates.class);
    }
   
    public List getAllByJob(int idJob){
        List result = getHqlQuery("select c from Candidates c join c.jobses j where j.id="+idJob);
        return result;
    }
    
    public List getRelevantJobs() {
        session.beginTransaction();
        Query query = session.createSQLQuery("select profil,count(*)/(select count(*) from Jobs) from Jobs group by profil order by 2 desc limit 0,5");
        session.getTransaction().commit();
        return query.list();
        //return super.getQuery("select job.profil,count(*)  from Jobs job group by profil order by 2 desc") ;
    }
    
    public List getAllEmployees(){
       List result = getHqlQuery("select c,cj from Candidates c join c.jobses cj where c.id = cj.id");
        return result;
    }
    
}
