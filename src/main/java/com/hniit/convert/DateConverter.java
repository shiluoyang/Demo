package com.hniit.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 自定义日期转换器
 */
public class DateConverter implements Converter<String, Date> {
    // 定义日期格式
    private String datePattern = "yyyy-MM-dd";

    @Override
    public Date convert(String source) {
        // 格式化日期
        return null;
    }
}

