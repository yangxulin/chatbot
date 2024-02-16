package com.yxl.ai.chat.model.aggregates;

import com.yxl.ai.chat.model.vo.Choices;
import com.yxl.ai.chat.model.vo.Usage;

import java.util.List;

public class AIAnswer {

    private String id;
    private String object;
    private long created;
    private String model;
    private List<Choices> choices;
    private Usage usage;
    private String system_fingerprint;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setObject(String object) {
        this.object = object;
    }
    public String getObject() {
        return object;
    }

    public void setCreated(long created) {
        this.created = created;
    }
    public long getCreated() {
        return created;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setChoices(List<Choices> choices) {
        this.choices = choices;
    }
    public List<Choices> getChoices() {
        return choices;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }
    public Usage getUsage() {
        return usage;
    }

    public void setSystem_fingerprint(String system_fingerprint) {
        this.system_fingerprint = system_fingerprint;
    }
    public String getSystem_fingerprint() {
        return system_fingerprint;
    }

}