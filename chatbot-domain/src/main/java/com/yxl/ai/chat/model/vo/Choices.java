package com.yxl.ai.chat.model.vo;

public class Choices {

    private int index;
    private Message message;
    private String logprobs;
    private String finish_reason;
    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    public Message getMessage() {
        return message;
    }

    public void setLogprobs(String logprobs) {
        this.logprobs = logprobs;
    }
    public String getLogprobs() {
        return logprobs;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }
    public String getFinish_reason() {
        return finish_reason;
    }

}