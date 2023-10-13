package inheritance_encaps;

public class Admin extends User{




    private String loginEmail;
    private String loginPassword;

    Admin(String loginEmail,String loginPassword){
        this.loginEmail = loginEmail;
        this.loginPassword = loginPassword;
    }
    String getEmail(){
        return loginEmail;
    }
    void setEmail(String loginEmail){
        this.loginEmail = loginEmail;
    }

     String getPassword(){
        return loginPassword;
    }
    void setPassword(String loginPassword){
        this.loginPassword = loginPassword;
    }

}
