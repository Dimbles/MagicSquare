

public class Program {

    public static void main(String[] args) {

        MagicSquareFactory msFactory = new MagicSquareFactory();

        MagicSquare createdSquare = msFactory.createMagicSquare(5, 1, 1);

        System.out.println("=== new square ===");
        System.out.println(createdSquare);

        System.out.println("sum of rows: " + createdSquare.sumsOfRows());
        System.out.println("sum of columns: " + createdSquare.sumsOfColumns());
        System.out.println("sum of diagonals: " + createdSquare.sumsOfDiagonals());

        System.out.println("=== complex square ===");

        MagicSquareFactory msFactory2 = new MagicSquareFactory();

        MagicSquare createdSquare2 = msFactory2.createMagicSquare(9, 1, 20);

        System.out.println(createdSquare2);

        System.out.println("sum of rows: " + createdSquare2.sumsOfRows());
        System.out.println("sum of columns: " + createdSquare2.sumsOfColumns());
        System.out.println("sum of diagonals: " + createdSquare2.sumsOfDiagonals());

    }
}
