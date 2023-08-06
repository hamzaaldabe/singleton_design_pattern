
public class Main {
    public static void main(String[] args) {

        passwordManager manager = passwordManager.getInstance();


        manager.savePassword("user1", "pass123");
        manager.savePassword("user2", "securePwd");


        passwordManager manager1 = passwordManager.getInstance();
        manager1.savePassword("user3", "mySecret");
        
    }
}