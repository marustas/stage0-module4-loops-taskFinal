package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int r = 2; r <= i; r++) {
                System.out.print(r);
            }
            for (int j = cathetusLength - 1; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(6);
    }
}
