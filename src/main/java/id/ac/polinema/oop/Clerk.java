package id.ac.polinema.oop;

public class Clerk {
    private double calculateChange;
    private Rental rental;
    private double cash;

    

    public Clerk() {  
        this.cash = 0;
    }

     public double getCalculateChange() {
        return this.calculateChange;
    }
    public Rental getRental() {
        return this.rental;
    }

    public double getCash() {
        return this.cash;
    }
    
    public double calculateChange(Rental rental, double cash) {
        this.rental = rental;
        this.cash = cash;
        double change = cash - rental.getFinalTotal();
        return change;
    }
 
}
