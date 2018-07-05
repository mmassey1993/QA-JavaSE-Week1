public class Ship {

    private int size;
    private int xPos;
    private int yPos;
    private Direction direction;


    public Ship(int size, int xPos, int yPos, Direction direction){
        this.setSize(size);
        this.setxPos(xPos);
        this.setyPos(yPos);
        this.setDirection(direction);
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
