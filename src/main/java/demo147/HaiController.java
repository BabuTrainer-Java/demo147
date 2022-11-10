package demo147;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaiController {
@GetMapping("/haa")
	public String getHai()
	{
		return "hai Spring Boot";
	}
	
}
