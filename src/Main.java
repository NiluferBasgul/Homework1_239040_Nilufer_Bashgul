import factory.PackageFactory;
import model.ServicePackage;
import service.*;

public class Main {
        public static void main(String[] args) throws CloneNotSupportedException {

        // kreiranje na prototype na prviot usluzhen paket
        ServicePackage prototype = ServicePackage.createPackage("post-paid"); // podgotovka na prototype so kombinacija na servisi
        prototype.addService(new VoiceService("voice", 3.9, 0.0, 1, 0.0,  1, 0.0));
        prototype.addService(new SmsService("sms", 300.0, 0.0, 5, 10.24,  2,2.5));
        prototype.addService(new DataService("data", 300.0, 0.0, 5, 10.24,  4, 1024));
        PackageFactory.addPrototype(prototype);  // dodavanje paketi vo PackageFactory

        // kreiranje na prototype2 na vtoriot usluzhen paket
        ServicePackage prototype2 = ServicePackage.createPackage("post-paid"); ; // podgotovka na prototype2 so kombinacija na servisi
        prototype2.addService(new VoiceService("voice1", 2.9, 0.0, 2, 20.0, 1, 0.0));
        prototype2.addService(new SmsService("sms1", 200.0, 0.0, 2, 12.24, 2,3.5));
        prototype2.addService(new DataService("data1", 200.0, 0.0, 2, 12.24, 4, 1034));
        PackageFactory.addPrototype(prototype2); // dodavanje paketi vo PackageFactory

        // prikazhuva detalite i za orginalnite paketi i za kloniran paketi
        ServicePackage clonedPackage = PackageFactory.findAndClone("post-paid");
        if (clonedPackage != null) {
            System.out.println("Original Package:");
            prototype.listServices();
            System.out.println("Total Price: " + prototype.packagePrice());

            System.out.println("\nCloned Package:");
            clonedPackage.listServices();
            System.out.println("Total Price: " + clonedPackage.packagePrice());
        }
    }
}
// Odgovornosti:
//Pokazhuva ja upotrebata na klasi i modeli na paketi za telekomunikaciski uslugi.
//Kreriran prototipovi na uslugi, dodaden vo PackageFactory i kloniran paketite za sporedba.
//Prikazhuva detali za orginalnite i kloniranite paketi.
//Interakcija pomegju paketite na uslugi, nivnite prototipovi i mehanizmot za kloniranje od PackageFactory.