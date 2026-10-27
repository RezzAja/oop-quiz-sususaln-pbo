package id.ac.polinema.oop;

/**
 * Manual playground — NOT graded.
 *
 * After you complete the skeleton classes and create RentalLine, Rental,
 * and Clerk, write your demo scenario here (see "Try the App Manually"
 * in the README) and run:
 *
 *   mvn -q compile exec:java
 */
public class Main {
    public static void main(String[] args) {
    Inventory inventory = new Inventory();
    inventory.addEquipment(new Equipment("Tripod", 18000));
    inventory.addEquipment(new Equipment("Lampu Studio", 12000));

    Renter sari = new Renter("R001", "Sari Wulandari");
    Rental rental = new Rental(sari);
    rental.addLine(inventory.findEquipment("Tripod"), 2);
    rental.addLine(inventory.findEquipment("Lampu Studio"), 1);

    Clerk clerk = new Clerk();
    double cash = 50000;

    System.out.println("Renter  : " + rental.getRenter().getName());
    System.out.println("Total   : " + rental.getTotal());
    System.out.println("Payable : " + rental.getFinalTotal());
    System.out.println("Cash    : " + cash);
    System.out.println("Change  : " + clerk.calculateChange(rental, cash));
}

   
}
