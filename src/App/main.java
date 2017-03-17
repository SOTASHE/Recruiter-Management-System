package App ;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.toedter.calendar.JCalendar;
import App.Orm.DaoCandidates;
import App.Orm.DaoJobs;
import App.Orm.DaoRecruiter;
import App.Services.Ui.FilljTableService;
import App.Services.Ui.InsertService;
import OrmMapping.Jobs;
import Ui.Services.StarRater;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JFrame;
import org.json.JSONException;


/**
 *
 * @author youpi
 */
public class main {
   
    
    public static void main(String[] args) throws JSONException, IOException, InterruptedException {
       // InsertService.insertCandidateEntretien(2,1);
  JFrame frame = new JFrame("Test JCalendar");
          JCalendar dateChooser = new JCalendar();
          frame.add(dateChooser);
          frame.pack();
          //frame.add(jButton1);
          frame.setLocationRelativeTo(null); // pour centrer
          frame.setVisible(true) ;
          FilljTableService.nextInterviewPhase(1, 1);

        FilljTableService.nextInterviewPhase(1, 1);
//InsertService.insertCandidateEntretien(2,1);
           
        /*List<Object> L = new DaoCandidates().ge
        LinkedinService.rateLinkedinProfil(c, "ddd", secondarySkills)
        /* JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        StarRater starRater = new StarRater(5, 2, 1);       
        panel.add(starRater);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*   
      List L = StatsService.getStatsPorcentage();
      
        ChartService.CamembertJob(L,"Job");
        
      /* StringBuffer output = new StringBuffer();

        Process p;
        try {
            String command = "ruby src/getProfileInJson.rb https://www.linkedin.com/in/ilias-naamane-a0bab3b0";
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
         
       System.out.println(output);
        
       JSONObject jsonObj = new JSONObject(output.toString());
       JSONArray projects = jsonObj.getJSONArray("projects");
       
       
       for(int i=0;i<projects.length();i++){
           JSONObject project = projects.getJSONObject(i);
           String projectTitle = project.getString("title");
           String projectDescription = project.getString("description");
           System.out.println(projectTitle);
           System.out.println(projectDescription);
       }
        
        
      
        
       */
       
    /*  if(loginAgencyService.getConnected("ilias.naamane1@gmail.com", "123456")){
           System.out.println("je m'appelle ilias");
      }
      else{
          System.out.println("hahouwa");
      }*/
   // Test("fff","xxx") ;
/*   int rate= 0 ;
    DaoCandidates D = new DaoCandidates() ;
    List L = D.getAllByJob(1) ;
    for(Object o : L) {
         rate = LinkedinService.rateLinkedinProfil((Candidates)o,"c#,f#","");
    }
        System.out.println(rate);
    }   
    
    public static void Test(String... argc) {
        for(int i = 0 ;i < argc.length ; i++) {
            System.out.println(argc[i]);
        }*/

    /* DaoJobs D = new DaoJobs() ;
     D.updateStatus(1);*/
}
}
