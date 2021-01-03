package study.springcloud.apollo.support;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableApolloConfig
@SpringBootApplication(scanBasePackages = "study.springcloud.apollo")
public class SpringBootCfg {

}
