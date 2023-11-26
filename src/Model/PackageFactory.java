package Model;

import java.util.HashMap;
import java.util.Map;


public class PackageFactory {
    private static final Map<String, ServicePackage> prototypes = new HashMap<>();

    public static void addPrototype(ServicePackage servicePackage) {
        prototypes.put(servicePackage.getName(), servicePackage);
    }

    public static ServicePackage findAndClone(String packageName) {
        ServicePackage prototype = prototypes.get(packageName);
        if (prototype != null) {
            return prototype.clonePackage();
        }
        return null;
    }
}
