package Bank;

//=========================importing pakages
import Authentication.NameAuthentication;
import Authentication.PasswordAuthenticaion;
import Action.Action;
import Information.Informaion;
import Log.Log;

import java.util.ArrayList;
import java.util.Scanner;

public class  Bank{
    static Scanner scan=new Scanner(System.in);
    String name;
    int money;
    String password;
    String hint;

    public Bank(String name, int money, String password, String hint){
        this.name=name;
        this.money=money;
        this.hint=hint;
        this.password=password;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setMoney(int money){
        this.money=money;
    }
    public void setPass(String password){
        this.password=password;
    }
    public void setHint(String hint){
        this.hint=hint;
    }

    public String getHint() {
        return hint;
    }
    public int getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        String pattern="";
        for (int i=0; i < password.length();i++) {
            pattern += "*";
        }
        return pattern;
    }
    public void print(){
        System.out.println("User name: "+ getName());
        System.out.println("Money: "+ getMoney());
        System.out.println("Password pattern: "+getPassword());
    }




    public static void main(String[] args) {
        String temp="";
        ArrayList<String[]> investors=new ArrayList<String[]>();
        String [] line=new String [4];

        while(true){

            System.out.println("Welcome!");
            System.out.println("________**");
            System.out.println("What is your name");
            line[0]=scan.nextLine();
            System.out.println("How much money you have");
            line[1]=scan.nextLine();
            System.out.println("Choose a password");
            line[2]=scan.nextLine();
            System.out.println("Choose a hint in case you forget password");
            line[3]=scan.nextLine();
            System.out.println("\033[H\033[2J");
            System.out.flush();

            investors.add(line);

            System.out.println("new person?");
            temp=scan.nextLine();

            if (temp.equals("No")) {
                break;
            }
            
        }

        while (true) {
            int wrong=3;
            System.out.println("Welcome to bank!");
            System.out.println("What is your name");
            String name=scan.nextLine();
            
            NameAuthentication nameAuth = new NameAuthentication(name, investors);
            int investorId=nameAuth.main();

            if (investorId==-1) {
                System.out.println("No matching investor try again!");
                continue;
            }
            
            System.out.println("We have found your name!");
            System.out.println("What is your password");
            String pass=scan.nextLine();
            PasswordAuthenticaion passAuth = new PasswordAuthenticaion(pass,investors, investorId,3);
            int passResult=passAuth.main();
            if (passResult!=0  && passResult!=0) {
                passResult=PasswordAuthenticaionPasswordAuthenticaion(pass,investors, investorId,passResult);
            }
            else{
                System.out.println("You did 3 wrongs!");
                System.out.println("bye bitych!");
                continue;
            }

            System.out.println("Welcome to your site!");
            System.out.println("-------------------------------");
            System.out.println("# What would you like to do?");
            System.out.println("# 1. WITHDRAW      2.DEPOSITE #");
            System.out.println("# 3. INFO          4.LOG      #");
            System.out.println("# 5. CHAINGE INFO  6.EXIT     #");
            System.out.println("-------------------------------");
            
            int action=scan.nextInt();

            if (action==6) {
                System.exit(0);
            }
            else if(action==1 || action==2){
                Action actObject= new Action();
            }
            else if(action==3){
                investors.get(investorId).print();
            }

        }


    
    }

    private static int PasswordAuthenticaionPasswordAuthenticaion(String pass, ArrayList<String[]> investors,
            int investorId, int passResult) {
    }

}