public interface InvoiceService {
    InvoiceSummary generateInvoice(Ride[] rides);
    default double calculateSingleRideFare(Ride ride) {
        return ride.calculateFare();
    }
}


