package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
    
    @RequestMapping("/numbers")
    public List<Integer> getNumbers() {
    	List<Integer> retorno = new ArrayList<Integer>();
    	for(int i=0; i<10; i++) {
    		retorno.add(i);
    	}
        return retorno;
    }    

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
