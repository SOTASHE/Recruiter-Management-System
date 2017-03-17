/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Ui;

import java.awt.Component;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;

/**
 *
 * @author regragui
 */
public class ConfirmeDialog {
    
    public static boolean getReponse(Component C ,String Message ,String titre ,int option1,int option2) {
        return JOptionPane.showConfirmDialog(C, Message, titre, option1,option2) == JOptionPane.YES_OPTION ;
    }
}
