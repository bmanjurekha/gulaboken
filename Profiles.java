import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Profiles implements ProfileOperations
{
    private String firstName;
    private String lastName;
    private int age;
    public String city;
    public String postCode;
    public String streetName;
    public String portNumber;
    public List<Phone> lstPhoneNumber;

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public int getAge() { return this.age; }
    public String getCity() { return this.city; }
    public String getPostCode() { return this.postCode; }
    public String getStreetName() { return this.streetName; }
    public String getPortNumber(){return this.portNumber;}

    public void setFirstName(String fName) { this.firstName = fName; }
    public void setLastName(String lName) { this.lastName = lName; }
    public void setAge(int age) { this.age = age; }
    public void setCity(String city) { this.city = city; }
    public void setPostCode(String pCode) { this.postCode = pCode; }
    public void setStreetName(String sName) { this.streetName = sName; }
    public void setPortNumber(String pNumber){this.portNumber = pNumber;}


    public Profiles(String firstName,String lastName,int age,String streetName,String city,String postCode,String portNumber,List<Phone> lstPhoneNumber )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.postCode = postCode;
        this.streetName = streetName;
        this.portNumber = portNumber;
        this.lstPhoneNumber = lstPhoneNumber;
    }

    @Override
    public void showItem()
    {
        System.out.println("First Name : "+ firstName );
        System.out.println("Last Name : "+ lastName );
        System.out.println("Age : "+ age );
        System.out.println("Street Name : "+ streetName );
        System.out.println("City : "+ city );
        System.out.println("PostCode : "+ postCode );
        System.out.println("Port Number : "+ portNumber );
        for(Phone ph:lstPhoneNumber)
        {
            ph.showItem();
        }
        System.out.println("============================================" );
    }


}