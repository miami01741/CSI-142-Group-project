public class Ticket {
    private String ticketType;
    private double price;
    private String eventDate;
    private String holderName;
    
    public Ticket(String ticketType, double price, String eventDate, String holderName) {
        this.ticketType = ticketType;
        this.price = price;
        this.eventDate = eventDate;
        this.holderName = holderName;
    }

    // Getters and Setters
    public String getTicketType() {
        return ticketType;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getTicketDetails() {
        return "Ticket Details:\n" + 
               "Name: " + getHolderName() + "\n" +
               "Event Date: " + getEventDate() + "\n" +
               "Ticket Type: " + getTicketType() + "\n" +
               "Price: " + getPrice();
    }
    
    @Override
    public String toString() {
        return getTicketDetails();
    }
}