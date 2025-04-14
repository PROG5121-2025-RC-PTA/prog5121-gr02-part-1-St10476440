
package group_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ramun
 */
public class MainTestTest  {

       public MainTestTest() {
    }

    public static void main(String[] args) {
       
       String firstname =  JOptionPane.showInputDialog(null , "Enetr your first name " ,"Registration", JOptionPane.QUESTION_MESSAGE); 
       String lastname =  JOptionPane.showInputDialog(null , "Enetr your lastname " ,"Registration", JOptionPane.QUESTION_MESSAGE); 
       String Username =  JOptionPane.showInputDialog(null , "Enetr your username " ,"Registration", JOptionPane.QUESTION_MESSAGE); 
       String password =  JOptionPane.showInputDialog(null , "Enetr your password " ,"Registration", JOptionPane.QUESTION_MESSAGE); 
       String cellPhone =  JOptionPane.showInputDialog(null , "Enetr your cellPhone,cell phone must start with south african international code (+27) " ,"Registration", JOptionPane.QUESTION_MESSAGE); 

       
       Login login = new Login();
       
       boolean validateUsername = login.checkUserName(Username);
       boolean  validatePassword = login.checkPasswordComplexity(password);
       boolean validatePhone = login.checkCellPhoneNumber(cellPhone);
       
       if (firstname.equals("")){
           JOptionPane.showMessageDialog(null, "Please enter your firtname" ,"ERROR",JOptionPane.ERROR_MESSAGE);
           
       }else{
            JOptionPane.showMessageDialog(null, "firstname successfully added" );
       }
       
       
       if (lastname.equals("")){
           JOptionPane.showMessageDialog(null, "Please enter your lastname" ,"ERROR",JOptionPane.ERROR_MESSAGE);
       }else{
            JOptionPane.showMessageDialog(null, "lastname successfully added" );
       }
       
       if(validateUsername == true){
           JOptionPane.showMessageDialog(null, "Username is successfully captured" );
       }else{
           JOptionPane.showMessageDialog(null, "Username is not correctly formatted" ,"ERROR",JOptionPane.ERROR_MESSAGE);
       }
       
        if(validatePassword == true){
           JOptionPane.showMessageDialog(null, "Password successfully captured" );
       }else{
           JOptionPane.showMessageDialog(null, "Password is not correctly formatted, password must contain a number, capital letter, a special character and must be more than 8 characters" ,"ERROR",JOptionPane.ERROR_MESSAGE);
       }
        
         if(validatePhone == true){
           JOptionPane.showMessageDialog(null, "Cell phone number successfully added" );
       }else{
           JOptionPane.showMessageDialog(null, "cell phone number incorrectly formatted , cell phone must start with south african international code (+27)" ,"ERROR",JOptionPane.ERROR_MESSAGE);
       }
       
       
         
       if (!lastname.equals("") && !firstname.equals("") && validateUsername ==  true && validatePassword == true && validatePhone == true ){
             JOptionPane.showMessageDialog(null, "You have successfully registered" );
             
             String Login_Username = JOptionPane.showInputDialog(null , "Enter Username","LOGIN" , JOptionPane.QUESTION_MESSAGE);
             String Login_Password = JOptionPane.showInputDialog(null , "Enter Password","LOGIN" , JOptionPane.QUESTION_MESSAGE);
             
             if(Login_Username.equals(Username) && Login_Password.equals(password)){
                  JOptionPane.showMessageDialog(null, "Welcome " + firstname + " , " + lastname + " ,It is great to see you again");
                 
             }else{
                    JOptionPane.showMessageDialog(null, "Wrong Username or Password ", "ERROR", JOptionPane.ERROR_MESSAGE );
      
             }

       
       }else{
            JOptionPane.showMessageDialog(null, "Registration failed" ,"ERROR",JOptionPane.ERROR_MESSAGE);
            main(null);
      
       }
    }
    
}
