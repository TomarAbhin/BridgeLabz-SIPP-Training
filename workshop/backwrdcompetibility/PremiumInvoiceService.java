public class PremiumInvoiceService implements InvoiceService {

    @Override
    public InvoiceSummary generateInvoice(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.calculateFare() * 1.2;
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
