package _30_Json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Json01 {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        // key - value entry 추가 -> addProperty();

        jsonObject.addProperty("username", "JW1234");
        jsonObject.addProperty("password", "q1w2e3");
        jsonObject.addProperty("email", "user@naver.com");
        jsonObject.addProperty("name", "재원");

        System.out.println("jsonObject: " + jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println("json: " + json);

        // 중첩 내부 객체
        JsonObject address = new JsonObject();
        address.addProperty("City", "부산시");
        address.addProperty("District", "남구");
        address.addProperty("zipcode", "48516");

        jsonObject.add("address", address); // addProperty 대신 add

        String json1 = gson.toJson(jsonObject);
        System.out.println(json1);

        JsonObject jsonObject1 = gson.fromJson(json1, JsonObject.class);
        System.out.println(jsonObject1);
    }

}
