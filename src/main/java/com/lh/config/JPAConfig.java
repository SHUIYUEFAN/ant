package com.lh.config;


import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: 水越帆
 * @date: Create in 8:37 2018/11/21
 * QQ:1548353431
 */
@Configuration//配置类
@EnableJpaRepositories(basePackages = "com.lh.repository")//扫描仓库类
@EnableTransactionManagement//允许事务管理
public class JPAConfig {

    /*
建立数据源
 */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){

        return DataSourceBuilder.create().build();
    }
    /*
    设置管理工厂
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        HibernateJpaVendorAdapter japVendor = new HibernateJpaVendorAdapter();
        //是否生成sql
        japVendor.setGenerateDdl(false);
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource());
        entityManagerFactory.setJpaVendorAdapter(japVendor);
        entityManagerFactory.setPackagesToScan("com.lh.entity");
        return entityManagerFactory;
    }
    /*
    事务管理类
     */
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}
