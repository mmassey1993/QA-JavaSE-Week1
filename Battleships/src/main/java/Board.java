import java.util.List;

public class Board {

    private int boardSize;
    private String[][] board;
    private Ship ship;
    private Player player;
    private List<Ship> shipList;



    public Board(int boardSize, Player player){ //Has to contain player object to know what player is
        this.player = player;
        this.boardSize = boardSize;
        board = new String[boardSize][boardSize];
        fillBoard();

    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public void fillBoard(){

        for (int i = 0; i< getBoard().length; i++){
            for (int j = 0; j< getBoard()[i].length; j++){
                board[i][j] = "O";
            }
            System.out.println();
        }
    }
    public void printBoard(){

        for (int i = 0; i< getBoard().length; i++){
            for (int j = 0; j< getBoard()[i].length; j++){
                System.out.print(getBoard()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String[][] addShipToBoard(List<Ship> sh) {

        shipList = player.getShipList();

        for (Ship ships : shipList) {
            if ((ships.getxPos() <= board.length - 1 && ships.getxPos() >= 0) && (ships.getyPos() <= board.length - 1 && ships.getyPos() >= 0)) {
                board[ships.getxPos()][ships.getyPos()] = "S";

                switch (ships.getDirection()) {

                    case NORTH:
                        if (ships.getxPos() - 1 >= 0) {
                            ships.setxPos(ships.getxPos() - 1);
                            board[ships.getxPos()][ships.getyPos()] = "S";
                        } else {
                            board[ships.getxPos()][ships.getyPos()] = "O";
                            System.out.println("You cannot face your ship in this direction. Create new ship object.");
                        }
                        break;

                    case SOUTH:
                        if (ships.getxPos() + 1 <= board.length - 1) {
                            ships.setxPos(ships.getxPos() + 1);
                            board[ships.getxPos()][ships.getyPos()] = "S";
                        } else {
                            board[ships.getxPos()][ships.getyPos()] = "O";
                            System.out.println("You cannot face your ship in this direction. Create new ship object.");
                        }
                        break;

                    case EAST:
                        if (ships.getyPos() + 1 <= board.length - 1) {
                            ships.setyPos(ships.getyPos() + 1);
                            board[ships.getxPos()][ships.getyPos()] = "S";
                        } else {
                            board[ships.getxPos()][ships.getyPos()] = "O";
                            System.out.println("You cannot face your ship in this direction. Create new ship object.");
                        }
                        break;

                    case WEST:
                        if (ships.getyPos() - 1 >= 0) {
                            ships.setyPos(ships.getyPos() - 1);
                            board[ships.getxPos()][ships.getyPos()] = "S";
                        } else {
                            board[ships.getxPos()][ships.getyPos()] = "O";
                            System.out.println("You cannot face your ship in this direction. Create new ship object.");
                        }
                        break;
                }

            } else {
                System.out.println("Ship cannot be added to board");
            }

        }return board;
    }



}
