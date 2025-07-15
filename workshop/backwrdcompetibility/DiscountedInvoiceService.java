public class DiscountedInvoiceService implements InvoiceService {

    @Override
    public InvoiceSummary generateInvoice(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            double fare = ride.calculateFare();
            totalFare += fare;
        }
        totalFare = totalFare * 0.9; 
        return new InvoiceSummary(rides.length, totalFare);
    }
}
