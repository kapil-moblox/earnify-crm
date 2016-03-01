package com.crm.earnify.api.config; /**
 *  @version 1.0, 27/2/16
 *  @author sandeepandey
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.crm.earnify"})
@PropertySource({"classpath:/db.properties"})
public class EarnifyDBConfig {


    private static final Log LOG = LogFactory.getLog(EarnifyDBConfig.class);

    private static final String DB_URL = "jdbc.url";
    private static final String USERNAME = "jdbc.username";
    private static final String PASSWORD = "jdbc.password";

    @Autowired
    private Environment env;

    public EarnifyDBConfig() {

    }

    @Bean(name = "earnify-session-factory")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(restDataSource());
        sessionFactory.setPackagesToScan(new String[]{"com.crm.earnify"});
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean
    public DataSource restDataSource() {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(env.getProperty(DB_URL));
        dataSource.setUsername(env.getProperty(USERNAME));
        dataSource.setPassword(env.getProperty(PASSWORD));

        return dataSource;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory().getObject());
        return txManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    Properties hibernateProperties() {
        return new Properties() {
            {
                setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
                setProperty("hibernate.show_sql", "true");
            }
        };
    }
}

