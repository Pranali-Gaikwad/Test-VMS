package com.visitor.vmsvisitorservice.dao;

//import org.springframework.test.annotation.DirtiesContext.ClassMode;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.visitor.vmsvisitorservice.model.Visitor;
import com.visitor.vmsvisitorservice.repository.VisitorRepository;
//import com.visitor.vmsvisitorservice.repository.VisitorRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext

public class VisitorDaoImplTest

{
@Autowired
	private VisitorRepository visitorRepository;


@Autowired
	private IVisitorDao visitorDao;

	
	  
	  @Test public void findByIdTest()
	  { 
       Visitor v = visitorDao.findById(9);
	  assertEquals(9, v.getId());
	  assertEquals("Rohit", v.getName());
	  assertEquals("rohit@gmail.com", v.getEmail());
	  assertEquals("3456789067",v.getMobileNo()); 
	  assertEquals("Sangavi", v.getAddress());
	  assertEquals("hru7856", v.getIdProof()); 
	  assertEquals("Ekta", v.getContactPersonName());
	  assertEquals("ekta@gmail.com", v.getContactPersonEmail());
	  assertEquals("Design", v.getReasonForVisit());
	  assertEquals(0, v.getStatus());
	  assertEquals("5643322156", v.getContactPersonMobileNo());
	  }
	 
	
	  @Test
	  public void findByNameTest() 
	  { 
		  Visitor v =visitorDao.findByName("Pranali");
		  assertEquals("Pranali", v.getName());
	  
	  }
	  
	 

	@Test
	public void deleteVisitorByIdTest() {
		int number = visitorDao.deleteVisitorById(15);
		assertEquals(1, number);
	}

	/*
	 * @Test public void saveAndUpdate() { Visitor v = visitorDao.findById(3);
	 * assertEquals("Rohit", v.getName());
	 * 
	 * v.setName("Rohit-updated");
	 * 
	 * visitorRepository.save(v);
	 * 
	 * Visitor v1 = visitorDao.findById(3); assertEquals("Rohit-updated",
	 * v1.getName());
	 * 
	 * }
	 */
	
	  @DirtiesContext
	  
	  @Test public void addVisitorTest() {
	  
	  Visitor v1 = new Visitor();
	  
	  v1.setName("Rohit");
	  
	  v1.setAddress("Sangavi");
	  
	  v1.setContactPersonEmail("ekta@gmail.com");
	  
	  v1.setContactPersonName("Ekta");
	  
	  v1.setMobileNo("3456789067");
	  
	  v1.setEmail("rohit@gmail.com");
	  
	  v1.setIdProof("hru7856");
	  
	  v1.setReasonForVisit("Design");
	  
	  v1.setContactPersonMobileNo("5643322156");
	  
	  visitorRepository.save(v1);
	 
	  }
	
	
	/*
	 * @Test public void visitorListTest() { List<Visitor> newList = new
	 * ArrayList<Visitor>(); Visitor v3 = new Visitor(1, "Pranali",
	 * "pranali@gmail.com", "7507752283", "Pimple Gurav", "GDU6778", "Sumeet",
	 * "sumeet@gmail.com", "Interview", "1236548796", 0); Visitor v4 = new
	 * Visitor(2, "Shilpa", "shilpa@gmail.com", "7507752283", "Sangavi Gurav",
	 * "GDU6778", "Neha", "neha@gmail.com", "Interview", "1236548796", 0);
	 * 
	 * newList.add(v3); newList.add(v4);
	 * 
	 * assertEquals(2,visitorDao.visitorsList().size());
	 * 
	 * }
	 */
}
