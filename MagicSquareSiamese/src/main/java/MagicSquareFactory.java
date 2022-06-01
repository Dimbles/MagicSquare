
import java.util.ArrayList;

public class MagicSquareFactory {


    public MagicSquareFactory() {

    }


    private ArrayList<Integer> createProgression( int size, int start, int jump) {

        //creating arithmetic progression for use with the square
        ArrayList<Integer> progression = new ArrayList<>();
        int numValues = size * size;
        for (int i = 0; i < numValues; i++) {
            int value = start + (jump * i);
            progression.add(value);
        }
        return progression;
    }

    public MagicSquare createMagicSquare(int sizeSquare, int progressionStart, int progressionJump) {
        

        if (sizeSquare % 2 == 0) {
            sizeSquare = sizeSquare + 1;
        } 

        MagicSquare square = new MagicSquare(sizeSquare);

        //creating progression
        ArrayList<Integer> progression = createProgression( sizeSquare, progressionStart, progressionJump);
        System.out.println("progression: " + progression);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x = (sizeSquare / 2);
        int y = 0;

        for (int i = 0; i < sizeSquare * sizeSquare; i++) {

            //saving previous values of x and y
            int xTemp = x - 1;
            int yTemp = y + 1;

            if (x >= sizeSquare || x < 0) {
                x = 0;
            }
            if (y >= sizeSquare || y < 0) {
                y = sizeSquare - 1;
            }
            if (square.readValue(x, y) != 0) {
                x = xTemp;
                y = yTemp + 1;
            }

            square.placeValue(x, y, progression.get(i));

            //System.out.println("x: " + x);
            //System.out.println("y: " + y);
            x += 1;
            y -= 1;

        }

        return square;

    }
    


}
