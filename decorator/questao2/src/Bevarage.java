
public abstract class Bevarage {
    private String description;
    private Size size = Size.M;

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

    public abstract double cost();

    public enum Size {
        P, M, G;
    }
}