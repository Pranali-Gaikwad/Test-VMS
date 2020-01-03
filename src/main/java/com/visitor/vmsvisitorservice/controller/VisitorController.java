package com.visitor.vmsvisitorservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.visitor.vmsvisitorservice.dto.VisitorDto;
import com.visitor.vmsvisitorservice.exception.VisitorNotFoundException;
import com.visitor.vmsvisitorservice.model.Visitor;

import com.visitor.vmsvisitorservice.service.IVisitorService;

@RestController

public class VisitorController {

	@Autowired
	private IVisitorService visitorService;

	@PostMapping("/addVisitor")

	public ResponseEntity<String> addVisitor(@RequestBody VisitorDto visitorDto) {
		return new ResponseEntity<String>(visitorService.addVisitor(visitorDto), HttpStatus.OK);
	}

	@GetMapping("/visitorslist")
	public List<Visitor> visitorsList() {
		return visitorService.visitorsList();
	}

	@GetMapping("/visitorslist/{id}")
	public Visitor getByVisitorId(@PathVariable long id) {
		// return visitorService.getByVisitorId(id);
		try {
			Visitor userData = visitorService.getByVisitorId(id);
			return userData;
		} catch (Exception e) {
			throw new VisitorNotFoundException("");
		}

	}

	@PostMapping("/visitorByName")
	public Visitor getVisitorByName(@RequestBody Visitor visitor) {
		String name = visitor.getName();

		return visitorService.getVisitorByName(name);
	}

	@PutMapping("/updateVisitor")
	public void updateVisitor(@RequestBody Visitor visitor) {
		visitorService.updateVisitor(visitor);
	}

	@RequestMapping("/updateVisitorById/{id}")
	public void updateVisitorById(@RequestBody Visitor visitor, @PathVariable long id) {
		visitorService.updateVisitorById(visitor, id);
	}

	@GetMapping("/deleteVisitorById/{id}")
	public int deleteVisitorById(@PathVariable long id) {
		int no = visitorService.deleteVisitorById(id);
		return no;

	}

	

}
