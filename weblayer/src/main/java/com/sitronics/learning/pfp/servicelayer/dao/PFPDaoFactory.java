package com.sitronics.learning.pfp.servicelayer.dao;

import com.sitronics.learning.pfp.servicelayer.PfpEntityEnum;

/**
 * Date: 11.02.13
 * Фабрика для получения DAO-инстансов по конкретному виду сущности
 */
public class PfpDaoFactory {

    public PfpDaoIntf getDao(PfpEntityEnum entity) {
        PfpDaoIntf dao = null;
        switch (entity) {
            case ACCOUNTS:
                dao = new PfpDaoIntf() {
                };
        }
        return dao;
    }

}
