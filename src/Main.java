import java.util.Random;

public class Main {

    public static void main(String[] args) {

        GamePiece tester = new GamePiece();
        tester.positionX = 3;
        tester.positionY = 5;
        tester.frozen = false;
        System.out.println("PositionX: " + tester.positionX + " PositionY: " + tester.positionY);
        System.out.println("Piece is frozen: " + tester.frozen);

        tester.freeze();
        System.out.println("Piece is frozen: " + tester.frozen);

        tester.unfreeze();
        System.out.println("Piece is frozen: " + tester.frozen);

        tester.move(1,0);
        System.out.println("PositionX: " + tester.positionX + " PositionY: " + tester.positionY);

        tester.freeze();
        tester.move(5,6);
        System.out.println("PositionX: " + tester.positionX + " PositionY: " + tester.positionY);

        tester.unfreeze();
        tester.moveRandom();
        System.out.println("PositionX: " + tester.positionX + " PositionY: " + tester.positionY);


        tester.move(-3, 600);
        System.out.println("PositionX: " + tester.positionX + " PositionY: " + tester.positionY);
    }
}
