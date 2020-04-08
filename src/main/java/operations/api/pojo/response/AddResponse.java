package operations.api.pojo.response;

import org.springframework.http.HttpStatus;

public class AddResponse {

    String result;

    public AddResponse(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
