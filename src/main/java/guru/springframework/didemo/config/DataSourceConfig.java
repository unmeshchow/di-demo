package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by uc on 9/15/2019
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Value("${guru.username}")
    private String user;

    @Value("${guru.password}")
    private String password;

    @Value("${guru.dburl}")
    private String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(env.getProperty("username"));
        fakeDataSource.setPassword(env.getProperty("guru.password"));
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }
}
