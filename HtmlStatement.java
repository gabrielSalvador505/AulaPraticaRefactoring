
public class HtmlStatement extends Statement {
    @Override
    protected String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }
    @Override
    protected String rentalLine(Rental rental) {
        return rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "<BR>\n";
    }
    @Override
    protected String footerString(Customer customer) {
        return "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n" +
               "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
    }
}
