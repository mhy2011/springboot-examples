package com.mhy.springboot;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mahaiyuan
 * @ClassName: MyBatisGeneratorTest
 * @date 2018-09-07 下午8:30
 */
public class MyBatisGeneratorTest {

    @Test
    public void testGenerate() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ClassLoader loader = MyBatisGeneratorTest.class.getClassLoader();
        InputStream in = loader.getResourceAsStream("mybatis-generator-config.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(in);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
