/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Dao;

import OrmMapping.JobDescription;

/**
 *
 * @author Ilias Naamane
 */
public class DaoJobDescription extends DaoAbstract {
    
    public DaoJobDescription() {
        super(JobDescription.class);
    }
    
    public void create(JobDescription jd){
       super.create(jd);
    }  
}
