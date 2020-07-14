import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Post {
	
	@Test
	public void test_post() {
		JSONObject request = new JSONObject();
		
		request.put("name", "Ano");
		request.put("job", "learner");
		
//		System.out.println(request);
//		System.out.println(request.toJSONString());
		
		given().
			header("contentType", "application/JSON").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
		
	}

}
