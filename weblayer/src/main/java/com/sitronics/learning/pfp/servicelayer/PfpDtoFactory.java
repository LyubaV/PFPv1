package com.sitronics.learning.pfp.servicelayer;

/**
 * Date: 11.02.13
 * Фабрика для получения Data Transfer Object-инстансов для обработки web-запроса
 */
public class PfpDtoFactory {

    public PfpDtoIntf getDto() {

        return new PfpDtoIntf() {
        };
    }

}