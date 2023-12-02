package Model;

import java.util.HashMap;
import java.util.Map;


public class PackageFactory {
    private static final Map<String, ServicePackage> prototypes = new HashMap<>(); // static map sodrzhi primeroci od prototipovi na ServicePackage.
    // Methods
    public static void addPrototype(ServicePackage servicePackage) {
        prototypes.put(servicePackage.getName(), servicePackage);
    } // Dodava nov prototype na mapata na prorotipi.Imeto na paketot se koristi kako kluc.

    public static ServicePackage findAndClone(String packageName) {
        ServicePackage prototype = prototypes.get(packageName);
        if (prototype != null) {
            return prototype.clonePackage();
        }
        return null;
    } // Naogja prototype po ime vo mapata na prototipi i go kolnira koristejki go metodot clonePackage().
}
// Odgovornosti:
//Upravuva so zbirka prototipovi na ServicePackage.
//Ovozmozhuva dodavanje na novi prototype vo kolekcijata.
//Obezbedi metod za da pronajde prototype po ime i da sozdade negov kluc.
// Kreiran pisposoblivi paketi za telekominikaciski uslugi vo let so koristenje na postoecki prototype.Prototype pattern e implementirana tuka.
