package event;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	private final AtomicLong counter = new AtomicLong();
	
	@PostMapping(value="/event")
	@ResponseBody
	public Event event(	@RequestParam(value="name") String r_name,
						@RequestParam(value="date",defaultValue="today") String r_date,
						@RequestParam(value="address",defaultValue="DefaultAddress") String r_address){
					
		return new Event(counter.incrementAndGet(), r_name, r_date, r_address);	
	}
	
	
}
