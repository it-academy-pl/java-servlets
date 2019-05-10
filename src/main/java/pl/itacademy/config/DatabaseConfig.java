package pl.itacademy.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Asia on 04.05.2019.
 */

@Configuration
public class DatabaseConfig {

    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://remotemysql.com:3306/l9CKVZoljX");
        ds.setUsername("l9CKVZoljX");
        ds.setPassword("r9B2AXe45z");
        return ds;
    }

  /*      <beans:bean id="datasource" class="org.apache.commons.dbcp.BasicDataSource">
        <beans:property name="driverClassName" value="com.mysql.jdbc.Driver"/>
        <beans:property name="url" value="jdbc:mysql://remotemysql.com:3306/l9CKVZoljX"/>
        <beans:property name="username" value="l9CKVZoljX"/>
        <beans:property name="password" value="r9B2AXe45z"/>
    </beans:bean>*/

}
