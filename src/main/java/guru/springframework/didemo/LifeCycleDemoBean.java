package guru.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by uc on 9/11/2019
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleDemoBean constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // InitializingBean
        System.out.println("## The LifeCycleDemoBean has set its properties");
    }

    @Override
    public void destroy() throws Exception {
        // DisposableBean
        System.out.println("## The LifeCycleDemoBean has been terminated");
    }

    @Override
    public void setBeanName(String name) {
        // BeanNameAware
        System.out.println("## My Bean name is: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // BeanFactoryAware
        System.out.println("## Bean factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // ApplicationContextAware
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The @PostConstruct method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The @PreDestroy method has been called");
    }

    public void beforeInit() {
        System.out.println("## Before Init - called by the bean post processor");
    }

    public void afterInit() {
        System.out.println("## After Init - called by the bean post processor");
    }
}
