package assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;
import assignment.testing.framework.BaseAssignment;

import static org.junit.jupiter.api.Assertions.*;
import static assignment.testing.framework.Utilities.*;

import java.lang.reflect.AccessFlag;
import java.util.List;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Assignment Task #01")
    @Order(1)
    @Test()
    public void searchTest() {

        int[] arr = {76,87,89,95,1,56,34,22};
        int target = 33;

        Search ls = new Search(arr);
        int actualResult = ls.linearSearch(target);
        assertEquals(-1, actualResult);
        assertEquals(6, ls.linearSearch(34));
        assertEquals(0, ls.linearSearch(76));
        assertEquals(7, ls.linearSearch(22));


    }
    @DisplayName("Assignment Task #02")
    @Order(2)
    @Test()
    public void stepsTest() {

        int[] arr = {76,87,89,95,1,56,34,22};
        int target = 33;

        Search ls = new Search(arr);
        int actualResult = ls.stepsLinearSearch(target);
        assertEquals(8, actualResult);
        assertEquals(7, ls.stepsLinearSearch(34));
        assertEquals(1, ls.stepsLinearSearch(76));
        assertEquals(8, ls.stepsLinearSearch(22));

    }


}
