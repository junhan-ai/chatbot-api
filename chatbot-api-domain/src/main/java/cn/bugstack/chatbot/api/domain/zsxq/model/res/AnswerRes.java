package cn.bugstack.chatbot.api.domain.zsxq.model.res;

/**
 * @projectName: chatbot-api
 * @package: cn.bugstack.chatbot.api.domain.zsxq.model.res
 * @className: AnswerRes
 * @author: junhan Zhao
 * @description: 请求回答接口结果
 * @date: 2024/3/4 20:01
 * @version: 1.0
 */

public class AnswerRes {
    private boolean succeeded;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }
}
