package io.github.pawelkorus.oidcspring;

import com.auth0.jwt.JWT;
import io.github.pawelkorus.oidcspring.oauth0.OIDCOAuth0TokenDecoder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(JWT.class)
public class OIDCOAuth0AutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(OIDCTokenDecoder.class)
    public OIDCTokenDecoder oidcTokenDecoderOAuth0() {
        return new OIDCOAuth0TokenDecoder();
    }

}
