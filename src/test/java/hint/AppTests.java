package hint;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTests {

    @Test
    public void test() {
        var app = new App();
        assertNotNull(app.name(), "app should have a name");
    }
}
