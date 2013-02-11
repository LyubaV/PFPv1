package com.sitronics.learning.pfp.servicelayer.converters;

import org.springframework.format.Formatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * Date: 11.02.13
 */
public class PfpDateFormatter implements Formatter<Date> {
    private Logger logger = Logger.getLogger(getClass().toString());

    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public synchronized void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public PfpDateFormatter(String pattern) {
        this.pattern = pattern;
    }

    public String print(Date date, Locale locale) {
        logger.info("printing " + date.toString() + ", pattern " + pattern);
        if (date == null) {
            return "";
        }
        return getDateFormat(locale).format(date);
    }

    public Date parse(String formatted, Locale locale) throws ParseException {
        logger.info("parsing " + formatted);
        if (formatted.length() == 0) {
            return null;
        }
        return getDateFormat(locale).parse(formatted);
    }

    protected DateFormat getDateFormat(Locale locale) {
        DateFormat dateFormat = new SimpleDateFormat(this.pattern, locale);
        dateFormat.setLenient(false);
        return dateFormat;
    }
}
