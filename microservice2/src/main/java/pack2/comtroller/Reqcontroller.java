package pack2.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Reqcontroller {

	@RequestMapping(value="http:localhost:8080/api/s1/stud",method=RequestMethod.POST)
	//@GetMapping("/")
	public String message(){
	  // do something
	  return "Welcome";
	}

}
