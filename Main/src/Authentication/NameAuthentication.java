package Authentication;
import java.util.ArrayList;

public class NameAuthentication {
    static String name;
    static ArrayList<String[]> investors= new ArrayList<String[]>();

    public NameAuthentication(String name, ArrayList<String[]> investors){
        this.name=name;
        this.investors=investors;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setInvestors(ArrayList<String[]> investors) {
        this.investors = investors;
    }
    public static int main() {
        int counter=0;
        for (String[] s : investors) {
            if (s[0].equals(name)) {
                return counter;
            }
            counter++;
        }

        return -1;
        
    }
    
}
