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
}
