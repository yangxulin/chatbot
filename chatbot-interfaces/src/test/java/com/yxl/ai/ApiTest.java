package com.yxl.ai;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;


import java.io.IOException;

public class ApiTest {
    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/48888841514288/topics?scope=unanswered_questions&count=20");
        get.addHeader("cookie", "zsxq_access_token=44D83CF5-6195-E046-0052-E147982A6921_45B815C5B0C29257; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2218d2bd7df9d8df-06393d743c668a4-4c657b58-2073600-18d2bd7df9e9dc%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMThkMmJkN2RmOWQ4ZGYtMDYzOTNkNzQzYzY2OGE0LTRjNjU3YjU4LTIwNzM2MDAtMThkMmJkN2RmOWU5ZGMifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%2C%22%24device_id%22%3A%2218d2bd7df9d8df-06393d743c668a4-4c657b58-2073600-18d2bd7df9e9dc%22%7D; abtest_env=product; zsxqsessionid=e2c0e14ebdbb77ad14893a36bde36605");
        get.addHeader("Content-Type", "application/json;charset=utf8");
        CloseableHttpResponse response = httpClient.execute(get);
        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/411145888822558/answer");
        post.addHeader("cookie", "zsxq_access_token=44D83CF5-6195-E046-0052-E147982A6921_45B815C5B0C29257; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2218d2bd7df9d8df-06393d743c668a4-4c657b58-2073600-18d2bd7df9e9dc%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMThkMmJkN2RmOWQ4ZGYtMDYzOTNkNzQzYzY2OGE0LTRjNjU3YjU4LTIwNzM2MDAtMThkMmJkN2RmOWU5ZGMifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%2C%22%24device_id%22%3A%2218d2bd7df9d8df-06393d743c668a4-4c657b58-2073600-18d2bd7df9e9dc%22%7D; abtest_env=product; zsxqsessionid=e2c0e14ebdbb77ad14893a36bde36605");
        post.addHeader("Content-Type", "application/json;charset=utf8");
        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"机器手动回答\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"silenced\": false\n" +
                "  }\n" +
                "}";
        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
}
