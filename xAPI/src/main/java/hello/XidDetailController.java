package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/detail") // This means URL's start with /demo (after Application path)

public class XidDetailController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private XidDetailRepository xidDetailRepository;


	@GetMapping(path="/all")
	public @ResponseBody Iterable<XidDetail> getAllXidDetails() {
		// This returns a JSON or XML with the users
		return xidDetailRepository.findAll();
	}
	@GetMapping(path="/{subset_xid_id}")
	public @ResponseBody List<XidDetail> getOneXidDetail(@PathVariable("subset_xid_id") Integer subset_xid_id){
		return xidDetailRepository.findBySubsetXidId(subset_xid_id);
	}
}