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
    
    public String getPasswordByLogin(String userEmail){
        List<String> obj = super.getHqlQuery("select r.password from Recruiters r where email= '"+userEmail+"'" );       
        return obj.get(0);
    }
}
