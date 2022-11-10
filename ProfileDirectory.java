import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ProfileDirectory implements ProfileOperations
{
    private List <Profiles> lstProfiles= new ArrayList<Profiles>();
    //To Show all Profiles
    @Override
    public void showItem()
    {
        for(Profiles profile:lstProfiles)
        {
            profile.showItem();
        }
    }
    // To add Profiles
    public void addProfiles(Profiles profile)
    {
        lstProfiles.add(profile);
    }

    // To remove a profile from List based on LastName
    public void removeItem(int profileIndex)
    {
        lstProfiles.remove(profileIndex);
    }

    //To seach Profile from the list based on Keyword
    public void searchItem(String id)
    {
        for(Profiles p:lstProfiles)
        {
            if(p.getFirstName().contains(id))
            {
                p.showItem();
            }
            if(p.getLastName().contains(id))
            {
                p.showItem();
            }
            if(p.getCity().contains(id))
            {
                p.showItem();
            }
            if(p.getPostCode().equals(id))
            {
                p.showItem();
            }
            if(p.getStreetName().contains(id))
            {
                p.showItem();
            }
            if(p.getPortNumber().equals(id))
            {
                p.showItem();
            }
            for(Phone ph:p.lstPhoneNumber)
            {
                if(ph.getPhoneNumber().equals(id))
                {
                    p.showItem();
                }
            }
        }
    }
    //To seach Profile from the list based on First name
    public void searchfName(String fName)
    {
        for(Profiles p:lstProfiles)
        {
            if(p.getFirstName().equals(fName))
            {
                p.showItem();
            }
        }
    }
    //To seach Profile from the list based on Last name
    public void searchlName(String lName)
    {
        for(Profiles p:lstProfiles)
        {
            if(p.getLastName().equals(lName))
            {
                p.showItem();
            }
        }
    }
    //To seach Profile from the list based on First name
    public void searchsName(String sName)
    {
        for(Profiles p:lstProfiles)
        {
            if(p.getStreetName().equals(sName))
            {
                p.showItem();
            }
        }
    }
    public void searchLastName(String lName)
    {
        //Update Profiles based on Last Name
        for(Profiles p:lstProfiles)
        {
            if(p.getLastName().equals(lName))
            {
                System.out.println("Profile Number :"+lstProfiles.indexOf(p));
                p.showItem();

            }
        }
    }
    public void updateProfileslName(int profileIndex,Profiles newprofile)
    {

        if(lstProfiles!=null && lstProfiles.stream().count()>0) {
            if (!newprofile.getFirstName().isEmpty()) {
                lstProfiles.get(profileIndex).setFirstName(newprofile.getFirstName());
            }
            if (!newprofile.getLastName().isEmpty()) {
                lstProfiles.get(profileIndex).setLastName(newprofile.getLastName());
            }
            if (!(newprofile.getAge() == 0)) {
                lstProfiles.get(profileIndex).setAge(newprofile.getAge());
            }
            if (!newprofile.getCity().isEmpty()) {
                lstProfiles.get(profileIndex).setCity(newprofile.getCity());
            }
            if (!newprofile.getStreetName().isEmpty()) {
                lstProfiles.get(profileIndex).setStreetName(newprofile.getStreetName());
            }
            if (!newprofile.getPortNumber().isEmpty()) {
                lstProfiles.get(profileIndex).setPortNumber(newprofile.getPortNumber());
            }
            if (!newprofile.getPostCode().isEmpty()) {
                lstProfiles.get(profileIndex).setPostCode(newprofile.getPostCode());
            }
            for (Phone ph : newprofile.lstPhoneNumber) {
                if (!ph.getPhoneNumber().isEmpty()) {
                    lstProfiles.get(profileIndex).lstPhoneNumber.add(ph);
                }
            }
        }

    }

}