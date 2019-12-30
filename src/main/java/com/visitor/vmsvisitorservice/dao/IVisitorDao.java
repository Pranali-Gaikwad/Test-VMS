package com.visitor.vmsvisitorservice.dao;

import java.util.List;

import com.visitor.vmsvisitorservice.model.Visitor;

public interface IVisitorDao {

	List<Visitor> visitorsList();

	Visitor findById(long id);

	Visitor findByName(String name);

	void updateVisitor(Visitor visitor);

	void updateVisitorById(Visitor visitor, long id);

	void deleteVisitorById(long id);

}
