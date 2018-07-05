package cn.itdeer.common.base;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.common.exception.info.CodeMessageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * Description : 基础Controller
 * PackageName : cn.itdeer.common.base
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/13/23:42
 */

@Slf4j
public abstract class BaseController {


    /**
     * 检查参数是否为空
     * @param param_name 参数名称(形参)
     * @param param_value 参数值(实参)
     * @throws GeneralException 检测为空则抛出异常
     */
    public void checkParameter(String param_name,String param_value) throws GeneralException {
        if(StringUtils.isEmpty(param_value)){
            throw new GeneralException(param_name,CodeMessageInfo.PARAMETER_IS_EMPTY);
        }
    }


}
