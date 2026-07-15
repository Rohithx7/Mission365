public class MovieBooking {
    public static void main(String[] args) {
        //TODO 1: Declare and initialize variable for First Name
        String firstName = "Sandy";
        System.out.println("First Name: "+firstName);
        //TODO 1: Declare and initialize variable for Last Name
        String lastName = "Jones";
        System.out.println("Last Name: "+lastName);
        //TODO 1: Declare and initialize variable for Movie Title
        String movieTitle = "The Source Code";
        System.out.println("Movie Title: "+movieTitle);
        //TODO 1: Declare and initialize variable for Number of tickets
        int numberOfTickets = 8;
        System.out.println("Number of Tickets: "+numberOfTickets);
        //TODO 1: Declare and initialize variable for Price per ticket
        double pricePerTicket = 10.57;
        System.out.println("Price per ticket in USD : "+ pricePerTicket);
        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        int numberOftickets = 8;
       double  totalPrice = numberOftickets*pricePerTicket;
        System.out.println("Total Price of "+numberOfTickets+" tickets: "+ totalPrice);
        //TODO 3: Concatenate first name and last name into new variable username with no space in between
        // first and last name and convert them to lower case
        String userName = firstName.toLowerCase()+lastName.toLowerCase();
        System.out.println("Username: "+userName);

        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieName = movieTitle.toUpperCase();
        System.out.println("Updated movie name: "+movieName);

        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output
        System.out.println("Congratulations!! You have successfully booked the tickets\n"+"\nUsername: "+userName+ "\nMovie: "+movieName+"\nNumber of Tickets : "+numberOfTickets +"\nPrice per ticket : $"+pricePerTicket+"\nTotal Price of "+numberOfTickets+" tickets: "+totalPrice+"\nThank you for choosing us for booking your movie tickets"+"\n\nEnjoy your movie!!!" );

    }
}
