package com.cofig;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


    @Configuration//标志该类是Spring的核心配置类
    @ComponentScan("com")//配置扫描
    @Import(DataSourceConfiguration.class)
public class SpringCofiguration {


}
