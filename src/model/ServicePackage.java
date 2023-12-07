package model;

import service.TelecommunicationService;

import java.util.ArrayList;
import java.util.List;

public class ServicePackage {
    // Attributes
    private final String name; // imeto na usluzhniot paket
    private final List<TelecommunicationService> services; // lista sto sodrzhi instanca od TelecommunicationService

    // Contructor
    private ServicePackage(String name) {
        this.name = name;
        this.services = new ArrayList<>();
    } //private konstruktor koristi za kreiranje na nov primerok so atributi na ServicePackage

    // Factory Method
    public static ServicePackage createPackage(String name) {
        return new ServicePackage(name);
    } // static factory metoda se koristi za kreiranje na nov primerok ServicePackage so dadeno ime

    public void addService(TelecommunicationService service) {
        services.add(service);
    } // dodava TelecommunicationService vo spisokot so uslugi

    public String getName() {
        return name;
    } // go vrakja imeot na usluzhniot paket

    public ServicePackage clonePackage() {
        ServicePackage clonedPackage = new ServicePackage(this.name);
        for (TelecommunicationService service : services) {
            try {
                clonedPackage.addService(service.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace(); // Handle the exception based on your requirements
            }
        }
        return clonedPackage;
    } // klonira na tekovniot paket na uslugi, vklucuvajki kloniran primeroci na skoja usluga

    public void listServices() {
        for (TelecommunicationService service : services) {
            System.out.println(service);
        }
    } // gi pecati detalite za sekoja usluga vo paketot

    public double packagePrice() {
        double total = 0.0;
        for (TelecommunicationService service : services) {
            total += service.getServicePrice();
        }
        return total;
    } // presmetuva i vrakja vkupnata cena na paketot na uslugi, vrz osnova na cenite na poednicnite uslugi

    @Override
    public String toString() {
        return "ServicePackage{" +
                "name='" + name + '\'' +
                ", services=" + services +
                '}';
    } // Override metoda za da obezbedi string citliv prikaz na objektot ServicePackage
}
// Odgovornosti:
//Pretstavuva paket na telekomunikaciski uslugi.
//Dozvoluva dodavanje uslugi vo paketot.
//Ovozmozhuva dlabok kloniranje  za sozdavanje kopii na paketot uslugi.
//Menaciranje i konfiguriranje na paketi za telekomunikaciski uslugi.
