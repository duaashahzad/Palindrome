import java.util.Scanner;


public class Main extends CreateAccount{


    Main(String theName, String theBday, String thePassword, int thePin) {
        super(theName, theBday, thePassword, thePin);
    }


    public static void main(String[] args) {


        int s = 0;


        String newPassword = " ";


        Scanner input = new Scanner(System.in);


        System.out.println("-ˋˏ ༻❁༺ ˎˊ- Welcome to Girlypop Flights! -ˋˏ ༻❁༺ ˎˊ-");
        System.out.println("                ⊹₊┈ㆍ┈ㆍ┈ㆍ✿ㆍ┈ㆍ┈ㆍ┈₊⊹");




        //take in name, birthday, pin password from scanner,
        System.out.println("Please enter the account name: ");
        String name = input.next();
        System.out.println("Please enter the user's birthday: ");
        String birthday = input.next();
        System.out.println("Please enter the account password: ");
        String password = input.next();
        System.out.println("Enter the 4 digit account pin: ");
        int pin = input.nextInt();


        //put it in the parameters for the new user
        CreateAccount user = new CreateAccount(name, birthday, password, pin);


        //begins the loop
        while (s != 5) {
            System.out.println(name + "'s account details: \n" +
                    "Birthday: " + birthday + "\n" +
                    "Password: " + password + "\n" +
                    "Pin: " + pin + "\n" );
            //should call palindrome method to check if password is palindrome
            //System.out.println(get_palindrome or whatever)
            user.checkPalindrome(password);
            System.out.println("_________________________");


            System.out.println("[Ohio to New York, DELTA, 11:31 AM, Juno to California, AMERICAN, 4:20 AM, Atlanta to Chicago, UNITED, 8:30 PM, " + "\n Italy to Nashville, DELTA, 10:00 AM, Arlen to Tuscon, SOUTHWEST, 2:15 PM]");




            System.out.println("\nHow can we help you today? Enter a number: \n" +
                    "1. View available flights\n" +
                    "2. Book a ticket\n" +
                    "3. View your ticket\n" +
                    "4. Change your password\n" +
                    "5. Quit\n");
            s = input.nextInt();


            switch (s) {


                case 1:
                    //the user wants to view available flights
                    s = 1;
                    System.out.println("Available flights: ");
                    user.showFlights();
                    break;
                case 2:
                    //the user wants to book a ticket
                    s = 2;
                    System.out.println("Which flight would u like to book a ticket for?");
                    user.showFlights();


                    int plane = input.nextInt();
                    System.out.print("You have bought a ticket for " + user.flights[plane-1] +"\n");

                    user.addTickets(plane-1);
                    //add flight[plane-1] to a new arry so it can print out in case 3


                    break;
                case 3:
                    //the user wants to view their ticket
                    s = 3;
                    System.out.println("Your ticket is: ");
                    System.out.println(user.showTickets() + "\nd");
                    break;
                case 4:
                    //the user wants to change their password
                    s = 4;
                    System.out.println("Input new password: ");
                    newPassword = input.next();
                    password = newPassword;
                    user.checkPalindrome(newPassword);


                    //set new password, then call palindrome function to make sure
                    break;
                case 5:
                    //the user is done
                    s = 5;
                    System.out.println("Thank you for flying with us!");
                    break;




            }
        }
    }
}



import java.util.Scanner;


public class Main extends CreateAccount{


    Main(String theName, String theBday, String thePassword, int thePin) {
        super(theName, theBday, thePassword, thePin);
    }


    public static void main(String[] args) {


        int s = 0;


        String newPassword = " ";


        Scanner input = new Scanner(System.in);


        System.out.println("-ˋˏ ༻❁༺ ˎˊ- Welcome to Girlypop Flights! -ˋˏ ༻❁༺ ˎˊ-");
        System.out.println("                ⊹₊┈ㆍ┈ㆍ┈ㆍ✿ㆍ┈ㆍ┈ㆍ┈₊⊹");




        //take in name, birthday, pin password from scanner,
        System.out.println("Please enter the account name: ");
        String name = input.next();
        System.out.println("Please enter the user's birthday: ");
        String birthday = input.next();
        System.out.println("Please enter the account password: ");
        String password = input.next();
        System.out.println("Enter the 4 digit account pin: ");
        int pin = input.nextInt();


        //put it in the parameters for the new user
        CreateAccount user = new CreateAccount(name, birthday, password, pin);


        //begins the loop
        while (s != 5) {
            System.out.println(name + "'s account details: \n" +
                    "Birthday: " + birthday + "\n" +
                    "Password: " + password + "\n" +
                    "Pin: " + pin + "\n" );
            //should call palindrome method to check if password is palindrome
            //System.out.println(get_palindrome or whatever)
            user.checkPalindrome(password);
            System.out.println("_________________________");


            System.out.println("[Ohio to New York, DELTA, 11:31 AM, Juno to California, AMERICAN, 4:20 AM, Atlanta to Chicago, UNITED, 8:30 PM, " + "\n Italy to Nashville, DELTA, 10:00 AM, Arlen to Tuscon, SOUTHWEST, 2:15 PM]");




            System.out.println("\nHow can we help you today? Enter a number: \n" +
                    "1. View available flights\n" +
                    "2. Book a ticket\n" +
                    "3. View your ticket\n" +
                    "4. Change your password\n" +
                    "5. Quit\n");
            s = input.nextInt();


            switch (s) {


                case 1:
                    //the user wants to view available flights
                    s = 1;
                    System.out.println("Available flights: ");
                    user.showFlights();
                    break;
                case 2:
                    //the user wants to book a ticket
                    s = 2;
                    System.out.println("Which flight would u like to book a ticket for?");
                    user.showFlights();


                    int plane = input.nextInt();
                    System.out.print("You have bought a ticket for " + user.flights[plane-1] +"\n");

                    user.addTickets(plane-1);
                    //add flight[plane-1] to a new arry so it can print out in case 3


                    break;
                case 3:
                    //the user wants to view their ticket
                    s = 3;
                    System.out.println("Your ticket is: ");
                    System.out.println(user.showTickets() + "\nd");
                    break;
                case 4:
                    //the user wants to change their password
                    s = 4;
                    System.out.println("Input new password: ");
                    newPassword = input.next();
                    password = newPassword;
                    user.checkPalindrome(newPassword);


                    //set new password, then call palindrome function to make sure
                    break;
                case 5:
                    //the user is done
                    s = 5;
                    System.out.println("Thank you for flying with us!");
                    break;




            }
        }
    }
}



