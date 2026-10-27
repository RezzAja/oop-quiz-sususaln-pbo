package id.ac.polinema.oop;

public class Rental {
    private Renter renter;
    private RentalLine[] rentalLines;
    private int LineCount;

    public Rental() {
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
    
   
    
   
}
