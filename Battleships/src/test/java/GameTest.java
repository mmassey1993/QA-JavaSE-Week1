import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    private int[][] board;
    private Ship ship;
    private Ship ship2;
    private Ship ship3;
    private ArrayList<Ship> shipList;



    @Before
    public void setup(){
        board = new int[3][3];
        ship = new Ship(2, 1, 1, Direction.EAST);
        ship2 = new Ship(2, 1,0, Direction.SOUTH);

        //shipList.add(ship);
    }

    @Test
    public void createBoard(){

        assertEquals(true, board.length > 0);
    }

    @Test
    public void addShipToBoard(){
        if (ship.getxPos() <= board.length -1 && ship.getxPos()+1 <= board.length-1 && ship.getyPos() <= board.length-1 && ship.getyPos()+1 <= board.length-1){
            board[ship.getxPos()][ship.getyPos()] = 'x';
            board[ship.getxPos()][ship.getyPos()+1] = 'x';
        }
        assertEquals(true, board[1][1] == 'x');
        assertEquals(true, board[1][2] == 'x');

    }

    @Test
    public void addShip2ToBoard(){
        if (ship2.getxPos() <= board.length -1 && ship2.getxPos()+1 <= board.length-1 && ship2.getyPos() <= board.length-1 && ship2.getyPos()+1 <= board.length-1){
            board[ship2.getxPos()][ship2.getyPos()] = 'x';
            board[ship2.getxPos()+1][ship2.getyPos()] = 'x';
        }
        assertEquals(true, board[ship2.getxPos()][ship2.getyPos()] == 'x');
        assertEquals(true, board[ship2.getxPos()+1][ship2.getyPos()] == 'x');
    }

    @Test
    public void add2ShipsToBoard(){
        if (ship.getxPos() <= board.length -1 && ship.getxPos()+1 <= board.length-1 && ship.getyPos() <= board.length-1 && ship.getyPos()+1 <= board.length-1){
            board[ship.getxPos()][ship.getyPos()] = 'x';
            board[ship.getxPos()][ship.getyPos()+1] = 'x';
        }
        if (ship2.getxPos() <= board.length -1 && ship2.getxPos()+1 <= board.length-1 && ship2.getyPos() <= board.length-1 && ship2.getyPos()+1 <= board.length-1){
            board[ship2.getxPos()][ship2.getyPos()] = 'x';
            board[ship2.getxPos()+1][ship2.getyPos()] = 'x';
        }

        assertEquals(true, board[1][1] == 'x');
        assertEquals(true, board[1][2] == 'x');
        assertEquals(true, board[ship2.getxPos()][ship2.getyPos()] == 'x');
        assertEquals(true, board[ship2.getxPos()+1][ship2.getyPos()] == 'x');
    }
}
