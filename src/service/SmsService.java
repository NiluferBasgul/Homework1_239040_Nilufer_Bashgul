package service;

public class SmsService extends TelecommunicationService {
// nasleduva od klasata TelecommunicationService

    // Attributes
    private final int numberOfFreeMessages; //brojot na besplatni poraki vkluceni vo uslugata
    private final double pricePerMessage; //cenata sto se naplakja po dopolnitelna poraka nad besplatni granica

    // Constructor
    public SmsService(String serviceName, double servicePrice, double freeMinutes,
                      double pricePerMinute,
                      double pricePerCall, int numberOfFreeMessages,
                      double pricePerMessage) {
        super(serviceName, servicePrice, freeMinutes, pricePerMinute, pricePerCall);
        this.numberOfFreeMessages = numberOfFreeMessages;
        this.pricePerMessage = pricePerMessage;
    } // go povikuva konstruktorot na osnovnata klasa (TelecommunicationService) za da postavi zaednicki atributi

    // Methods
    @Override
    public SmsService clone() throws CloneNotSupportedException {
        return (SmsService) super.clone();
    } // Override metoda za da obezbedi string citliv prikaz na objektot SmsService

    @Override
    public String toString() {
        return "SmsService{" +
                "numberOfFreeMessages=" + numberOfFreeMessages +
                ", pricePerMessage=" + pricePerMessage +
                "} " + super.toString();
    } // Override metoda za da obezbedi string citliv prikaz na objektot SmsService
}
// Odgovornosti:
//Pretstavuva SMS usluga vo telekomunikaciski paket.
//Nasleduva od klasa TelecommunicationService.
//Ovozmozhuva kloniranje za sozdavanje kopii od objetki na RoamingService.
//Usluga za kratki poraki (SMS) vo ramki за кратки пораки (SMS) во рамките на телеком пакет.
