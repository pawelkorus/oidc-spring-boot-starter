package io.github.pawelkorus.oidcspring;

import com.nimbusds.jwt.SignedJWT;
import io.github.pawelkorus.oidcspring.nimbus.OIDCNimbusTokenDecoder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SignedJWT.class)
public class OIDCNimbusAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(OIDCTokenDecoder.class)
    public OIDCTokenDecoder oidcTokenDecoderNimbus() {
        return new OIDCNimbusTokenDecoder();
    }

}
