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
                "\"school\":\"high\",\n" +
                "\"list\":[\n" +
                "\t{\n" +
                "\t\t\"a\":555,\n" +
                "\t\t\"b\":1.1,\n" +
                "\t\t\"c\":1199999999,\n" +
                "\t\t\"d\":false,\n" +
                "\t\t\"e\":9.00052220,\n" +
                "\t\t\"g\":22,\n" +
                "\t\t\"h\":1,\n" +
                "\t\t\"n\":65194695626941616984.51697,\n" +
                "\t\t\"a1\":1,\n" +
                "\t\t\"b1\":1.2,\n" +
                "\t\t\"c1\":9158451818,\n" +
                "\t\t\"d1\":true,\n" +
                "\t\t\"e1\":6668487.478,\n" +
                "\t\t\"g1\":33,\n" +
                "\t\t\"h1\":2\n" +
                "\t},\n" +
                "\n" +
                "\t{\n" +
                "\t\t\"a\":444,\n" +
                "\t\t\"b\":2.1,\n" +
                "\t\t\"c\":14124199999,\n" +
                "\t\t\"d\":true,\n" +
                "\t\t\"e\":9.00052220,\n" +
                "\t\t\"g\":55,\n" +
                "\t\t\"h\":3,\n" +
                "\t\t\"n\":65194695626941616984.51697,\n" +
                "\t\t\"a1\":1,\n" +
                "\t\t\"b1\":1.2,\n" +
                "\t\t\"c1\":9158451818,\n" +
                "\t\t\"d1\":false,\n" +
                "\t\t\"e1\":9797.478,\n" +
                "\t\t\"g1\":77,\n" +
                "\t\t\"h1\":5\n" +
                "\t}\n" +
                "\t]\n" +
                "}";
        User user = gson.fromJson(json, User.class);
        System.out.println("==================> user: " + user);

    }

}
