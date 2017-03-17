/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Orm;

import Ui.Frames.Clients;
import java.util.List;

/**
 *
 * @author Ilias Naamane
 */
public class DaoClients extends DaoAbstract {

    public DaoClients() {
        super(Clients.class);
    }

    @Override
    public List getAll() {
        return super.getAll();
    }
    
    public List getAllOrderByJobs(){
        return super.getHqlQuery("from Clients c order by c.id desc");
    }
    
    public List getClientsWithStats(){
        return super.getHqlQuery("select c.id,c.name,c.email,count(*),avg(cj.satisfaction) from Clients c join c.jobses j   join j.candidatesJobses cj   where j.status = -1   group by c");
    }
    
    public boolean isConnect(String email, String pass) {
        List<Object> L = super.getHqlPreparedQuery("from Clients c where c.email=:email and c.password=:pass",
                "email", email, "pass", pass);
        return !L.isEmpty();
    }
    
}
