import java.util.ArrayList;

public class DataPurge {
    public static void addEmails(ArrayList<String> emails){
        emails.add("nabains@me.com");
        
        emails.add("tbmaddux@icloud.com");
        
        emails.add("rfisher@outlook.com");
        
        emails.add("anicola@verizon.net");
        
        emails.add("openaldap@aol.com");
        
        emails.add("rfisher@outlook.com");
        
        emails.add("improv@gmail.com");
        
        emails.add("alias@aol.com");
        
        emails.add("doormat@icloud.com");
        
        emails.add("nabains@me.com");
        
    }

    public static void removeDuplicates(ArrayList<String> emails){
        for(int i = 0; i < emails.size();i++){
            for(int j = 0;j<emails.size();j++){
                if(i != j && emails.get(i).equals(emails.get(j))){
                    System.out.println("Removed: "+emails.get(j));
                    emails.remove(j);
                }
            }
        }
        System.out.println("\nUpdated list:");
        for(int i = 0;i<emails.size();i++){
            System.out.println(emails.get(i));
        }
    }
    public static void removeAol(ArrayList<String> emails){
        for(int i = 0;i<emails.size();i++){
            if(emails.get(i).contains("aol.com")){
                System.out.println("Removed: "+emails.get(i));
                emails.remove(i);
            }
        }
        System.out.println("\nUpdated list:");
        for(int i = 0;i<emails.size();i++){
            System.out.println(emails.get(i));
        }
    }
}
