package hint;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class App {

    public String name() {
        return "hint";
    }

    public static void main(String[] args) throws Exception {
        var s = new ObjectMapper().writeValueAsString(Map.of("name", new App().name()));
        System.out.println(s);
    }
}
