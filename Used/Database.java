import java.util.ArrayList;

class Database 
{
    ArrayList<BankAccount> list;
    BankAccount ba;
    int index;
    boolean found;

    Database()
    {
        list = new ArrayList<BankAccount>();
    }
    
    void add(BankAccount b)
    {
        list.add(b);
    }
    
    BankAccount delete(int i)
    {
        return list.remove(i);
    }
    
    int getSize()
    {
        return list.size();
    }
    
    boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    void search(String key)
    {
        found = false;
        int i = 0;
        
        while(!found && i < list.size())
        {
            BankAccount b = list.get(i);
            
            if(b.getCustomer().getAccountNumber().equalsIgnoreCase(key)){
                ba = b;
                found = true;
                index=i;
            }
            else
                i++;
                   
        }
    }
    
    ArrayList getList()
    {
    	return list;
    }
    boolean inList()
    {
        return found;
    }
    
    BankAccount getAccount()
    {
        return ba;
    }
    
    public int getIndex()
    {
    	return index;
    }
}