package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/daikichi")
    public String index(){
      return "Welcome!";
    }
    // you can be explicit about the request as well
    @RequestMapping(value="/daikichi/today", method=RequestMethod.GET)
    public String hello(){
      return "Today you will find luck in your endeavors!";
    }
    @RequestMapping("/daikichi/tomorrow")
    public String world(){
      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
      
	@RequestMapping("/daikichi/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations, you will soon travel to " + city + "!";
	}
	
	@RequestMapping("/daikichi/lotto/{number}")
	public String lottery(@PathVariable("number") String number) {
		int convertInt = Integer.parseInt(number);
		if(convertInt%2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		return "You have enjoyed the fruits of your treebranches but now is a great time to spend time with family and friends.";
	}
}
