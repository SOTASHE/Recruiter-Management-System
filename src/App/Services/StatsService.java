/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

import App.Orm.DaoJobs;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDialog;
import org.jfree.chart.* ;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

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
