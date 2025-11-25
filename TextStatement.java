
public class TextStatement extends Statement {
    @Override
    protected String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
    @Override
    protected String rentalLine(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }
    @Override
    protected String footerString(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n" +
               "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}
