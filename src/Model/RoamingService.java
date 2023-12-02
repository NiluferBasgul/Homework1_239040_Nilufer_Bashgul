package Model;

public class RoamingService extends TelecommunicationService {
// nasleduva od klasata TelecommunicationService

    // Constructor
    public RoamingService(String serviceName, double servicePrice, double freeMinutes, double pricePerMinute,
                          double pricePerCall) {
        super(serviceName, servicePrice, freeMinutes, pricePerMinute, pricePerCall);
    } // go povikuva konstruktorot na osnovnata klasa (TelecommunicationService) za da postavi zaednicki atributi

    // Methods
    @Override
    public RoamingService clone() throws CloneNotSupportedException {
        return (RoamingService) super.clone();
    } // Override metoda za da obezbedi string citliv prikaz na objektot RoamingService

    @Override
    public String toString() {
        return "RoamingService{} " + super.toString();
    } // Override metoda za da obezbedi string citliv prikaz na objektot RoamingService

}
//Odgovornosti:
//Pretstavuva usluga za roaming vo telekominikaciski paket.
//Nasleduva od klasa TelecommunicationService.
//Ovozmozhuva kloniranje za sozdavanje kopii od objetki na RoamingService.
//Ugostitelski za korisnici koi baraat uslugi nadvor od nivnata drzhava
