package technology;

public class SmartPhone extends Computer {
    private int numberOfSelfies;

    public SmartPhone(int storage, int ram, boolean hasKeyboard, int numberOfSelfies) {
        super(storage, ram, hasKeyboard);
        this.numberOfSelfies = numberOfSelfies;
    }
    public void takeSelfies(){
        this.numberOfSelfies=numberOfSelfies + 1;
    }
    public int getNumberOfSelfies(){
        return numberOfSelfies;
    }
}

