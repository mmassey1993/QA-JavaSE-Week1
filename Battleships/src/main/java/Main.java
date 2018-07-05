public class Main {

    public static void main(String[] args) {


        Player player = new Player();
        Player ai = new Player();
        Ship pboat1 = new Ship(2, 0, 0, Direction.SOUTH);
        Ship pboat2 = new Ship(2, 1,0, Direction.EAST);
        player.addShip(pboat1);
        player.addShip(pboat2);

        Board board = new Board(3, player); //Entering player to know what Player is
        Board boardAI = new Board(3, ai);


        board.addShipToBoard(player.getShipList());

        System.out.println("Player's board");
        board.printBoard();
        System.out.println();
        System.out.println("AI Board");
        boardAI.printBoard();






    }
}
