
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        DataPurge dPurge = new DataPurge();
        ArrayList<String> emails = new ArrayList<String>();
        dPurge.addEmails(emails);
        for(int i = 0;i<emails.size();i++){
            System.out.println(emails.get(i));
        }
        System.out.println(" ");
        dPurge.removeDuplicates(emails);
        System.out.println(" ");
        dPurge.removeAol(emails);
    }
}
