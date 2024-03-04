package cn.bugstack.chatbot.api.domain.zsxq.model.res;

import cn.bugstack.chatbot.api.domain.zsxq.model.vo.Topics;

import java.util.List;

/**
 * @projectName: chatbot-api
 * @package: cn.bugstack.chatbot.api.domain.zsxq.model.res
 * @className: RespData
 * @author: junhan Zhao
 * @description: TODO
 * @date: 2024/3/4 19:28
 * @version: 1.0
 */

public class RespData {
    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }
}
