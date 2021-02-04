package pack1.controller;



import org.h2.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;

import pack1.exception.JSONException;
//import pack1.exception.JSONException;
import pack1.model.Student;
import pack1.repository.StudRepository;



@RestController
@RequestMapping("api/s1")
public class StudentController {
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	@Autowired
	private StudRepository studrepository;
	private Student stud1;
	private RestTemplate restTemplate;
	
	@GetMapping("/stud")
	public String message()
	{
		return "Microservice-1";
	}
	
	@GetMapping("/stud/{id}")
	public ResponseEntity<Student> getEmployeeById(@PathVariable(value = "id") Long studId)
			throws Exception {
		Student stud1 = studrepository.findById(studId)
				.orElseThrow(() -> new Exception("Employee not found for this id :: " + studId));
		return ResponseEntity.ok().body(stud1);
	}
	
//	@PostMapping("/stud")
//	public Student setInfo(@RequestBody Student stud1)
//	{
//		return studrepository.save(stud1);
//	}
	
	@PostMapping("/stud")
	public String home() throws JSONException{
		JSONObject jsonObject = null;
		jsonObject.put("message","hello");
		return jsonObject.toString();
	}
	
//		String url="http://localhost:8081/";
//		RestTemplate restTemplate=new RestTemplate();
//		public ResponseEntity<String> responserEntityValue(final String body, final RestTemplate restTemplate,
//	            final String url, final HttpMethod requestMethod, final Class<String> stringClass) {
//
//	        HttpHeaders headers = new HttpHeaders();
//	        // Set all headers
//	        headers.setContentType(MediaType.APPLICATION_JSON);
//
//	        HttpEntity<String> request = new HttpEntity<>(body, headers);
//
//	        return restTemplate.exchange(url, requestMethod, request, stringClass);
//		}
	    }




