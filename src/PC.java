public class PC {
    private Case theCase;
    private Moniter theMoniter;
    private Motherboard theMotherboard;

    public Case getTheCase() {
        return theCase;
    }

    public Moniter getTheMoniter() {
        return theMoniter;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    public PC(Case theCase, Moniter theMoniter, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMoniter = theMoniter;
        this.theMotherboard = theMotherboard;
    }
}
