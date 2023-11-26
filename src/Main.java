import Model.*;

public class Main {
        public static void main(String[] args) throws CloneNotSupportedException {
        ServicePackage prototype = ServicePackage.createPackage("post-paid");
        prototype.addService(new VoiceService("voice", 3.9, 0.0, 1, 0.0, 0.0, 1, 0.0));
        prototype.addService(new SmsService("sms", 300.0, 0.0, 5, 10.24, 5.5, 2,2.5));
        prototype.addService(new DataService("data", 300.0, 0.0, 5, 10.24, 5.5, 4, 1024, 5.2,5,5));
        PackageFactory.addPrototype(prototype);

        // Clone a package and display details
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