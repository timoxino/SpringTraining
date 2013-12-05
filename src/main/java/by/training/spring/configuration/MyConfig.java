package by.training.spring.configuration;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.awt.*;
import java.util.Random;

/**
 * @author Tsimafei_Shchytkavets
 */
@ComponentScan(basePackages = "by.training.spring")
@PropertySource("classpath:quotes.properties")
@Configuration
public class MyConfig
{
    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public Color randomColor()
    {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    PropertySourcesPlaceholderConfigurer configurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
