package fr.univ.rouen.stbserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.STB;

@RestController
public class StbController {
	
	
	@GetMapping("/resume")
	public String getListSTBinXML() {
	return "Envoi de la liste des STB";
	}
	@GetMapping("/id")
	public String getSTBinXML(
	@RequestParam(value = "name") String texte) {
	return ("Détail de la STB demandée : " + texte);
	}
	@GetMapping("/test")
	public String getSTBtestXML(@RequestParam(value="nb")String nb, @RequestParam(value="texte") String texte){
		
		return("Test: id="+nb+ " titre ="+texte );
	}
	
	

}
