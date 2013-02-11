package com.sitronics.learning.pfp.servicelayer;

import com.sitronics.learning.pfp.servicelayer.dao.PfpDaoIntf;
import com.sitronics.learning.pfp.servicelayer.dao.PfpEntityBeanIntf;

/**
 * Date: 12.02.13
 */
public class PfpDto implements PfpDtoIntf {
    private PfpEntityEnum entity;
    private PfpEntityBeanIntf entityBean;
    private PfpDaoIntf dao;


    public PfpDto() {
        entity = null;
        entityBean = null;
        dao = null;
    }

    public PfpDto(PfpEntityEnum entity, PfpEntityBeanIntf entityBean, PfpDaoIntf dao) {
        this.entity = entity;
        this.entityBean = entityBean;
        this.dao = dao;
    }

    public void setEntity(PfpEntityEnum entity) {
        this.entity = entity;
    }

    public void setEntityBean(PfpEntityBeanIntf entityBean) {
        this.entityBean = entityBean;
    }

    public void setDao(PfpDaoIntf dao) {
        this.dao = dao;
    }

    @Override
    public PfpEntityEnum getEntity() {
        return entity;
    }

    @Override
    public PfpEntityBeanIntf getEntityBean() {
        return entityBean;
    }

    @Override
    public PfpDaoIntf getDao() {
        return dao;
    }
}
