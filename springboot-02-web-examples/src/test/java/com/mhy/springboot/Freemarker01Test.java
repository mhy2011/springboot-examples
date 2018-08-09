package com.mhy.springboot;

import com.mhy.springboot.util.FreemarkerUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.junit.Test;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mahaiyuan
 * @ClassName: Freemarker01Test
 * @date 2018-08-08 下午8:34
 */
public class Freemarker01Test {

    @Test
    public void test01() throws Exception {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
        cfg.setClassForTemplateLoading(Freemarker01Test.class, "/");
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        Map<String, Object> root = new HashMap<String, Object>();
        root.put("name", "green mouse");

        Template temp = cfg.getTemplate("01.ftl");
        Writer out = new OutputStreamWriter(System.out);
        temp.process(root, out);

    }

    @Test
    public void testIf() throws Exception {
        Configuration conf = FreemarkerUtil.getConfiguration();
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("score", 80);
        Template template = conf.getTemplate("if_01.ftl");
        template.process(root, new OutputStreamWriter(System.out));
    }

    @Test
    public void testList() throws Exception {
        Configuration configuration = FreemarkerUtil.getConfiguration();
        Map<String, Object> root = new HashMap<String, Object>();
        List<String> citys = Arrays.asList("北京", "上海", "广州");
        root.put("citys", citys);
        Template template = configuration.getTemplate("list_01.ftl");
        template.process(root, new OutputStreamWriter(System.out));
    }

    @Test
    public void testInclude() throws Exception {
        Configuration configuration = FreemarkerUtil.getConfiguration();
        Map<String, Object> root = new HashMap<String, Object>();
        Template template = configuration.getTemplate("include_01.ftl");
        template.process(root, new OutputStreamWriter(System.out));
    }
}
