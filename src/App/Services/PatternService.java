/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

/**
 *
 * @author regragui
 */
/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sony
 */
public class PatternService {
    
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_VILLE_REGEX = Pattern.compile("[A-Z]+'?+[A-Z]+",Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_SKILLS_REGEX = Pattern.compile("([A-Z0-9#.,])+",Pattern.CASE_INSENSITIVE);
    
    public static boolean validateEmail(String EmailStr)
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(EmailStr);
        return matcher.matches();
    }  
    
    public static boolean validateSkills(String SkillStr) {
        Matcher matcher = VALID_SKILLS_REGEX.matcher(SkillStr);
        return matcher.matches() ;
    }
    
     public static boolean validateVille(String VilleStr) {
        Matcher matcher = VALID_SKILLS_REGEX.matcher(VilleStr);
        return matcher.matches() ;
    }
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    private static final Pattern ville = Pattern.compile("^[A-Z][A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    public static boolean validate(String emailstr)
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailstr);
        return matcher.matches();
    }  
}