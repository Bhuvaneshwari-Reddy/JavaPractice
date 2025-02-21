import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DynamicResponse{
    public static void main(String[] args){
        Response response=RestAssured.get("https://run.mocky.io/v3/15da8957-49bb-4a5a-b1f3-0a28ed7cffe9");
        Object responseAsObject=response.as(Object.class);
        if(responseAsObject instanceof List){
            List responseAsList=(List)responseAsObject;
            System.out.println(responseAsList.size());
        }
        else if(responseAsObject instanceof Map){
            Map responseAsMap=(Map)responseAsObject;
           System.out.println(((Map)responseAsObject).keySet());
        }
    }
}