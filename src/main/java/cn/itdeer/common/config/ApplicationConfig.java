package cn.itdeer.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description : 应用的配置信息
 * PackageName : cn.itdeer.common.config
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/13/23:28
 */

@Data
@Component
public class ApplicationConfig {


    @Value("${application.page.size}")
    private int pageSize;

}
