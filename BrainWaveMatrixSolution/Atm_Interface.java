import java.util.*;

class Bankaccount {
    String name;
    String username;
    String Password;
    String account_no;
    float balance = 10000f;
    int transaction = 0;
    String history = "";


    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        this.name = sc.nextLine();
        System.out.println("Enter Your username");
        this.username = sc.nextLine();
        System.out.println("Enter your password");
        this.Password = sc.nextLine();
        System.out.println("Enter your Account number");
        this.account_no = sc.nextLine();
    }


    public boolean Login() {
        Boolean isLogin = false;
        while (!isLogin) {
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            if (username.equals(this.username)) {
                while (!isLogin) {
                    System.out.println("Enter your Password");
                    String password = sc.nextLine();

                    if (password.equals(this.Password)) {
                        System.out.println("Login Successful");
                        isLogin = true;
                    } else {
                        System.out.println("Invalid Password");
                    }
                }
            } else {
                System.out.println("Invalid Username");
            }
        }
        return isLogin;
    }
public void withdraw()
{
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    try
    {
        if(this.balance>=amount)
        {
            transaction++;
            this.balance-=amount;
            System.out.println("Succesful Withdraw");
            String str= amount+"Rs Withdraw";
            history=history.concat(str);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    catch (Exception e)
    {

    }
}
    public void deposit()
    {
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        try
        {
            if(amount<=10000f)
            {
                transaction++;
                this.balance+=amount;
                System.out.println("Succesfully deposit");
                String str= amount+"Rs Deposit";
                history=history.concat(str);
            }
            else {
                System.out.println("Limit only 10000");
            }
        }
        catch (Exception e)
        {

        }
    }
    public void transhistory()
    {
        if(transaction==0)
        {
            System.out.println("No history Found");
        }

        else {
            System.out.println(history);
        }
    }
    public void transfer() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Receipent's Name: ");
        String receipent = sc.nextLine();
        System.out.println("\nEnter Amount to transfer: ");
        float amount = sc.nextFloat();
        try {
            if(balance>= amount) {
                if(amount <= 50000f) {
                    transaction++;
                    balance -= amount;
                    System.out.println("\nSuccesfully Transferred to "+ receipent);
                    String str = amount + "Rs transferred to " + receipent+"\n";
                    history = history.concat(str);
                }else {
                    System.out.println("\nSorry. The limit is 50000.");
                }
            }else{
                System.out.println("\nInsufficient Balance.");
            }
        }
        catch(Exception e) {
        }

    }

    public void checkBalance() {
        System.out.println("\n"+balance+"Rs");
    }
}

