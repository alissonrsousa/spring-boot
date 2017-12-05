package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/numbers")
    public List<Integer> getNumbers() {
    	List<Integer> retorno = new ArrayList<>();
    	for(int i=0; i< 10; i++) {
    		retorno.add(i);
    	}
        return retorno;
    }    
    
}
