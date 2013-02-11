package com.sitronics.learning.pfp.servicelayer.dao;

import com.sitronics.learning.pfp.servicelayer.PfpEntityEnum;

/**
 * Date: 12.02.13
 */
public class PfpAccountsEntityBean implements PfpEntityBeanIntf {
    @Override
    public PfpEntityEnum getEntity() {
        return PfpEntityEnum.ACCOUNTS;
    }
}
