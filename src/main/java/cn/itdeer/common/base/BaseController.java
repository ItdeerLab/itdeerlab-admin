package cn.itdeer.common.base;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.common.exception.info.CodeMessageInfo;
import cn.itdeer.common.message.Message;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
     * 定义提示信息属性
     */
    private static final String option = "<script>toastr.option = {\"closeButton\": true,\"progressBar\": true,\"timeOut\": 8000} \n";


    /**
     * 检查参数是否为空
     * @param param_name 参数名称(形参)
     * @param param_value 参数值(实参)
     * @throws GeneralException 检测为空则抛出异常
     */
    public void checkParameter(String param_name,String param_value) throws GeneralException {
        if(StringUtils.isEmpty(param_value) || param_name == null){
            throw new GeneralException(param_name,CodeMessageInfo.PARAMETER_IS_EMPTY);
        }
    }


    /**
     * 请求重定向携带消息
     * @param redirectAttributes 重定向属性
     * @param baseMessage 封装的消息体
     */
    protected void addMessage(RedirectAttributes redirectAttributes,Message baseMessage){
        String message = "toastr." + baseMessage.getType() + "(\"" + baseMessage.getMessage() + "\", \""+ baseMessage.getTitle() +"\");</script>";
        redirectAttributes.addFlashAttribute("message",option + message);
    }


}
