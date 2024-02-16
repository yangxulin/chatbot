package com.yxl.ai.chat;

import java.io.IOException;

public interface IOpenAI {
    String doChatGPT(String question) throws IOException;
}
