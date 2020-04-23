package cl.signatory.signatory.controllers;

import org.jboss.logging.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ValidateFile {

	private Logger logger = Logger.getLogger(ValidateFile.class);
	
	@GetMapping(path = "validate/getValidateFile", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getValidateFile() {
		logger.debug("entramos con el logger ejaleeeeeeeeee");
		return "validateeeeeeeeeeeeeeeeee";
	}
}
