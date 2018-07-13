package com.test;

import com.test.yojson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMainApplicationTests {

    @Test
    public void contextLoads() {
        Gson gson = new Gson();

        String json = "{\n" +
                "\"username\":\"ban\",\n" +
                "\"password\":\"111\",\n" +
                "\"age\":\"11\",\n" +
                "\"school\":\"high\"\n" +
                "}";
        User user = gson.fromJson(json, User.class);
        System.out.println("==================> user: " + user);

    }

}
