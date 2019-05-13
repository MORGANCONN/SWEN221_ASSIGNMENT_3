import org.junit.jupiter.api.Test;
import swen221.chessview.moves.Castling;

import static org.junit.jupiter.api.Assertions.*;
import static swen221.tests.ChessViewTests.checkValid;

class CastlingTests {
    @Test
    public void checkBlackQueenSideCastling(){
            String input =
                    "a2-a4 a7-a5\n" +
                            "b2-b4 b7-b5\n" +
                            "c2-c4 c7-c5\n" +
                            "d2-d4 d7-d5\n" +
                            "e2-e4 e7-e5\n" +
                            "f2-f4 f7-f5\n" +
                            "g2-g4 g7-g5\n" +
                            "h2-h4 h7-h5\n" +
                            "Ra1-a2 Nb8-a6\n" +
                            "Bc1-d2 Bc8-d7\n" +
                            "Ra2-a3 Qd8-c7\n" +
                            "Rh1-h2 O-O-O\n" +
                            "";
            String output =
                            "8|_|_|k|r|_|b|n|r|\n" +
                            "7|_|_|q|b|_|_|_|_|\n" +
                            "6|n|_|_|_|_|_|_|_|\n" +
                            "5|p|p|p|p|p|p|p|p|\n" +
                            "4|P|P|P|P|P|P|P|P|\n" +
                            "3|R|_|_|_|_|_|_|_|\n" +
                            "2|_|_|_|B|_|_|_|R|\n" +
                            "1|_|N|_|Q|K|B|N|_|\n" +
                            "  a b c d e f g h";
            checkValid(input,output);
    }

    @Test
    public void checkBlackKingSideCastling(){
        String input =
        "a2-a4 a7-a5\n" +
                "b2-b4 b7-b5\n" +
                "c2-c4 c7-c5\n" +
                "d2-d4 d7-d5\n" +
                "e2-e4 e7-e5\n" +
                "f2-f4 f7-f5\n" +
                "g2-g4 g7-g5\n" +
                "h2-h4 h7-h5\n" +
                "Ra1-a2 Ng8-h6\n" +
                "Bc1-d2 Bf8-e7\n" +
                "Ra2-a3 O-O\n" +
                "";
        String output =
                        "8|r|n|b|q|_|r|k|_|\n" +
                        "7|_|_|_|_|b|_|_|_|\n" +
                        "6|_|_|_|_|_|_|_|n|\n" +
                        "5|p|p|p|p|p|p|p|p|\n" +
                        "4|P|P|P|P|P|P|P|P|\n" +
                        "3|R|_|_|_|_|_|_|_|\n" +
                        "2|_|_|_|B|_|_|_|_|\n" +
                        "1|_|N|_|Q|K|B|N|R|\n" +
                        "  a b c d e f g h";
        checkValid(input,output);
    }

    @Test
    public void checkWhiteQueenSideCastling() {
        String input =
                "a2-a4 a7-a5\n" +
                        "b2-b4 b7-b5\n" +
                        "c2-c4 c7-c5\n" +
                        "d2-d4 d7-d5\n" +
                        "e2-e4 e7-e5\n" +
                        "f2-f4 f7-f5\n" +
                        "g2-g4 g7-g5\n" +
                        "h2-h4 h7-h5\n" +
                        "Nb1-c3 Nb8-c6\n" +
                        "Bc1-a3 Bc8-a6\n" +
                        "Qd1-d3 Qd8-d6\n" +
                        "O-O-O\n"+
                        "";
        String output =
                "8|r|_|_|_|k|b|n|r|\n" +
                        "7|_|_|_|_|_|_|_|_|\n" +
                        "6|b|_|n|q|_|_|_|_|\n" +
                        "5|p|p|p|p|p|p|p|p|\n" +
                        "4|P|P|P|P|P|P|P|P|\n" +
                        "3|B|_|N|Q|_|_|_|_|\n" +
                        "2|_|_|_|_|_|_|_|_|\n" +
                        "1|_|_|K|R|_|B|N|R|\n" +
                        "  a b c d e f g h";

        checkValid(input, output);
    }

    @Test
    public void kingWhiteSideCastling(){
        String input =
                "a2-a4 a7-a5\n" +
                        "b2-b4 b7-b5\n" +
                        "c2-c4 c7-c5\n" +
                        "d2-d4 d7-d5\n" +
                        "e2-e4 e7-e5\n" +
                        "f2-f4 f7-f5\n" +
                        "g2-g4 g7-g5\n" +
                        "h2-h4 h7-h5\n" +
                        "Ng1-h3 Ng8-h6\n" +
                        "Bf1-g2 Bf8-g7\n" +
                        "O-O\n"+
                        "";
        String output =
                "8|r|n|b|q|k|_|_|r|\n" +
                        "7|_|_|_|_|_|_|b|_|\n" +
                        "6|_|_|_|_|_|_|_|n|\n" +
                        "5|p|p|p|p|p|p|p|p|\n" +
                        "4|P|P|P|P|P|P|P|P|\n" +
                        "3|_|_|_|_|_|_|_|N|\n" +
                        "2|_|_|_|_|_|_|B|_|\n" +
                        "1|R|N|B|Q|_|R|K|_|\n" +
                        "  a b c d e f g h";

        checkValid(input, output);
    }

    @Test
    public void queenSideExpectedStringTest(){
        Castling castling = new Castling(true,true);
        assertEquals("O-O",castling.toString());
    }
    @Test
    public void kingSideExpectedStringTest(){
        Castling castling = new Castling(true,false);
        assertEquals("O-O-O",castling.toString());
    }

}