/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

import java.math.*;
import java.util.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author regragui
 */
public class ChartService {
    
    public static ChartPanel CamembertJob(List L,String nomGraphe ) {
        //JDialog JD1 = new JDialog() ;  
        //JD1.setLayout(new GridLayout());
        //JD1.setSize(1000,600);
        DefaultPieDataset pieDataset = new DefaultPieDataset(); 
        BigDecimal autre = new BigDecimal(1);
        for (Iterator it = L.iterator(); it.hasNext();) {
            Object[] o = (Object[]) it.next();
            String nom = (String)(o[0]);
            BigDecimal  valeur = (BigDecimal)(o[1]);
            autre = autre.subtract(valeur);
            pieDataset.setValue(nom+" " + valeur.multiply(new BigDecimal(100)).setScale(2)+"%",valeur) ;
        }
        if(!autre.equals(new BigDecimal(0))) {
            pieDataset.setValue("autre"+" "+autre.multiply(new BigDecimal(100)).setScale(2)+"%",autre) ;
        }
        JFreeChart pieChart = ChartFactory.createPieChart3D(nomGraphe, 
        pieDataset, true, true, true); 
        final ChartPanel cPanel = new ChartPanel(pieChart);
        return cPanel ;
        //JD1.add(cPanel) ;
        
        //JD1.setLocationRelativeTo(null);
        //JD1.setVisible(true);
    }
    
    public static ChartPanel HistogrammeJob(List L,String nomGraph,String horisontalName,String verticalName) {
        //JDialog JD1 = new JDialog();  
        //JD1.setSize(1000,600);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Iterator it = L.iterator(); it.hasNext();) {
            Object[] o = (Object[]) it.next();
            String nom = (String)(o[0]);
            BigInteger valeur = (BigInteger)(o[1]);
            dataset.setValue(valeur,nom,nom) ;
        }
        JFreeChart barChart = ChartFactory.createBarChart3D(nomGraph,horisontalName,
        verticalName,dataset,PlotOrientation.VERTICAL,true,true, false);
        final ChartPanel cPanel = new ChartPanel(barChart);
        //JD1.getContentPane().add(cPanel);
        //JD1.setLocationRelativeTo(null);
        //JD1.setVisible(true) ;
        return cPanel ;
    }
}