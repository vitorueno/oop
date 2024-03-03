package Move;

import Move.MoveBehavior;

public class Motor implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Movendo com motor!");
    }
}
