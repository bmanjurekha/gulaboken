import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {

        int exit = 0;
        int counter =1;
        ProfileDirectory pd = new ProfileDirectory();
        //Exit & Counter variables for handling exit scenarios
        while(exit!=counter)
        {
            //Option to take the user role
            System.out.println("Choose your role");
            System.out.println("1.Guest User");
            System.out.println("2.Admin User");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();


            switch(option)
            {
                case "1":
                    //Case of Guest User
                    System.out.println("Select one of the option below");
                    System.out.println("1. Add a new Profile");
                    System.out.println("2. List all the Profile");
                    System.out.println("3. Search a Profile");
                    System.out.println("4. Exit");
                    String userOptions = sc.nextLine();

                    if(userOptions.equals("1"))
                    {
                        //region Add new Profile
                        System.out.println("Enter First Name :");
                        String fName = sc.nextLine();
                        System.out.println("Enter Last Name :");
                        String lName = sc.nextLine();
                        System.out.println("Enter Age :");
                        String age = sc.nextLine();
                         int agenum = isNumeric(age)?Integer.parseInt(age):0;
                        System.out.println("Enter Street Name :");
                        String sName = sc.nextLine();
                        System.out.println("Enter City :");
                        String city = sc.nextLine();
                        System.out.println("Enter Postcode :");
                        String pCode = sc.nextLine();
                        System.out.println("Enter Port Number :");
                        String pNumber = sc.nextLine();
                        System.out.println("How many telephone numbers do you have?");
                        String phoneConnections = sc.nextLine();
                        System.out.println("Enter "+ phoneConnections+" telephone numbers");
                        List<Phone> lstPhone = new ArrayList<Phone>();
                        int phoneConnectionsnum = isNumeric(phoneConnections)?Integer.parseInt(phoneConnections):0;
                        for (int i=1;i<=phoneConnectionsnum;i++)
                        {
                            Phone p = new Phone(sc.nextLine());
                            lstPhone.add(p);
                        }
                        Profiles pf = new Profiles(fName,lName,agenum,sName,city,pCode,pNumber,lstPhone);
                        pd.addProfiles(pf);
                        System.out.println("Profile saved successfully");
                        System.out.println("===============================================");
                        //endregion
                    }
                    else if(userOptions.equals("2"))
                    {
                        //region List all Profiles
                        System.out.println("List of saved Profiles :");
                        pd.showItem();
                        System.out.println("===============================================");
                        //endregion

                    }
                    else if(userOptions.equals("3"))
                    {
                        //region Search
                        System.out.println("Select the option to search");
                        System.out.println("Search by");
                        System.out.println("1. First Name");
                        System.out.println("2. Last Name");
                        System.out.println("3. Street Name");
                        System.out.println("4. Free Search");
                        System.out.println("5. Exit");
                        String searchOptions = sc.nextLine();
                        if(searchOptions.equals("1")) {
                            //Search Profiles based on First Name
                            System.out.println("Enter First Name to search a Profile :");
                            String fName = sc.nextLine();
                            System.out.println("List of Profiles found :");
                            pd.searchfName(fName);
                            System.out.println("===============================================");
                        }
                        else if(searchOptions.equals("2")) {
                            //Search Profiles based on Last Name
                            System.out.println("Enter Last Name to search a Profile :");
                            String lName = sc.nextLine();
                            System.out.println("List of Profiles found :");
                            pd.searchlName(lName);
                            System.out.println("===============================================");
                        }
                        else if(searchOptions.equals("3")) {
                            //Search Profiles based on streetName
                            System.out.println("Enter  streetName to search a Profile :");
                            String sName= sc.nextLine();
                            System.out.println("List of Profiles found :");
                            pd.searchsName(sName);
                            System.out.println("===============================================");
                        }
                        else if(searchOptions.equals("4")) {
                            //Search Profiles based on Keyword
                            System.out.println("Enter keyword to search a Profile :");
                            String keyWord = sc.nextLine();
                            System.out.println("List of Profiles found :");
                            pd.searchItem(keyWord);
                            System.out.println("===============================================");
                        }

                        else if(searchOptions.equals("5")) {
                            //Exit
                            counter = 0;
                        }
                        //endregion
                    }
                    else if(userOptions.equals("4"))
                    {
                        counter=0;
                    }
                    break;

                case "2":
                    System.out.println("Enter Admin password");
                    String password = sc.nextLine();
                    if(password.equals("Password"))
                    {
                        System.out.println("1. Add a new Profile");
                        System.out.println("2. List all the Profile");
                        System.out.println("3. Search a Profile");
                        System.out.println("4. Edit a Profile");
                        System.out.println("5. Remove a Profile");
                        System.out.println("6. Exit");
                        String adminOptions = sc.nextLine();

                        if(adminOptions.equals("1"))
                        {
                            //region Add new Profile
                            System.out.println("Enter First Name :");
                            String fName = sc.nextLine();
                            System.out.println("Enter Last Name :");
                            String lName = sc.nextLine();
                            System.out.println("Enter Age :");
                            String age = sc.nextLine();
                            int agenum = isNumeric(age)?Integer.parseInt(age):0;
                            System.out.println("Enter Street Name :");
                            String sName = sc.nextLine();
                            System.out.println("Enter City :");
                            String city = sc.nextLine();
                            System.out.println("Enter Postcode :");
                            String pCode = sc.nextLine();
                            System.out.println("Enter Port Number :");
                            String pNumber = sc.nextLine();
                            System.out.println("How many telephone numbers do you have?");
                            String phoneConnections =sc.nextLine();
                            System.out.println("Enter "+ phoneConnections+" telephone numbers");
                            List<Phone> lstPhone = new ArrayList<Phone>();
                            int phoneConnectionsnum = isNumeric(phoneConnections)?Integer.parseInt(phoneConnections):0;
                            for (int i=1;i<=phoneConnectionsnum;i++)
                            {
                                Phone p = new Phone(sc.nextLine());
                                lstPhone.add(p);
                            }
                            Profiles pf = new Profiles(fName,lName,agenum,sName,city,pCode,pNumber,lstPhone);
                            pd.addProfiles(pf);
                            System.out.println("Profile saved successfully");
                            System.out.println("===============================================");
                            //endregion
                        }
                        else if(adminOptions.equals("2"))
                        {
                            //region List all Profiles
                            System.out.println("List of saved Profiles :");
                            pd.showItem();
                            System.out.println("===============================================");
                            //endregion
                        }
                        else if(adminOptions.equals("3"))
                        {
                            //region Search
                            System.out.println("Select the option to search");
                            System.out.println("Search by");
                            System.out.println("1. First Name");
                            System.out.println("2. Last Name");
                            System.out.println("3. Street Name");
                            System.out.println("4. Free Search");
                            System.out.println("5. Exit");
                            String searchOptions = sc.nextLine();
                            if(searchOptions.equals("1")) {
                                //Search Profiles based on First Name
                                System.out.println("Enter First Name to search a Profile :");
                                String fName = sc.nextLine();
                                System.out.println("List of Profiles found :");
                                pd.searchfName(fName);
                                System.out.println("===============================================");
                            }
                            else if(searchOptions.equals("2")) {
                                //Search Profiles based on Last Name
                                System.out.println("Enter Last Name to search a Profile :");
                                String lName = sc.nextLine();
                                System.out.println("List of Profiles found :");
                                pd.searchlName(lName);
                                System.out.println("===============================================");
                            }
                            else if(searchOptions.equals("3")) {
                                //Search Profiles based on streetName
                                System.out.println("Enter  streetName to search a Profile :");
                                String sName= sc.nextLine();
                                System.out.println("List of Profiles found :");
                                pd.searchsName(sName);
                                System.out.println("===============================================");
                            }
                            else if(searchOptions.equals("4")) {
                                //Search Profiles based on Keyword
                                System.out.println("Enter keyword to search a Profile :");
                                String keyWord = sc.nextLine();
                                System.out.println("List of Profiles found :");
                                pd.searchItem(keyWord);
                                System.out.println("===============================================");
                            }
                            else if(searchOptions.equals("5")) {
                                //Exit
                                counter = 0;
                            }
                            //endregion
                        }
                        else if(adminOptions.equals("4"))
                        {
                            //region Edit a Profile
                            System.out.println("Search Last Name to edit a Profile :");
                            String lName = sc.nextLine();
                            System.out.println("List of Profiles found :");
                            pd.searchLastName(lName);
                            System.out.println("===============================================");

                            System.out.println("Enter the Profile Number to Edit");

                            int indextoEdit =Integer.parseInt(sc.nextLine());

                            System.out.println("Enter First Name :");
                            String fName = sc.nextLine();
                            System.out.println("Enter Last Name :");
                            String lastName = sc.nextLine();
                            System.out.println("Enter Age :");
                            String age = sc.nextLine();
                            int agenum = isNumeric(age)?Integer.parseInt(age):0;
                            System.out.println("Enter Street Name :");
                            String sName = sc.nextLine();
                            System.out.println("Enter City :");
                            String city = sc.nextLine();
                            System.out.println("Enter Postcode :");
                            String pCode = sc.nextLine();
                            System.out.println("Enter Port Number :");
                            String pNumber = sc.nextLine();
                            System.out.println("How many telephone numbers do you have?");
                            String phoneConnections =sc.nextLine();
                            System.out.println("Enter "+ phoneConnections+" telephone numbers");
                            List<Phone> lstPhone = new ArrayList<Phone>();
                            int phoneConnectionsnum = isNumeric(phoneConnections)?Integer.parseInt(phoneConnections):0;
                            for (int i=1;i<=phoneConnectionsnum;i++)
                            {
                                Phone p = new Phone(sc.nextLine());
                                lstPhone.add(p);
                            }
                            Profiles pf = new Profiles(fName,lastName,agenum,sName,city,pCode,pNumber,lstPhone);

                            pd.updateProfileslName(indextoEdit,pf);
                            System.out.println("Profile updated successfully");
                            System.out.println("===============================================");
                            //endregion
                        }
                        else if(adminOptions.equals("5"))
                        {
                            //region Remove a Profile
                            System.out.println("Enter Last Name to remove a Profile :");
                            String lName = sc.nextLine();
                            pd.searchLastName(lName);
                            System.out.println("Enter the Profile Number to Remove");
                            int indextoRemove =Integer.parseInt(sc.nextLine());
                            pd.removeItem(indextoRemove);
                            System.out.println("Profile removed Successfully");
                            System.out.println("===============================================");
                            //endregion
                        }
                        else if(adminOptions.equals("6"))
                        {
                            counter = 0;
                        }

                    }
                    else
                    {
                        System.out.println("Invalid Password");
                        counter = 0;
                    }
                    break;


            }

        }


    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
