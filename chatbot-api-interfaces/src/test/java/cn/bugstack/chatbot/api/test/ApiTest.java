package cn.bugstack.chatbot.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import org.apache.http.util.EntityUtils;
import org.junit.Test;

import org.apache.tomcat.util.http.fileupload.MultipartStream;

import java.io.IOException;

/**
 * @projectName: chatbot-api
 * @package: cn.bugstack.chatbot.api.test
 * @className: ApiTest
 * @author: junhan Zhao
 * @description:  单元测试
 * @date: 2024/3/4 14:30
 * @version: 1.0
 */

public class ApiTest {

    @Test
    public void query_unansered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/28885518425541/topics?scope=all&count=20");
        get.addHeader("cookie", "sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22544824824412484%22%2C%22first_id%22%3A%22184f112303e323-0abf989de25c91-7d5d5476-1622400-184f112303f12bb%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg0ZjExMjMwM2UzMjMtMGFiZjk4OWRlMjVjOTEtN2Q1ZDU0NzYtMTYyMjQwMC0xODRmMTEyMzAzZjEyYmIiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI1NDQ4MjQ4MjQ0MTI0ODQifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22544824824412484%22%7D%2C%22%24device_id%22%3A%22184f112303e323-0abf989de25c91-7d5d5476-1622400-184f112303f12bb%22%7D; zsxq_access_token=4038A1D6-3E18-7954-1045-A6CBF8602F9F_4FA3DBE5BF848F05; zsxqsessionid=459a6f7036d758d2f3e9a5afbac253fe; abtest_env=product");
        get.addHeader("Content-Type", "application/json; charset=UTF-8");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }

    }
    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        //https://api.zsxq.com/v2/topics/5122151158425414/comments
        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/5122151158425414/comments");
        post.addHeader("cookie", "sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22544824824412484%22%2C%22first_id%22%3A%22184f112303e323-0abf989de25c91-7d5d5476-1622400-184f112303f12bb%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg0ZjExMjMwM2UzMjMtMGFiZjk4OWRlMjVjOTEtN2Q1ZDU0NzYtMTYyMjQwMC0xODRmMTEyMzAzZjEyYmIiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI1NDQ4MjQ4MjQ0MTI0ODQifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22544824824412484%22%7D%2C%22%24device_id%22%3A%22184f112303e323-0abf989de25c91-7d5d5476-1622400-184f112303f12bb%22%7D; zsxq_access_token=4038A1D6-3E18-7954-1045-A6CBF8602F9F_4FA3DBE5BF848F05; zsxqsessionid=459a6f7036d758d2f3e9a5afbac253fe; abtest_env=product");
        post.addHeader("Content-Type", "application/json; charset=UTF-8");


        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"这是一个自动回答测试\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"mentioned_user_ids\": []\n" +
                "  }\n" +
                "}";
        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }

    }



}
