package com.yxl.ai.zsxq.model.aggregates;

import com.yxl.ai.zsxq.model.res.RespData;

/**
 * 返回未回答问题们的聚合信息
 */
public class UnAnsweredQuestionsAggregates {
    //是否成功拿到返回数据
    private boolean succeeded;
    //返回数据
    private RespData resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }

}
