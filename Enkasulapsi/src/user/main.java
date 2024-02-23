
package user;

public class main {

    public static void main(String[] args) {
        
        User user = new User("aaa","bbb");
        User user1 = new User();
        
        user1.setUsername("LoL");
        user1.setPassword("LiL");
        
        System.out.println("Username : "+user.getUsername());
        System.out.println("Password : "+user.getPassword());
        
      
    }
    
}
