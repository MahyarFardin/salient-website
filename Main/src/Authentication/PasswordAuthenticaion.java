package Authentication;

import java.util.ArrayList;

public class PasswordAuthenticaion {
    static String password;
    static ArrayList<String[]> investors= new ArrayList<String[]>();
    static int id;
    static int attempt;

    public PasswordAuthenticaion(String password, ArrayList<String[]> investors, int id, int attempt){
        this.password=password;
        this.investors=investors;
        this.id=id;
        this.attempt=attempt;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setInvestors(ArrayList<String[]> investors) {
        this.investors = investors;
    }
    
    public static void setAttempt(int attempt) {
        PasswordAuthenticaion.attempt = attempt;
    }
    public static void setId(int id) {
        PasswordAuthenticaion.id = id;
    }
    public static int getAttempt() {
        return attempt;
    }
    public static int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public ArrayList<String[]> getInvestors() {
        return investors;
    }

    public static int main() {
        if (investors.get(id)[2].equals(password)) {
            return 0;
        }
        else{
            System.out.println("you have "+ attempt-- + " chances");
            return attempt;
        }
    }
}
