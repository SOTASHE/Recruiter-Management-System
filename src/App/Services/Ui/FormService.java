/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import App.Orm.DaoJobDescription;
import App.Orm.DaoJobs;
import OrmMapping.Clients;
import OrmMapping.JobDescription;
import OrmMapping.Jobs;

/**
 *
 * @author Ilias Naamane
 */
public class FormService {
    
    public static void insertJob(String profil,String jobDescription,int idClient){
        Jobs j = new Jobs();
        j.setProfil(profil);
        j.setStatus(0);
        Clients c = new Clients();
        c.setId(idClient);
        j.setClients(c);
        DaoJobs dj = new DaoJobs();
        dj.create(j);     
        JobDescription Jd = new JobDescription();
        Jd.setText(jobDescription);
        Jd.setJobs(j);
        DaoJobDescription Djd = new DaoJobDescription();
        Djd.create(Jd);
        
    }
}
