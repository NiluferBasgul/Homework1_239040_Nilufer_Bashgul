package Model;

public class VoiceService extends TelecommunicationService {
    private final int freeSecondsInCall;
    private final double pricePerSecond;

    // Constructor
    public VoiceService(String serviceName, double servicePrice, double freeMinutes,
                        int unitOfTariffing, double pricePerMinute,
                        double pricePerCall, int freeSecondsInCall,
                        double pricePerSecond) {
        super(serviceName, servicePrice, freeMinutes, unitOfTariffing, pricePerMinute, pricePerCall);
        this.freeSecondsInCall = freeSecondsInCall;
        this.pricePerSecond = pricePerSecond;
    }

    // Getters and Setters (add as needed)

    @Override
    public VoiceService clone() throws CloneNotSupportedException {
        return (VoiceService) super.clone();
    }

    @Override
    public String toString() {
        return "VoiceService{" +
                "freeSecondsInCall=" + freeSecondsInCall +
                ", pricePerSecond=" + pricePerSecond +
                "} " + super.toString();
    }

    // Additional methods and overrides as needed
}
