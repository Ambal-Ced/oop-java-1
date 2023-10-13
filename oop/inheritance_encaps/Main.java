package inheritance_encaps;
//User and Admin view where on admin view email and password is available to see
public class Main {
    public static void main(String args[]) {
        User u = new User();
        Admin a = new Admin("justineambal@example.com", "justine234");
        line l = new line();
        String Email = a.getEmail();
        String Password = a.getPassword();
        //this is the User view
        u.fName ="Justine ";
        u.lName = "Ambal";
        u.age = 19;
        u.sex = 'M';
        //this will show inheritance
        a.fName = "Justine Cedrick ";
        a.lName = "Ambal";
        a.age = 19;
        a.sex = 'M';
        //encapsulation
        a.setEmail("justine@example.com");//this will be overide by the string Email
        a.setPassword("justineadmin21");///same
        //output
        System.out.println("User View(Only View public info)");
        System.out.println("Name: "+ u.fName + u.lName);
        System.out.println("Age: "+ u.age);
        System.out.println("Sex: "+ u.sex);
        System.out.println(l.l);
        System.out.println("Admin View(See All Information)");
        System.out.println("Name: "+ a.fName + a.lName);
        System.out.println("Age: "+ a.age);
        System.out.println("Sex: "+ a.sex);
        System.out.println("Email: "+ Email);
        System.out.println("Password: "+ Password);
    }
}
