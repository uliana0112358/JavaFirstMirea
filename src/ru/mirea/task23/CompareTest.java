package ru.mirea.task23;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    @Test
    void testHashCode() {
        Compare compare1 = new Compare(500, "red");
        int expected = compare1.hashCode();
        int actual = 10000;
        Assert.assertEquals(expected, actual);
    }
}