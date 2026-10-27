package id.ac.polinema.oop;

public class RentalLine {
    private Equipment equipment;
    private int days;

    public RentalLine(Equipment equipment, int days) {
        this.equipment = equipment;
        this.days = days;
    }

    public Equipment getEquipment() {
        return this.equipment;
    }

    public int getDays() {
        return this.days;
    }

     public double getTotal() {
        double total = 0;
        for (int i = 0; i < this.days; i++) {
            total += this.equipment.getDailyRate();
        }
        return total;
    }

     public double getSubtotal(RentalLine line) {
        return line.getEquipment().getDailyRate() * line.getDays();
    }
}
