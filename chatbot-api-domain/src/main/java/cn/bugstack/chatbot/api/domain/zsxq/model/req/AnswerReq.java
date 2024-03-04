package cn.bugstack.chatbot.api.domain.zsxq.model.req;

import org.springframework.web.bind.annotation.RequestBody;

/**
 * @projectName: chatbot-api
 * @package: cn.bugstack.chatbot.api.domain.zsxq.model.req
 * @className: AnswerReq
 * @author: junhan Zhao
 * @description: 请求回答接口信息
 * @date: 2024/3/4 19:54
 * @version: 1.0
 */

public class AnswerReq {
    private Req_data req_data;

    public AnswerReq(Req_data req_data) {
        this.req_data = req_data;
    }


    public void setReq_data(Req_data req_data){
        this.req_data = req_data;
    }
    public Req_data getReq_data(){
        return this.req_data;
    }
}
