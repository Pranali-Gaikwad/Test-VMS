package com.visitor.vmsvisitorservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.visitor.vmsvisitorservice.dto.VisitorDto;
import com.visitor.vmsvisitorservice.model.Visitor;
import com.visitor.vmsvisitorservice.service.IVisitorService;

@Controller
public class ApplicationController {

	@Autowired
	private IVisitorService visitorService;

	@RequestMapping(value = "/visitorRegistration", method = RequestMethod.GET)
	public ModelAndView newRegistration(ModelMap model) {
		Visitor visitor = new Visitor();
		model.addAttribute("visitor", visitor);
		return new ModelAndView("VisitorRegistration");
	}

	@PostMapping(value = "/save")
	public ModelAndView saveRegistration(@Valid VisitorDto visitorDto, BindingResult result, ModelMap model,
			RedirectAttributes redirectAttributes) {

		visitorService.addVisitor(visitorDto);
		List<Visitor> list = visitorService.visitorsList();
		return new ModelAndView("VisitorList", "list", list);

	}

	@RequestMapping(value = "/deleteVisitor/{id}", method = RequestMethod.GET)
	public ModelAndView deleteVisitor(@PathVariable long id) {
		visitorService.deleteVisitorById(id);

		List<Visitor> list = visitorService.visitorsList();
		return new ModelAndView("VisitorList", "list", list);
	}

	@RequestMapping(value = "/editVisitor/{id}")
	public ModelAndView edit(@PathVariable long id, ModelMap model) {
		Visitor visitor = visitorService.getByVisitorId(id);
		model.addAttribute("visitor", visitor);
		return new ModelAndView("editVisitor");

	}

	@RequestMapping(value = "editVisitor/editsave")
	public ModelAndView editsave( @ModelAttribute("visitor") Visitor v) {
		 visitorService.updateVisitor(v);

		List<Visitor> list = visitorService.visitorsList();
		return new ModelAndView("VisitorList", "list", list);
	}

}
