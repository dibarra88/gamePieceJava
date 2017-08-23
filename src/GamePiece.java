import java.util.Random;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;
    int minX;
    int maxX;
    int minY;
    int maxY;

    GamePiece(){
        positionX = 0;
        positionY = 0;
        frozen = false;
        minX = 0;
        maxX = 100;
        minY = 0;
        maxY = 500;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
    public int getMinX(){
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public boolean getFrozen(){
        return frozen;
    }

    public String getColor() {
        return color;
    }
    public String getName(){
        return  name;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void move(int posX, int posY){
        if(!this.frozen) {
            if((posX >= minX && posX <= maxX) && (posY >= minY && posY <= maxY)) {
                this.positionX = posX;
                this.positionY = posY;
            }
        }
    }
    public void moveRandom(){
        if(!this.frozen){
            Random randomX = new Random();
            Random randomY = new Random();
            this.positionX = randomX.nextInt(maxX);
            this.positionY = randomX.nextInt(maxY);
        }
    }
    public void freeze(){
        this.frozen = true;
    }
    public void unfreeze(){
        this.frozen = false;
    }
}
