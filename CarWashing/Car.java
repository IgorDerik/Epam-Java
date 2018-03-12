package CarWashing;

public class Car {

    private int id;

    private boolean isWashed = false;
    private boolean isFoamed = false;
    private boolean isRinsed = false;

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isWashed() {
        return isWashed;
    }

    public void setWashed() {
        if(isFoamed&&isRinsed) {
            isWashed = true;
        }
    }

    public void setFoamed() {
        isFoamed = true;
    }

    public void setRinsed() {
        isRinsed = true;
    }
}
