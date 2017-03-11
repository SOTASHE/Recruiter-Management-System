/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

import OrmMapping.Candidates;
import java.io.IOException;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.json.JSONException;

/**
 *
 * @author youpi
 */
public class CandidatesComparatorService implements Comparator<Candidates> {

    private final String principalSkillsC;
    private final String secondarySkillsC;

    public CandidatesComparatorService(String principalSkillsC, String secondarySkillsC) {
        this.principalSkillsC = principalSkillsC;
        this.secondarySkillsC = secondarySkillsC;
    }
    
    
    @Override
    public int compare(Candidates c1, Candidates c2) {
        int rateC1 = 0;
        try {
            rateC1 = LinkedinService.rateLinkedinProfil(c1, principalSkillsC, secondarySkillsC);
        } catch (JSONException ex) {
           
        } catch (IOException ex) {
           JDialog J = new JDialog() ;
            J.setVisible(true);
        } catch (InterruptedException ex) {
           JDialog J = new JDialog() ;
            J.setVisible(true);
        }
        int rateC2 = 0;
        try {
            rateC2 = LinkedinService.rateLinkedinProfil(c2, principalSkillsC, secondarySkillsC);
        } catch (JSONException ex) {
            JDialog J = new JDialog() ;
            J.setVisible(true);
        } catch (IOException ex) {
            JDialog J = new JDialog() ;
            J.setVisible(true);
        } catch (InterruptedException ex) {
            JDialog J = new JDialog() ;
            J.setVisible(true);
        }
        if(rateC1 > rateC2)
            return 1;
        else if(rateC1 == rateC2)
            return 0;
        else
            return -1;
        
    }
    
}
