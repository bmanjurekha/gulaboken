
public class Phone implements ProfileOperations
{
    public String phoneNumber;

    public Phone(String pNumber)
    {
        this.phoneNumber = pNumber;
    }
    public String getPhoneNumber() { return this.phoneNumber;}
    public void setPhoneNumber(String pNo){this.phoneNumber = pNo;}
    @Override
    public void showItem()
    {
        System.out.println("Phone Number :"+ phoneNumber );
    }
}