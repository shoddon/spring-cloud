import com.ulisesbocchio.jasyptspringboot.EncryptablePropertyResolver;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

/**
 * @类功能说明：配置文件加解密bean
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @作者： shoddon
 * @创建时间： 2018/11/6 10:41
 * @版本：V1.0
 */
@Configuration
public class EncryptionPropertyConfig {
    @Bean(name="encryptablePropertyResolver")
    public EncryptablePropertyResolver encryptablePropertyResolver() {
        return new EncryptionPropertyResolver();
    }

    class EncryptionPropertyResolver implements EncryptablePropertyResolver {

        @Override
        public String resolvePropertyValue(String value) {
            if(StringUtils.isBlank(value)) {
                return value;
            }
            return resolveDESValue(value);
        }

        private String resolveDESValue(String value) {
            // 自定义DES密文解密
            try {
                return DESUtil.decryption(value, UUID.randomUUID().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
