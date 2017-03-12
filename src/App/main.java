/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author youpi
 */
public class main {
   
    
    public static void main(String[] args) {
     
  
    System.out.println( new SimpleDateFormat("d MMM YYYY 'à' h:mm a").format(new Date().getTime()+604800000));
  /*    List L = StatsService.getStatsPorcentage();
      
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