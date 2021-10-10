package vaccinationTracker.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import vaccinationTracker.models.ResponseObject;
import vaccinationTracker.models.User;

@Controller
public class UserController {


	
	@GetMapping("/register")
	public String registration()
	{
		
		// implementation to read in the data and store in db.
		return "registration";
	
	}
	@GetMapping("/login")
	public String loggingin()
	{
		
		// implementation to read in the data and store in db.
		return "loginpage";
	
	}
	@GetMapping("/results")
	public String results()
	{
		
		// implementation to read in the data and store in db.
		return "results";
	
	}
	
	/*
//	-	This is the end point to register a user, admin will be using this end point.
	
	PostMethod
	public ResponseObject registerUser(User user);

	
//	-	This is the end point to add/update vaccination status, user will be using this end point.
	PostMethod
	public ResponseObject addUpdateVaccinationStatus(int userId, String status);


//	-	This end point will bring all the team members vaccination status.
	GetMethod
	public ResponseObject getTeamMembersVaccinationDetails(int projectId);


//	-	The end point will get the vaccination status of the login user.
	GetMethod
	public ResponseObject getUserVacinationStatus(int userId); 
*/

	
}
