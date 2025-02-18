public class MovieTicket {

    private String customerName;
    private int numTickets;

    public MovieTicket(String customerName, int numTickets){
        this.customerName = customerName;
        this.numTickets = numTickets;
    }
    
    public void showBooking(){
        System.out.println("Movie Booking Details : ");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Number of Tickets : " + numTickets);
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Dan", 3);
        MovieTicket ticket2 = new MovieTicket("October", 4);

        ticket1.showBooking();
        System.out.println();
        ticket2.showBooking();
        
    }
}
