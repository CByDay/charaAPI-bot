package cn.bugstack.chatgtp.api.test;

import cn.bugstack.chatgtp.api.vo.Actor;
import cn.bugstack.chatgtp.api.vo.IActorDao;
import cn.bugstack.chatgtp.api.vo.MybatisUtil;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.http.client.methods.HttpGet;
import org.junit.Test;

import java.util.List;

public class ApiTest {

    @Test
    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("");

        get.addHeader("cookie", "");
    }

}
