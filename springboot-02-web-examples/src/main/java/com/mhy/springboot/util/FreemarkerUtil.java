package com.mhy.springboot.util;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Freemarker工具类
 * @author mahaiyuan
 * @ClassName: FreemarkerUtil
 * @date 2018-08-09 下午12:34
 */
@Slf4j
public class FreemarkerUtil {

    private volatile static Configuration conf = null;

    public static Configuration getConfiguration() {
        if (null == conf) {
            synchronized (FreemarkerUtil.class) {
                conf = new Configuration(Configuration.VERSION_2_3_28);
                conf.setClassForTemplateLoading(FreemarkerUtil.class, "/templates");
                conf.setDefaultEncoding("UTF-8");
                conf.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            }
        }
        return conf;
    }
}
