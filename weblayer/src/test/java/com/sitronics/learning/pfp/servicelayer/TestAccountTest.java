package com.sitronics.learning.pfp.servicelayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Date: 10.02.13
 */
public class TestAccountTest {
    TestAccount testAccount;

    @BeforeMethod
    public void setUp() throws Exception {
        testAccount  = new TestAccount();
    }

    @Test
    public void testGetId() throws Exception {
        testAccount.setId(123);
        Assert.assertEquals(testAccount.getId(),123);
    }

    @Test
    public void testGetDate() throws Exception {
        testAccount.setDate(java.sql.Date.valueOf("2012-10-24"));
        Assert.assertEquals(testAccount.getDate(), java.sql.Date.valueOf("2012-10-24"));
    }

    @Test
    public void testGetAmount() throws Exception {
        testAccount.setAmount(new BigDecimal("100.15"));
        Assert.assertEquals(testAccount.getAmount(), new BigDecimal("100.15"));
    }

    @Test
    public void testToString() throws Exception {
        testAccount.setId(123);
        testAccount.setDate(java.sql.Date.valueOf("2012-10-24"));
        testAccount.setAmount(new BigDecimal("100.15"));
        Assert.assertEquals(testAccount.toString(), "TestAccount{id=1, date=2013-01-01, amount=200.2}");
    }
}
