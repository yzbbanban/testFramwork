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

        String json = "\n" +
                "{\n" +
                "\"username\":\"ban\",\n" +
                "\"password\":\"111\",\n" +
                "\"age\":\"11\",\n" +
                "\"school\":\"high\",\n" +
                "\"list\":[\n" +
                "\t{\n" +
                "\t\t\"a\":\"444\",\n" +
                "\t\t\"b\":\"888\"\n" +
                "\t},\n" +
                "\n" +
                "\t{\n" +
                "\t\t\"a\":\"11\",\n" +
                "\t\t\"b\":\"255\"\n" +
                "\t}\n" +
                "\t]\n" +
                "}";
        User user = gson.fromJson(json, User.class);
        System.out.println("==================> user: " + user);

    }

}
