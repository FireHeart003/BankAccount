class Customer 
{
    Name name;
    String accNo;
    Address address;
    
    Customer (Name n, String ac, Address addr)
    {
        name = n;
        accNo=ac;
        this.address = addr;
    }
    
    Name getName()
    {
        return name;
    }
    
    Address getAddress()
    {
        return address;
    }
    
    public String getAccountNumber()
    {
        return accNo;
    }
}