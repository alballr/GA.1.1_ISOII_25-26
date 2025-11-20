package Domain;

public class PhysicalMaterial {

    private int id;
    private String type;
    private boolean reserved;
    private int numCopies;

    public PhysicalMaterial(int id, String type, boolean reserved, int numCopies) {
        this.id = id;
        this.type = type;
        this.reserved = reserved;
        this.numCopies = numCopies;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public boolean isReserved() {
        return reserved;
    }

    public int getNumCopies() {
        return numCopies;
    }
}
