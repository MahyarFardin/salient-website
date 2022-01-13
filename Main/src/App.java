import java.util.Arrays;
import java.util.Scanner;

public class App {
public static void main(String []args) {
    Scanner scan=new Scanner(System. in );
    int number;
    String line="";
    while (true) {
        try {
            number = scan.nextInt();
        } catch (Exception e) {
            break;
        }

        if ( number<0 || number>9){
            break;
        }

            line += number;
        }

        String [] stringList=line.split("");
        int [] numericList=new int[stringList.length];
        int counter=0;

        for(String s:stringList){
            numericList[counter]=Integer. parseInt (s);
            counter++;
        }
        
        Arrays. sort (numericList);
        System. out .println(numericList[(int)Math. floor (numericList.length/2)]);
    }
}