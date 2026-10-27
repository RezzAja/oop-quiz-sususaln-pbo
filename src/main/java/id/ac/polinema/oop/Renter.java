package id.ac.polinema.oop;

/**
 * A person who rents equipment from the lab.
 *
 * Complete every method body below (replace the
 * {@code throw new UnsupportedOperationException(...)} lines).
 * Do not change the class name, field names, method names, or signatures.
 *
 * Declare the fields yourself: see the class diagram in the README
 * (all fields must be private).
 */
public class Renter {
    private String renterId;
    private String name;

    /**
     * Creates a renter and stores both parameters into the fields.
     *
     * @param renterId renter identifier
     * @param name     renter's name
     */
    public Renter(String renterId, String name) {
        this.renterId = renterId;
        this.name = name;
       // throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getRenterId() {
        return renterId;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getName() {
        return name;
       // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Updates the name. A null or blank name is invalid:
     * ignore it and leave the field unchanged.
     *
     * @param name new name
     */
    public void setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name == null || name.isBlank()) {
                return;
            }
        }
        this.name = name;
       // throw new UnsupportedOperationException("Not implemented yet");
    }
}
