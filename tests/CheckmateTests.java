import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static swen221.tests.ChessViewTests.checkValid;

class CheckmateTests {

    @Test
    public void kingsideCastlingCheckmateTest(){
        String input =
                "a2-a4 f7-f5\n"+
                        "Ra1-a3 a7-a5\n" +
                        "Ra3-f3 Ra8-a7\n" +
                        "Rf3xf5 Ra7-a8\n" +
                        "Rf5xBf8 Ke8xRf8\n" +
                        "g2-g4 Ra8-a6\n" +
                        "Ng1-f3 Ra6-f6\n" +
                        "b2-b3 Rf6xNf3\n" +
                        "b3-b4 Rf3xf2\n" +
                        "b4-b5 Rf2-f5\n" +
                        "Bf1-h3 Rf5-c5\n" +
                        "O-O+\n" +
                        "";
        String output =
                        "8|_|n|b|q|_|k|n|r|\n" +
                        "7|_|p|p|p|p|_|p|p|\n" +
                        "6|_|_|_|_|_|_|_|_|\n" +
                        "5|p|P|r|_|_|_|_|_|\n" +
                        "4|P|_|_|_|_|_|P|_|\n" +
                        "3|_|_|_|_|_|_|_|B|\n" +
                        "2|_|_|P|P|P|_|_|P|\n" +
                        "1|_|N|B|Q|_|R|K|_|\n" +
                        "  a b c d e f g h";
        checkValid(input, output);
    }

}