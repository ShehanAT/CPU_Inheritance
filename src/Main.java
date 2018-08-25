public class Main {
    public static void main(String[] args) {
        Dimensions theDimensions = new Dimensions(5,5,5);
        Case theCase = new Case("fx110","Dell","v10",theDimensions);
        Resolution theResolution = new Resolution(10,10);
        Moniter theMoniter = new Moniter("dx100","Asus",10,theResolution);
        Motherboard theMotherBoard = new Motherboard("sd100","Intel",5,5,"s3");
        PC thePC = new PC(theCase,theMoniter, theMotherBoard);
        thePC.getTheMotherboard().loadProgram("MacOS X");
    }



}
