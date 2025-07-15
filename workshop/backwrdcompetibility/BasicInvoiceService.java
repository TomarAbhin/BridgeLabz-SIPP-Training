public class BasicInvoiceService implements InvoiceService {

    @Override
    public InvoiceSummary generateInvoice(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.calculateFare();
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
    @Override
    public double calculateSingleRideFare(Ride ride) {
        return ride.calculateFare();
    }
}
