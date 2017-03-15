/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Orm;

import OrmMapping.Recruiters;
import java.util.List;

/**
 *
 * @author Ilias Naamane
 */
public class DaoRecruiter extends DaoAbstract{
    
    public DaoRecruiter() {
        super(Recruiters.class);
    }
    
    public boolean getPasswordByLogin(String userEmail,String Pass){
        List<String> obj = super.getHqlQuery("select r.password from Recruiters r where email= '"+userEmail+"' and password= '"+Pass+"'" );       
        return !obj.isEmpty();
    } 
    
    public boolean getAdmin(String userEmaString,String Pass) {
       List<Object> L = super.getHqlPreparedQuery("from Recruiters r where email=:destination and password=:pass",
                "destination",userEmaString,"pass",Pass) ;
       return !L.isEmpty() ;
    }
}
