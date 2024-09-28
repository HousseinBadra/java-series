package Day8;

public class MethodOverLoading {
    public static void main(String args[]) {

        // 2 functions are unique if they have the same name, return type and parameters

        // 2D
        double distance2D = distance(1, 1);
        // 3D
        double distance3D = distance(1, 1, 1);

    }

    static double distance(int x, int y) {
        // distance to origin in a 2D plane
        return Math.sqrt(x ^ 2 + y ^ 2);
    }

    static double distance(int x, int y, int z) {
        // distance to origin in a 3D plane
        return Math.sqrt(x ^ 2 + y ^ 2 + z ^ 2);
    }
}
