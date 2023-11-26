package Model;

public class SmsService extends TelecommunicationService {
    private final int numberOfFreeMessages;
    private final double pricePerMessage;

    // Constructor
    public SmsService(String serviceName, double servicePrice, double freeMinutes,
                      int unitOfTariffing, double pricePerMinute,
                      double pricePerCall, int numberOfFreeMessages,
                      double pricePerMessage) {
        super(serviceName, servicePrice, freeMinutes, unitOfTariffing, pricePerMinute, pricePerCall);
        this.numberOfFreeMessages = numberOfFreeMessages;
        this.pricePerMessage = pricePerMessage;
    }

    // Getters and Setters (add as needed)

    @Override
    public SmsService clone() throws CloneNotSupportedException {
        return (SmsService) super.clone();
    }

    @Override
    public String toString() {
        return "SmsService{" +
                "numberOfFreeMessages=" + numberOfFreeMessages +
                ", pricePerMessage=" + pricePerMessage +
                "} " + super.toString();
    }

    // Additional methods and overrides as needed
}
