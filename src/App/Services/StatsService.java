/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

import App.Orm.DaoJobs;
import java.util.List;

/**
 *
 * @author Ilias Naamane
 */
public class StatsService {
    
    public static List getStatsPorcentage(){
        DaoJobs dj = new DaoJobs();
        List list = dj.getRelevantJobsPourcentage();
        return list;
    }
    
    public static List getStats(){
        DaoJobs dj = new DaoJobs();
        List list = dj.getRelevantJobs();
        return list;
    }
    
    
}
