package com.tma.exercises;

import org.junit.Assert;
import org.junit.Test;

public class CalTest {
    @Test
    public void twoAndThreeIsFive() throws Exception {
        final int result = new Cal().add(2, 3);
        Assert.assertEquals("Ket qua la 5",result, 5);
    }
}
