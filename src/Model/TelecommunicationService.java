package Model;

public class TelecommunicationService implements Cloneable {
    private final String serviceName;
    private final double servicePrice;
    private final double freeMinutes;
    private final int unitOfTariffing;
    private final double pricePerMinute;
    private final double pricePerCall;

    // Constructor
    public TelecommunicationService(String serviceName, double servicePrice, double freeMinutes,
                          int unitOfTariffing, double pricePerMinute, double pricePerCall) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.freeMinutes = freeMinutes;
        this.unitOfTariffing = unitOfTariffing;
        this.pricePerMinute = pricePerMinute;
        this.pricePerCall = pricePerCall;
    }

    // Getters and Setters (add as needed)

    @Override
    public TelecommunicationService clone() throws CloneNotSupportedException {
        return (TelecommunicationService) super.clone();
    }

    @Override
    public String toString() {
        return "TelecomService{" +
                "serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                ", freeMinutes=" + freeMinutes +
                ", unitOfTariffing=" + unitOfTariffing +
                ", pricePerMinute=" + pricePerMinute +
                ", pricePerCall=" + pricePerCall +
                '}';
    }

    public double getServicePrice() {
        return servicePrice;
    }

    // Additional methods and overrides as needed
}
