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
    public void reverseTest() {


        int[] arr = {76,87,89,95,1,56,34,22};
        int[] revArr = {22,34,56,1,95,89,87,76};

        Traverse tv = new Traverse(arr);
        int[] actualResult = tv.inReverse();
        assertArrayEquals(revArr, actualResult);

    }

    @DisplayName("Assignment Task #02")
    @Order(2)
    @Test()
    public void insertTest() {

        int[] arr = {76,87,89,95,1,56,34,22};
        int value = 33;
        int[] startArr = {33,76,87,89,95,1,56,34,22};
        int[] endArr = {76,87,89,95,1,56,34,22,33};
        int index = 3;
        int[] indexArr = {76,87,89,33,95,1,56,34,22};

        Insert in = new Insert(arr);
        int[] actualResult = in.atStart(value);
        assertArrayEquals(startArr, actualResult);
        actualResult = in.atEnd(value);
        assertArrayEquals(endArr, actualResult);
        actualResult = in.atIndex(value, index);
        assertArrayEquals(indexArr, actualResult);
    }


    @DisplayName("Assignment Task #03")
    @Order(3)
    @Test()
    public void deleteTest() {

        int[] arr = {76,87,89,95,1,56,34,22};
        int[] startArr = {87,89,95,1,56,34,22};
        int[] endArr = {76,87,89,95,1,56,34};
        int index = 3;
        int[] indexArr = {76,87,89,1,56,34,22};

        Delete del = new Delete(arr);
        int[] actualResult = del.atStart();
        assertArrayEquals(startArr, actualResult);
        actualResult = del.atEnd();
        assertArrayEquals(endArr, actualResult);                       
        actualResult = del.atIndex(index);
        assertArrayEquals(indexArr, actualResult);
    }

}
