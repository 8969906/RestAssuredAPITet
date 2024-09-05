/*Name = Manish Kushwaha
Date = 04 September, 2024
Description = In this program i have done the Api testing which is given me as a project with the help of TestNG framework*/


package api.APITestingCapstone;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class FoodDeliveryManagement {
	
	  
	 
	 
	  @Test(priority =1)
	  public void postUsers() {
		  RestAssured.baseURI = "http://localhost:3000/users/register";
	       // Create a JSON request body for POST
	       JSONObject requestParams = new JSONObject();
	       requestParams.put("username", "gautamsaini");
	       requestParams.put("password", "manu#456");
	       requestParams.put("email", "manua@gmail456");
	       // Send a POST request
	       Response response = RestAssured.given()
	           .header("Content-Type", "application/json")
	           .body(requestParams.toString())
	           .request(Method.POST, "");
	       System.out.println("POST Response => " + response.prettyPrint());
	  }
	  @Test(priority =2)
	  public void postUsersLogin() {
		  RestAssured.baseURI = "http://localhost:3000/users/login";
	       // Create a JSON request body for POST
	       JSONObject requestParams = new JSONObject();
	       requestParams.put("username", "gautamsaini");
	       requestParams.put("password", "manu#456");
	       //requestParams.put("email", "manua@gmail456");
	       // Send a POST request
	       Response response = RestAssured.given()
	           .header("Content-Type", "application/json")
	           .body(requestParams.toString())
	           .request(Method.POST, "");
	       System.out.println("POST Response => " + response.prettyPrint());
	  }
	  
	  @Test(priority = 3)
	  public void postRestaurants() {
		  RestAssured.baseURI = "http://localhost:3000/restaurants";
	       // Create a JSON request body for POST
	       JSONObject requestParams = new JSONObject();
	       requestParams.put("name", "Rajhans");
	       requestParams.put("address", "MP nagar");
	       requestParams.put("cuisineType", "Punjabi");
	       requestParams.put("contactInfo", "132453451526");
	       // Send a POST request
	       Response response = RestAssured.given()
	           .header("Content-Type", "application/json")
	           .body(requestParams.toString())
	           .request(Method.POST, "");
	       System.out.println("POST Response => " + response.prettyPrint());
	  }
	  
	  @Test(priority = 4) 
	  public void getRestaurantsById()
	  { // Send a GET request
	  RestAssured.baseURI = "http://localhost:3000/restaurants/3";
	  
	  Response response = RestAssured.given().request(Method.GET, "");
	  
	  System.out.println("GET Response => " + response.prettyPrint());
	  }
	  
	  
	  @Test(priority = 5)
	  
	  public void postOrders() {
		  RestAssured.baseURI = "http://localhost:3000/orders";
	       // Create a JSON request body for POST
	       JSONObject requestParams = new JSONObject();
	       requestParams.put("userId", "32");
	       requestParams.put("restaurantId", "56");
	       requestParams.put("foodIteams", "Rice");
	       requestParams.put("totalPrice", "132");
	       // Send a POST request
	       Response response = RestAssured.given()
	           .header("Content-Type", "application/json")
	           .body(requestParams.toString())
	           .request(Method.POST, "");
	       System.out.println("POST Response => " + response.prettyPrint());
	  }
	  
	  @Test(priority = 6)
	  public void getOrderById() {
		  
		  RestAssured.baseURI = "http://localhost:3000/orders/3";
		  
		  Response response = RestAssured.given().request(Method.GET, "");
		  
		  System.out.println("GET Response => " + response.prettyPrint());
	  }
	 
		
	  @Test(priority = 7)
	  public void putUser() {
	       // Create a JSON request body for PUT
		  RestAssured.baseURI = "http://localhost:3000/users/1";
	       JSONObject requestParams = new JSONObject();
	       requestParams.put("username", "Surendra");
	       requestParams.put("password", "abcd@345");
	 
	       // Send a PUT request
	       Response response = RestAssured.given()
	           .header("Content-Type", "application/json")
	           .body(requestParams.toString())
	           .request(Method.PUT, "");
	       System.out.println("PUT Response => " + response.prettyPrint());
	  }
		
		/*
		 * @Test(priority = 8) public void deleteUsers() {
		 * 
		 * RestAssured.baseURI = "http://localhost:3000/users/3";
		 * 
		 * String idToDelete = "3"; // Replace with an actual Id
		 * 
		 * // Send a DELETE request with the Id as a query parameter Response response
		 * =RestAssured.given() .queryParam("id", idToDelete)
		 * .request(Method.DELETE,"");
		 * 
		 * System.out.println("DELETE Response => " + response.prettyPrint()); }
		 */
		 
		 
}