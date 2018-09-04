package com.itheima.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义的转换器类
 */
public class StringToDateConvert implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        try {
            // 判断是否为空
            if (StringUtils.isEmpty(source)){
                return null;
            }
            return new SimpleDateFormat("yyyy-MM-dd").parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
