/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import App.Orm.DaoCandidates;
import App.Services.CandidatesSortByRateService;
import App.Services.ChartService;
import App.Services.LinkedinService;
import App.Services.StatsService;
import OrmMapping.Candidates;
import Ui.Services.StarRater;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author youpi
 */
public class main {
   
    
    public static void main(String[] args) throws JSONException, IOException, InterruptedException {
      /* JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        StarRater starRater = new StarRater(5, 2);       
        panel.add(starRater);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
         
       // List L = StatsService.getStatsPorcentage();
        String test = LinkedinService.profileToJson("https://www.linkedin.com/in/chaabi-abdelkader-75706a130/");
        System.out.println(test);
//ChartService.CamembertJob(L,"Job");
        
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
       
     /* if(loginAgencyService.getConnected("ilias.naamane1@gmail.com", "123456")){
           System.out.println("je m'appelle ilias");
      }
      else{
          System.out.println("hahouwa");
      }*/
      
        
        DaoCandidates dc = new DaoCandidates();
        List c = CandidatesSortByRateService.sortCandidates(1, "C#", "php");
        for(Object o : c){
            Candidates C= (Candidates)o;
            System.out.println(C);
        }
}}
