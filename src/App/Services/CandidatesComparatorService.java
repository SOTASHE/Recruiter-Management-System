/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

import OrmMapping.Candidates;
import java.io.IOException;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONException;

/**
 *
 * @author youpi
 */
public class CandidatesComparatorService implements Comparator<Candidates> {

    private final String principalSkillsC;
    private final String secondarySkillsC;
    public static  String Erreur ="" ;
   //public static final javax.swing.JTable H =  ; 

    public CandidatesComparatorService(String principalSkillsC, String secondarySkillsC) {
        this.principalSkillsC = principalSkillsC;
        this.secondarySkillsC = secondarySkillsC;
    }
    
   
    
    public static void SolutionException(Candidates c1) throws JSONException, IOException, InterruptedException {
        LinkedinService.rateLinkedinProfil(c1, "", "");
    }
    
    @Override
    public int compare(Candidates c1, Candidates c2) {
        int rateC1 = 0;int rateC2 = 0;
        try {
            rateC2 = LinkedinService.rateLinkedinProfil(c2, principalSkillsC, secondarySkillsC);
            rateC1 = LinkedinService.rateLinkedinProfil(c1, principalSkillsC, secondarySkillsC);
        } catch (JSONException ex) {
        
        } catch (IOException ex) {
         
        } catch (InterruptedException ex) {
           
        }
        if(rateC1 > rateC2)
            return 1;
        else if(rateC1 == rateC2)
            return 0;
        else
            return -1 ;
    }
    
}
