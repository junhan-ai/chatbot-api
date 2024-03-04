package cn.bugstack.chatbot.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
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

    public void query_unansered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet(" ");
        get.addHeader("cookie", " ");
        get.addHeader("Content-Type", " ");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }

    }
}
