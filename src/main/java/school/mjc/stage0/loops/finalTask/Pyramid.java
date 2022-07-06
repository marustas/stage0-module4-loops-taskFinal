package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int spaces = i; spaces <= cathetusLength; spaces++) {
                System.out.print(" ");
            }
            for (int x = i; x >= 1; x--) {
                System.out.print(x);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(6);
    }
}
