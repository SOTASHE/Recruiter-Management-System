/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

import App.Orm.DaoRecruiter;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ilias Naamane
 */
public class loginAgencyService {
    
    /**
     * 
     * @param email
     * @param password
     * @return boolean true if connected, false if not
     */
    public static boolean getConnected(String email, String password){
        DaoRecruiter DR = new DaoRecruiter();
        String pass = DR.getPasswordByLogin(email);
        if(pass.equals(password) )
            return true;
        return false;       
    }
}
