package technology;

public class Computer {
    private int ram;
    private int storage;
    private boolean hasKeyboard;


    Computer(int storage,int ram,boolean hasKeyboard){
        this.storage=storage;
        this.ram=ram;
        this.hasKeyboard=hasKeyboard;

    }
    public  void increaseRam(int n){
        this.ram=ram + n;
    }
    public void increaseStorage(int x){
        this.ram=ram + x;
            }
}
