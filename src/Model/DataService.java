package Model;

public class DataService extends TelecommunicationService {
    private final int freeDataTransfer;
    private final int unitOfTariffing;
    private final double pricePerUnit;
    private final int maxDownloadSpeed;
    private final int maxUploadSpeed;

    // Constructor
    public DataService(String serviceName, double servicePrice, double freeMinutes,
                       int unitOfTariffing, double pricePerMinute,
                       double pricePerCall, int freeDataTransfer,
                       int unitOfTariffingData, double pricePerUnit,
                       int maxDownloadSpeed, int maxUploadSpeed) {
        super(serviceName, servicePrice, freeMinutes, unitOfTariffing, pricePerMinute, pricePerCall);
        this.freeDataTransfer = freeDataTransfer;
        this.unitOfTariffing = unitOfTariffingData;  // Assuming separate units for data tariffing
        this.pricePerUnit = pricePerUnit;
        this.maxDownloadSpeed = maxDownloadSpeed;
        this.maxUploadSpeed = maxUploadSpeed;
    }

    // Getters and Setters (add as needed)

    @Override
    public DataService clone() throws CloneNotSupportedException {
        return (DataService) super.clone();
    }

    @Override
    public String toString() {
        return "DataService{" +
                "freeDataTransfer=" + freeDataTransfer +
                ", unitOfTariffing=" + unitOfTariffing +
                ", pricePerUnit=" + pricePerUnit +
                ", maxDownloadSpeed=" + maxDownloadSpeed +
                ", maxUploadSpeed=" + maxUploadSpeed +
                "} " + super.toString();
    }

    // Additional methods and overrides as needed
}

