package com.sg;

/**
 * @Author sg
 * @Date 2020/4/7 17:20
 */

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于运行生成对应的代码
 */
public class Generator {
    public static void main(String args[]) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        //MBG执行过程中的警告信息
        List<String> warnings = new ArrayList<String>();
        //当生成的代码重复时，覆盖原来的代码
        boolean overWrite = true;
        //读取MBG的配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overWrite);
        //创建MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration,callback,warnings);
        //执行生成相应的代码
        myBatisGenerator.generate(null);
        //输出警告信息
        for (String warning : warnings){
            System.out.println(warning);
        }
    }
}
