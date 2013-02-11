package com.sitronics.learning.pfp.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Date: 06.02.13
 */
@Service(value = "accountsBean")
public class AccountsBean {

    private List<TestAccount> accounts = new ArrayList<TestAccount>();
    private Date date;

    public AccountsBean() throws ParseException {
        accounts.add(new TestAccount(1, "01.01.2013", new BigDecimal("200.2")));
        accounts.add(new TestAccount(2, "01.02.2013", new BigDecimal("300.3")));
        accounts.add(new TestAccount(3, "01.03.2013", new BigDecimal("400.4")));
        accounts.add(new TestAccount(4, "01.04.2013", new BigDecimal("500.5")));
        Random r = new Random();
        date = new SimpleDateFormat("dd.MM.yyyy").parse((r.nextInt(28) + 1) + "." + (r.nextInt(11) + 1) + ".20" + r.nextInt(13));
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<TestAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<TestAccount> accounts) {
        this.accounts = accounts;
    }
}
