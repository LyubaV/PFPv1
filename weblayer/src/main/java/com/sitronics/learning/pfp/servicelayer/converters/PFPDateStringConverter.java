package com.sitronics.learning.pfp.servicelayer.converters;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date: 11.02.13
 */
public class PfpDateStringConverter implements Converter<Date, String> {
    @Override
    public String convert(Date date) {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm").format(date);
    }
}
