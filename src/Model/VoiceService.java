package Model;

public class VoiceService extends TelecommunicationService {
// nasleduva od klasata TelecommunicationService

    // Attributes
    private final int freeSecondsInCall; // brojot na besplatni sekundi
    private final double pricePerSecond; // cenata sto se naplakja po dopolnitelna sekundi nad besplatni granica

    // Constructor
    public VoiceService(String serviceName, double servicePrice, double freeMinutes,
                         double pricePerMinute,
                        double pricePerCall, int freeSecondsInCall,
                        double pricePerSecond) {
        super(serviceName, servicePrice, freeMinutes, pricePerMinute, pricePerCall);
        this.freeSecondsInCall = freeSecondsInCall;
        this.pricePerSecond = pricePerSecond;
    } // go povikuva konstruktorot na osnovnata klasa (TelecommunicationService) za da postavi zaednicki atributi

    // Methods
    @Override
    public VoiceService clone() throws CloneNotSupportedException {
        return (VoiceService) super.clone();
    } // Override metoda za da obezbedi string citliv prikaz na objektot VoiceService

    @Override
    public String toString() {
        return "VoiceService{" +
                "freeSecondsInCall=" + freeSecondsInCall +
                ", pricePerSecond=" + pricePerSecond +
                "} " + super.toString();
    } // Override metoda za da obezbedi string citliv prikaz na objektot VoiceService
}
// Одговорности:
//Pretstavuva usluga za govorna komunikacija vo telekomunikaciski paket.
//Nasleduva od klasa TelecommunicationService.
//Ovozmozhuva kloniranje za sozdavanje kopii od objetki na TelecommunicationService.
//Usluga za glasovna komunikacija во рамките на telekomunikaciski paket.
