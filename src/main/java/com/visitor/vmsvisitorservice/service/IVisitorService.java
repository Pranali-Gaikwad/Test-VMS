package com.visitor.vmsvisitorservice.service;

import java.util.List;

import com.visitor.vmsvisitorservice.dto.VisitorDto;
import com.visitor.vmsvisitorservice.model.Visitor;

public interface IVisitorService {

	String addVisitor(VisitorDto visitorDto);

	List<Visitor> visitorsList();

	Visitor getVisitorByName(String name);

	Visitor getByVisitorId(long id);

	void updateVisitor(Visitor visitor);

	void updateVisitorById(Visitor visitor, long id);

	void deleteVisitorById(long id);

}
