package pack1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class JSONException extends Exception {

	public JSONException(String message){
    	super(message);
    }
}
