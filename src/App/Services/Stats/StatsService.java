

package App.Services.Stats;

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
