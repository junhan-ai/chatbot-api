package cn.bugstack.chatbot.api.domain.zsxq.model.aggregates;

import cn.bugstack.chatbot.api.domain.zsxq.model.res.RespData;
import cn.bugstack.chatbot.api.domain.zsxq.model.vo.Resp_data;

/**
 * @projectName: chatbot-api
 * @package: cn.bugstack.chatbot.api.domain.zsxq.model.aggregates
 * @className: UnAnsweredQuestionsAggregates
 * @author: junhan Zhao
 * @description: 未回答问题的聚合信息
 * @date: 2024/3/4 19:18
 * @version: 1.0
 */

public class UnAnsweredQuestionsAggregates {
    private boolean succeeded;
    private RespData resq_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public RespData getResq_data() {
        return resq_data;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public void setResq_data(RespData resq_data) {
        this.resq_data = resq_data;
    }
}
