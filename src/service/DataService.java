package service;

public class DataService extends TelecommunicationService {
// nasleduva od klasata TelecommunicationService

    // Attributes
    private final int freeDataTransfer; //besplaten prenos na potadoci
    private final double price; //cenata za prenos

    // Constructor
    public DataService(String serviceName, double servicePrice, double freeMinutes,
                       double pricePerMinute,
                       double pricePerCall, int freeDataTransfer,
                       double price) {
        super(serviceName, servicePrice, freeMinutes, pricePerMinute, pricePerCall);
        this.freeDataTransfer = freeDataTransfer;
        this.price = price;
    } // go povikuva konstruktorot na osnovnata klasa (TelecommunicationService) za da postavi zaednicki atributi

    // Methods
    @Override
    public DataService clone() throws CloneNotSupportedException {
        return (DataService) super.clone();
    } // Override metoda clone od klasata Object za da ovozmozhi kloniranje na objekti od DataService.

    @Override
    public String toString() {
        return "DataService{" +
                "freeDataTransfer=" + freeDataTransfer +
                ", price=" + price +
                "} " + super.toString();
    } // Override metoda za da obezbedi string citliv prikaz na objektot DataService
}
// Odgovornosti:
//Pretstavuva usluga za podatoci vo telekominakaciski paket.
//Nasleduva od klasa TelecommunicationService.
//Ovozmozhuva kloniranje za sozdavanje kopii od objetki na DataService.
//Usluga za SMS kominikacija, sto go pravi pogoden za korisnici koi potpiraa na tekstualni poraki.

