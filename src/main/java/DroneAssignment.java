// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class DroneAssignment {
    public static void main(String[] args) {
        // Initial drone values
        double altitude = 150.7;
        double battery = 87.3;
        int photos = 0;
        
        System.out.println("=== Drone Flight Simulation ===");
        System.out.println("Initial Status:");
        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Battery: " + battery + "%");
        System.out.println("Photos: " + photos);
        System.out.println();
        
        // TODO: Part 1 - Casting
        int displayaltitude = (int) altitude;
        int batteryrounded = (int) battery;
        System.out.println("Display Altitude: " + displayaltitude);
        System.out.println("Battery Rounded: " + batteryrounded);

        // TODO: Part 2 - Compound Assignment Operators
        displayaltitude += 20;
        System.out.println("After climbing 20m: " + displayaltitude);
        batteryrounded -= 15;
        System.out.println("After Battery Drain: " + batteryrounded);
        photos += 3;
        System.out.println("After taking 3 photos: " + photos);
        displayaltitude /= 2;
        System.out.println("After descending to half: " + displayaltitude);
        System.out.println("Photos: " + photos);
        photos %= 4;
        System.out.println("Storage slots used: " + photos + " out of " + 4);
    }
}
