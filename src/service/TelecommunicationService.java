package service;

public class TelecommunicationService implements Cloneable {
    // implementira interfejsot Clonaeable
    // Attributes
    private final String serviceName; // imeto na telekomunikaciska usluga
    private final double servicePrice; // celokupna cena na uslugata
    private final double freeMinutes; // brojot na besplatni minuti vkluceni vo uslugata
    private final double pricePerMinute; // cenata sto se naplakja po dopolnitelna minuta nad besplatni granica
    private final double pricePerCall; // cenata sto se naplakja za zapocnuvanje na povik

    // Constructor
    public TelecommunicationService(String serviceName, double servicePrice, double freeMinutes,
                                    double pricePerMinute, double pricePerCall) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.freeMinutes = freeMinutes;
        this.pricePerMinute = pricePerMinute;
        this.pricePerCall = pricePerCall;
    } // ja inicijalizira telekomunikaciskata usluva so parametri

    // Methods
    @Override
    public TelecommunicationService clone() throws CloneNotSupportedException {
        return (TelecommunicationService) super.clone();
    } // Override metoda za da obezbedi string citliv prikaz na objektot TelecommunicationService

    @Override
    public String toString() {
        return "TelecommunicationService{" +
                "serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                ", freeMinutes=" + freeMinutes +
                ", pricePerMinute=" + pricePerMinute +
                ", pricePerCall=" + pricePerCall +
                '}';
    } // Override metoda za da obezbedi string citliv prikaz na objektot TelecommunicationService

    // Getter
    public double getServicePrice() {
        return servicePrice;
    } // ja vrakja vkupnata cena na uslugata
}
// Odgovornosti:
//Pretstavuva genericka telekomunikaciska usluga vo telekomunikaciski paket.
//Nasleduva od klasa TelecommunicationService.
//Ovozmozhuva kloniranje za sozdavanje kopii od objetki na TelecommunicationService.
//Usluga  ovnesuvanje vo ramkite na sistemot na paketi na TelecommunicationService.
