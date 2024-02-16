package com.yxl.ai.zsxq.model.res;

import com.yxl.ai.zsxq.model.vo.Topics;

import java.util.List;

public class RespData {
    // 一个列表，存放着所有的问题
    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

}
