package id.ac.polinema.oop;

public class Rental {
    
    private String name;
    private Renter renter;
    private RentalLine[] rentalLines;
    private int LineCount;
    private double total;
    private double finalTotal;
   

    public String getName() {
        return this.name;
    }
    public double getTotal() {
        return this.total;
    }
    public double getFinalTotal() {
        return this.finalTotal;
    }

    public Rental(Renter renter) {
        this.renter = renter;
        this.rentalLines = new RentalLine[10];
        this.LineCount = 0;
    }

    

    public int getLineCount() {
        return this.LineCount;
    }

    public Renter getRenter() {
        return this.renter;
    }
    public void addRentalLine(RentalLine line) {
        if (this.LineCount < 10) {
            this.rentalLines[this.LineCount] = line;
            this.LineCount++;
        }
        
        
    }
    public void addLine(Equipment equipment, int days) {
            RentalLine line = new RentalLine(equipment, days);
            addRentalLine(line);
        }
    
   
    
   
}
