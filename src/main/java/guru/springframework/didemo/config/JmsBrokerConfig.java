package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by uc on 9/15/2019
 */
@Configuration
//@PropertySource("classpath:jms.properties")
@PropertySources({
        @PropertySource("classpath:jms.properties"),
        @PropertySource("classpath:author.properties")
})
public class JmsBrokerConfig {

    @Value("${guru.author}")
    private String author;

    @Value("${guru.jms.username}")
    private String username;

    @Value("${guru.jms.password}")
    private String password;

    @Value("${guru.jms.url}")
    private String url;

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(username);
        fakeJmsBroker.setPassword(password);
        fakeJmsBroker.setUrl(url);

        return fakeJmsBroker;
    }

}
