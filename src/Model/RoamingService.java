package Model;

public class RoamingService extends TelecommunicationService {

    // Constructor
    public RoamingService(String serviceName, double servicePrice, double freeMinutes,
                          int unitOfTariffing, double pricePerMinute,
                          double pricePerCall) {
        super(serviceName, servicePrice, freeMinutes, unitOfTariffing, pricePerMinute, pricePerCall);
        // Initialize additional attributes specific to roaming services
    }

    @Override
    public RoamingService clone() throws CloneNotSupportedException {
        return (RoamingService) super.clone();
    }

    @Override
    public String toString() {
        return "RoamingService{} " + super.toString();
    }

    // Additional methods and overrides as needed
}