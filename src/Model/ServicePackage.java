package Model;

import java.util.ArrayList;
import java.util.List;

public class ServicePackage {
    private final String name;
    private final List<TelecommunicationService> services;

    private ServicePackage(String name) {
        this.name = name;
        this.services = new ArrayList<>();
    }

    public static ServicePackage createPackage(String name) {
        return new ServicePackage(name);
    }

    public void addService(TelecommunicationService service) {
        services.add(service);
    }

    public String getName() {
        return name;
    }

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
    }

    public void listServices() {
        for (TelecommunicationService service : services) {
            System.out.println(service);
        }
    }

    public double packagePrice() {
        double total = 0.0;
        for (TelecommunicationService service : services) {
            total += service.getServicePrice();
            // Include other pricing logic if needed
        }
        return total;
    }

    @Override
    public String toString() {
        return "ServicePackage{" +
                "name='" + name + '\'' +
                ", services=" + services +
                '}';
    }

    // Additional methods and overrides as needed
}
