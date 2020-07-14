import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_Get {
	
	@Test
	public void test_get() {
		given().
			get("https://reqres.in/api/users?page=2").
			then().
				statusCode(200).
				body("data.id[1]",equalTo(8)).
				log().all();
	}

}
