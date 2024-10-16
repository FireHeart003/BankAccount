public class BankAccount 
{
    double balance;
    Customer cust;
    
    BankAccount (Customer c, double amt)
    {
        cust = c;
        balance = amt;
    }
    
    Customer getCustomer()
    {
        return cust;
    }
    
    void deposit(double amt)
    {
        balance += amt;
    }
    
    void withdraw(double amt)
    {
        balance -= amt;
    }
    
    public double getAmount()
    {
        return balance;
    }
    
    boolean isSufficient(double amt)
    {
        return balance >= amt;
    }
}