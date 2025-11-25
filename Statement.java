import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer customer) {
        Enumeration rentals = customer.getRentals();
        String result = headerString(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalLine(each);
        }
        result += footerString(customer);
        return result;
    }
    protected abstract String headerString(Customer customer);
    protected abstract String rentalLine(Rental rental);
    protected abstract String footerString(Customer customer);
}
