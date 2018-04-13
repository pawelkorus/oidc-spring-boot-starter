package io.github.pawelkorus.oidcspring;

import io.github.pawelkorus.oidcspring.spring.DefaultOIDCUserDetailsService;
import io.github.pawelkorus.oidcspring.spring.OIDCUserDetailsService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({OIDCNimbusAutoConfiguration.class, OIDCOAuth0AutoConfiguration.class})
public class OIDCAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(OIDCUserDetailsService.class)
    public OIDCUserDetailsService defaultOIDCUserDetailsService() {
        return new DefaultOIDCUserDetailsService();
    }

}
