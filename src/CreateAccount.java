
public class CreateAccount {

    String name;
    String bDay;
    String password;
    int pin;
    String[] flights = new String[5];
    String[] tickets = new String[5];

    CreateAccount(String theName, String theBday, String thePassword, int thePin) {
        //make sure these are corect order
        theName = name;
        theBday = bDay;
        thePassword = password;
        thePin = pin;
    }

    public void setName(String theName) {
        theName = name;
    }

    public void showFlights() {
        flights[0] = "1. Ohio to New York, DELTA, 11:31 AM \n";
        flights[1] = "2. Juno to California, AMERICAN, 4:20 AM \n";
        flights[2] = "3. Atlanta to Chicago, UNITED, 8:30 PM \n";
        flights[3] = "4. Italy to Nashville, DELTA, 10:00 AM \n";
        flights[4] = "5. Arlen to Tuscon, SOUTHWEST, 2:15 PM \n";

        for(int i = 0; i < flights.length; i++) {
            System.out.print(flights[i]);
        }

    }

    public void addTickets(int thePlane)
    {
        for(int i = 0; i < tickets.length; i++)
        {
            String theTicket = flights[thePlane];
            tickets[i] = theTicket;
        }
    }

    public String showTickets()
    {
        String result = " ";

        for(int i = 0; i < tickets.length; i++) {
            result += tickets[i];
        }
        return result += " ";
    }




    protected void checkPalindrome(String password) {
    }

    //print flights using for loop



}
