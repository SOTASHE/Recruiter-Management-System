/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static App.Services.LinkedinService.profileToJson;
import App.Services.ChartService;
import App.Services.StatsService;
import Ui.Services.StarRater;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author youpi
 */
public class main {
   
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
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
    }  
}
