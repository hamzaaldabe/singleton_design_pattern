import java.io.FileWriter;
import java.io.IOException;

public class passwordManager {
    private static passwordManager instance;
    private String filePath;

    private passwordManager() {
        filePath = "passwords.txt";
    }

    public static passwordManager getInstance()  {
        if (instance == null) {
            instance = new passwordManager();
        }
        return instance;
    }

    public void savePassword(String username, String password) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write("Username: " + username + " Password: " + password + "\n");
            writer.close();
            System.out.println("Password saved.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to save password.");
        }
    }
}