
package user;

public class main {

    public static void main(String[] args) {
        
        User user = new User("aaa","bbb");
        User user1 = new User();
        
        user.setUsername("LoL");
        user.setPassword("LiL");
        
        System.out.println("Username : "+user.getUsername());
        System.out.println("Password : "+user.getPassword());
        
      
    }
    
}
