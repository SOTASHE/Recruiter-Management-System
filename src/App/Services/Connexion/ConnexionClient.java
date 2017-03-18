/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Connexion;

import App.Dao.DaoClients;
import OrmMapping.Clients;
import java.util.List;

/**
 *
 * @author regragui
 */
public class ConnexionClient {
   
    public static int isConnect(String Email , String Pass) {
        List L = new DaoClients().isConnect(Email, Pass) ;
        if(!L.isEmpty()) {
            return ((Clients) L.get(0)).getId() ;
        }
        return -1 ;
    }
}
