/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Orm;

import static App.Orm.DaoAbstract.session;
import OrmMapping.Jobs;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Ilias Naamane
 */
public class DaoJobs extends DaoAbstract {
    
    public DaoJobs() {
        super(Jobs.class);
    }
   
    public void create(Jobs j) {
        super.create(j);
    }
    
   @Override
   public List  getAll(){
      return super.getAll();    
   }
   
   public List findById(int id){
       return super.getHqlQuery("select j from Jobs j where id = "+id);
   }
   
   public List getRelevantJobsPourcentage(){
       session.beginTransaction(); 
       Query query = session.createSQLQuery("select profil,count(*)/(select count(*) from Jobs) "
               + "from Jobs group by profil order by 2 desc limit 0,5");
       session.getTransaction().commit();
       return query.list();
       //return super.getQuery("select job.profil,count(*)  from Jobs job group by profil order by 2 desc") ;
   }
   
   public List getRelevantJobs(){
       session.beginTransaction(); 
       Query query = session.createSQLQuery("select profil,count(*) from Jobs group by profil "
               + "order by 2 desc limit 0,5");
       session.getTransaction().commit();
       return query.list();
       //return super.getQuery("select job.profil,count(*)  from Jobs job group by profil order by 2 desc") ;
   }
   
   public List getCurrentJobs(){
       return super.getHqlQuery("from Jobs j where j.status <> -1");
   }
   
   
}
