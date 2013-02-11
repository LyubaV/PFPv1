package com.sitronics.learning.pfp.servicelayer;

import com.sitronics.learning.pfp.servicelayer.dao.PfpDaoIntf;
import com.sitronics.learning.pfp.servicelayer.dao.PfpEntityIntf;

/**
 * Date: 11.02.13
 * Общий интерфейс для Data Transfer Object
 */
public interface PfpDtoIntf {
    public PfpEntityEnum getEntity();
    public PfpEntityIntf getEntityBean();
    public PfpDaoIntf getDao();
}
