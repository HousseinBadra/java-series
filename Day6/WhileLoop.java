package Day6;
public class WhileLoop {
    public static void main(String args[]) {
        // game loop
        while (true) {
            update();
            render();
            if(gameOver()) break;
        }
    }

    static void update() {
        // game logic
        return;
    }

    static void render() {
        // rendering logic
        return;
    }

    static boolean gameOver() {
        // check game state
        return true;
    }
}