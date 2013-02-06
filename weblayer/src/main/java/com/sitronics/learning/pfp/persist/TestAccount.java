package com.sitronics.learning.pfp.persist;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Date: 06.02.13
 */
public class TestAccount {
    private int id;
    private Date date;
    private BigDecimal amount;

    public TestAccount() throws ParseException {
        this.id = 0;
        this.date = new Date(new SimpleDateFormat("dd.MM.yyyy").parse("12.02.2013").getTime());
        this.amount = new BigDecimal("100.1");
    }

    public TestAccount(int id, String date, BigDecimal amount) throws ParseException {
        this.id = id;
        this.date = new Date(new SimpleDateFormat("dd.MM.yyyy").parse(date).getTime());
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TestAccount{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
