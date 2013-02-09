package com.sitronics.learning.pfp.servicelayer;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Date: 06.02.13
 */
@Service(value = "accountsBean")
public class AccountsBean {
    private List<TestAccount> accounts = new ArrayList<TestAccount>();

    public AccountsBean() throws ParseException {
        accounts.add(new TestAccount(1, "01.01.2013", new BigDecimal("200.2")));
        accounts.add(new TestAccount(2, "01.02.2013", new BigDecimal("300.3")));
        accounts.add(new TestAccount(3, "01.03.2013", new BigDecimal("400.4")));
        accounts.add(new TestAccount(4, "01.04.2013", new BigDecimal("500.5")));
    }

    public List<TestAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<TestAccount> accounts) {
        this.accounts = accounts;
    }
}
