package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 注释启动组件扫描，
 * 1.@ComponentScan默认扫描与配置类相同的包
 * 2.可以通过XML配置启动组件扫描 <context:component-scan base-package=""/>
 * @author molai
 *
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
