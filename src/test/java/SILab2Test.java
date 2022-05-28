import mk.ukim.finki.SILab2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {

    private final SILab2 sut = new SILab2();

    @Test
    void When_Passing_Empty_List_Exception_Is_Thrown(){
        assertThrows(RuntimeException.class, () -> sut.function(new ArrayList<>()));
    }

    @Test
    void When_Passing_List_That_Is_Not_Perfect_Square_Lenght_Exception_Is_Thrown(){
        ArrayList<String> notSquareList = new ArrayList<>(Arrays.asList("0", "#", "0"));

        assertThrows(RuntimeException.class, () -> sut.function(notSquareList));
    }

    @Test
    void When_Passing_Correct_List_Result_Is_List_With_Bomb_Count(){
        var expectedList = new ArrayList<>(Arrays.asList("2","#","3","#","#","4","#","2","2","#","2","1","1","#","2","#"));

        ArrayList<String> squareList = new ArrayList<>(Arrays.asList("0", "#", "0", "#", "#", "0", "#", "0", "0",  "#", "0", "0", "0","#","0","#"));

        var resultingList = sut.function(squareList);

        assertEquals(resultingList,expectedList);
    }
}