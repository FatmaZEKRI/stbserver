package fr.univ.rouen.stbserver.controllers;

import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.transform.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.xml.sax.SAXException;

import fr.univ.rouen.stbserver.Service.ClientServiceImpl;
import fr.univ.rouen.stbserver.Service.DetailServiceImpl;
import fr.univ.rouen.stbserver.Service.FeatureServiceImpl;
import fr.univ.rouen.stbserver.Service.FirstNameImpl;
import fr.univ.rouen.stbserver.Service.PersonServiceImpl;
import fr.univ.rouen.stbserver.Service.STBServiceImpl;
import fr.univ.rouen.stbserver.Service.TeamServiceImpl;
import fr.univ.rouen.stbserver.model.Client;
import fr.univ.rouen.stbserver.model.Feature;
import fr.univ.rouen.stbserver.model.Person;
import fr.univ.rouen.stbserver.model.STB;
import fr.univ.rouen.stbserver.model.Stbs;
import fr.univ.rouen.stbserver.util.TransformXML;


@RestController
public class StbController {


	@Autowired
	private STBServiceImpl stbService;
	@Autowired
	private ClientServiceImpl clientService;
	@Autowired
	private DetailServiceImpl detailService;
	@Autowired
	private PersonServiceImpl personService;
	@Autowired
	private TeamServiceImpl teamService;
	@Autowired
	private FeatureServiceImpl featureService ;
	@Autowired
	private FirstNameImpl firstnameService;

	private TransformXML tranXml = new TransformXML();


	@RequestMapping(value= {"/resume"},method= {RequestMethod.GET, RequestMethod.POST},produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String getListSTBinXML() {
		List<STB> list = stbService.findAll();
		Stbs stbs = new Stbs(list);
		return this.tranXml.marshalStbs(stbs);
	}

	@RequestMapping(value= {"/stb"}, method=RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String getSTBXML(@RequestParam(value = "id") Integer id) throws JAXBException {
		if(tranXml.marshalStb(this.stbService.findById(id)).length()==0) {
			return "<id>"+ id+"</id> <status>ERROR</status>";
		}

		return tranXml.Validatemarshall(this.stbService.findById(id));
		

	}
	
	@RequestMapping(value= {"/htmlstb"}, method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView  getSTBHtml(@RequestParam(value = "id") Integer id) {
		ModelAndView model = new ModelAndView();
		STB stb = this.stbService.findById(id);
		model.setViewName("stb");
		model.addObject("stb", stb);
		return model;

	}
	@PutMapping(value= {"/insert"},produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String insertStb(@RequestBody STB stb) throws JAXBException{
		if(this.stbService.feindByVersionAndDescription(stb.getVersion(), stb.getDescription()) != null) {
			return "<result><status>ERROR</status></result>";
		}

		if(this.tranXml.Validatemarshall(stb).length()> 0) {
			/*this.clientService.saveClient(stb.getClient());
			for(Feature f : stb.getDetail().getFeatures()) {
				this.featureService.save(f);
			}
			this.detailService.saveDetail(stb.getDetail());
			for(Person p : stb.getTeam().getPersons()) {
				this.firstnameService.saveFirstName(p.getFirstname());
				this.personService.save(p);
			}
			this.teamService.save(stb.getTeam());*/

			this.stbService.saveSTB(stb);
			return "<result><id>"+stb.getId()+"</id><status>INSERTED</status></result>";
		}
		else{

			//e.printStackTrace();
			return "<result><status>ERROR</status></result>";
		}



	}

	@DeleteMapping(value= {"/delete"}, produces = MediaType.APPLICATION_XML_VALUE)
	public String delete(@RequestParam(value = "id") Integer id) {
		this.stbService.deleteSTB(id);
		if(this.stbService.checkIfIdexists(id)) {
		return "<status>ERROR</status>";}
		return "<id>"+id+"</id><status>DELETED</status>";
		
	}
	/*@GetMapping(value= {"/id"})
	public String getSTBinXML(
			@RequestParam(value = "name") String texte) {
		
		return ("Détail de la STB demandée : " + texte );
	}
	@GetMapping("/test")
	public String getSTBtestXML(@RequestParam(value="nb")String nb, @RequestParam(value="texte") String texte){

		return("Test: id="+nb+ " titre ="+texte );
	}*/



}
