package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        // sets what ever returns from the method as the last name
        try {
        String lastName = app.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        }catch(IllegalArgumentException e){
                        JOptionPane.showMessageDialog(null,"You have entered  an Invalid Name");
                        }
        
        
    }
    
    public String extractLastName(String fullName) {
        // takes what you enter and splits the entries then putts them into a array
        // then it returns the last item in the array 
        if(fullName == null || fullName.isEmpty()){
            throw new IllegalArgumentException("Invalid Name");
        }
        String[] nameParts = fullName.split(" ");
        if(!(nameParts.length == 2)){
            throw new IllegalArgumentException("Invalid Name");
        }
        return nameParts[nameParts.length - 1];
    }

}
