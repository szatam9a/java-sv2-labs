package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username){
        return username.equals("")? false: true;
    }
    public boolean isValidPassword(String password1, String password2){
        return password1.equals(password2) && (password1.length()>7);
    }
    public boolean isValidEmail(String email){
        int insidetest = email.indexOf("@",1);
        System.out.println(insidetest);
        int dottest = email.indexOf(".", insidetest+2);
        System.out.println(dottest);


        return (insidetest!=-1) && (dottest!=-1);
    }


}
