/**
 * 
 */
package masterSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sanjay
 *
 */

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello()
	{
		return "Hello, I am Fit!";
	}

}
