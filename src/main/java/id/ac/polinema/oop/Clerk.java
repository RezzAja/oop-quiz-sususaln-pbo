package id.ac.polinema.oop;

public class Clerk {
    private Rental rental;
    private double cash;

    

    public Clerk() {
        this.rental = new Rental();
        this.cash = 0;
    }
    public Rental getRental() {
        return this.rental;
    }

    public double getCash() {
        return this.cash;
    }
    
}
