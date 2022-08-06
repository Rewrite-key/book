package com.atguigu.utils;

import com.atguigu.web.BaseServlet;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

public class WebUtils {

    /**
     * 把Map中的值注入到对应的JavaBean属性中。
     * @param value
     * @param bean
     * @param <T>
     * @return
     */
    public static <T> T copyParamToBeam(Map value,T bean){
        try {
            BeanUtils.populate(bean,value);
            System.out.println(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    public static int parseInt(String strInt,int defaultValue){
        try {
            return Integer.parseInt(strInt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultValue;
    }
}
