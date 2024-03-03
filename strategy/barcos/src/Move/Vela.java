package Move;

import Move.MoveBehavior;

public class Vela implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Movendo à vela!");
    }
}
