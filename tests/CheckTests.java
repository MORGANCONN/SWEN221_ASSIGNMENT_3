import org.junit.jupiter.api.Test;
import swen221.chessview.Position;
import swen221.chessview.moves.Check;
import swen221.chessview.moves.SinglePieceMove;
import swen221.chessview.pieces.Pawn;
import swen221.chessview.pieces.Piece;

import static org.junit.jupiter.api.Assertions.*;
import static swen221.tests.ChessViewTests.checkValid;

class CheckTests {

    @Test
    public void pawnCheckMate(){
        String input =
                        "e2-e4 e7-e5\n" +
                        "Ke1-e2 f7-f6\n" +
                        "Ke2-d3 h7-h6\n" +
                        "Kd3-c4 h6-h5\n"+
                        "f2-f3 d7-d5+\n"+
                        "";
        String output =
                        "8|r|n|b|q|k|b|n|r|\n" +
                        "7|p|p|p|_|_|_|p|_|\n" +
                        "6|_|_|_|_|_|p|_|_|\n" +
                        "5|_|_|_|p|p|_|_|p|\n" +
                        "4|_|_|K|_|P|_|_|_|\n" +
                        "3|_|_|_|_|_|P|_|_|\n" +
                        "2|P|P|P|P|_|_|P|P|\n" +
                        "1|R|N|B|Q|_|B|N|R|\n" +
                        "  a b c d e f g h";

        checkValid(input,output);
    }

    @Test
    public void pawnFailedCheckMate(){
        String input =
                "e2-e4 e7-e5\n" +
                        "Ke1-e2 f7-f6\n" +
                        "Ke2-d3 h7-h6\n" +
                        "a2-a3 h6-h5\n"+
                        "f2-f3 d7-d3+\n"+
                        "";
        String output =
                "8|r|n|b|q|k|b|n|r|\n" +
                        "7|p|p|p|p|_|_|p|_|\n" +
                        "6|_|_|_|_|_|p|_|_|\n" +
                        "5|_|_|_|_|p|_|_|p|\n" +
                        "4|_|_|_|_|P|_|_|_|\n" +
                        "3|P|_|_|K|_|P|_|_|\n" +
                        "2|_|P|P|P|_|_|P|P|\n" +
                        "1|R|N|B|Q|_|B|N|R|\n" +
                        "  a b c d e f g h";

        checkValid(input,output);
    }

    @Test
    public void toStringCheckTest(){
        Piece pawn = new Pawn(true);
        Position startPos = new Position(4,4);
        Position endPos = new Position(5,5);
        SinglePieceMove move = new SinglePieceMove(pawn,startPos,endPos);
        Check check = new Check(move);
        assertEquals("d4-e5+",check.toString());
    }

    @Test
    public void correctMoveUsedTest(){
        Piece pawn = new Pawn(true);
        Position startPos = new Position(4,4);
        Position endPos = new Position(5,5);
        SinglePieceMove move = new SinglePieceMove(pawn,startPos,endPos);
        Check check = new Check(move);
        assertEquals(move,check.move());
    }

}