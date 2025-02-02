package Package3;

public class User {

    private String userName;
    private String pass;
    private long customerNumber;
    private double balance=0;
    private String accountNumber;
    private int age;
    private static int countOfUsers=0;

    public User(String userName, String pass,long customerNumber) {
        this.userName = userName;
        this.pass = pass;
        this.customerNumber = customerNumber;
        countOfUsers ++;
    }
   public static int getCountOfUsers()
   {
       return countOfUsers;
   }
        public void setAccountNumber(String accountNumber){
            this.accountNumber=accountNumber;
        }
        public void addBalance(double balance) {
          if (balance>0) {
              this.balance = this.balance + balance;
          } else
              System.out.println("amount can't be negative");
        }
public void withdrawBalance(double amount){
        if(amount>0) {
            balance = balance - amount;
        } else
            System.out.println("Insuficient balance");
        }

    }


