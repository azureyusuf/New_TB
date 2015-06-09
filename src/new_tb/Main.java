/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_tb;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;



/**
 *
 * @author Azure
 */
public class Main {
	

	public static void main(String args[]) {
		 String a = "ucups";
                for(int loop = 0;loop <1;){
                String login=  JOptionPane.showInputDialog("Enter Password");
                if (login.equals(a) ){
                loop =1;
                }
                else{
                   JOptionPane.showMessageDialog(null, "Password Salah");
                }
                
                }
                PanelTab play = new PanelTab();
                play.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
            }
            
}
        
              
             
                         
            
            
        
    
	// End of this session!
	// No Steps
	// Roll
