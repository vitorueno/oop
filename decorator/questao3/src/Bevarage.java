
public abstract class Bevarage {
    private String description = "unknown";
    private Size size = Size.M;
    private int numberOfShots = 1;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public int getNumberOfShots() {
        return numberOfShots;
    }

    public void setNumberOfShots(int numberOfShots) {
        this.numberOfShots = numberOfShots;
    }

    public abstract double cost();

    public enum Size {
        P, M, G;
    }
}