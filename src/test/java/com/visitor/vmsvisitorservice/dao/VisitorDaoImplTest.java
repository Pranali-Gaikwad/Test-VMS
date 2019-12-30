package com.visitor.vmsvisitorservice.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
public class VisitorDaoImplTest {

	@Autowired
	private VisitorRepository visitorRepository;

	@Autowired
	private IVisitorDao visitorDao;

	/*
	 * @Test public void findByIdTest() { Visitor v = visitorDao.findById(3);
	 * assertEquals(3, v.getId()); assertEquals("Rohit", v.getName());
	 * assertEquals("rohit@gmail.com", v.getEmail());
	 * 
	 * assertEquals("3456789067", v.getMobileNo()); assertEquals("Sangavi",
	 * v.getAddress()); assertEquals("hru7856", v.getIdProof());
	 * assertEquals("Ekta", v.getContactPersonName());
	 * assertEquals("ekta@gmail.com", v.getContactPersonEmail());
	 * assertEquals("Design", v.getReasonForVisit()); assertEquals(0,
	 * v.getStatus()); assertEquals("5643322156", v.getContactPersonMobileNo()); }
	 * 
	 * @Test public void findByNameTest() { Visitor v =
	 * visitorDao.findByName("Rohit"); assertEquals("Rohit", v.getName());
	 * 
	 * }
	 */
	/*
	 * @DirtiesContext
	 * 
	 * @Test public void deleteVisitorByIdTest() {
	 * 
	 * 
	 * visitorDao.deleteVisitorById(5); assertNull(visitorDao.findById(5)); }
	 */
	
	  @DirtiesContext
	  
	  @Test public void saveAndUpdate() { Visitor v = visitorDao.findById(3);
	  assertEquals("Rohit", v.getName());
	  
	  v.setName("Rohit-updated");
	  
	  visitorRepository.save(v);
	  
	  Visitor v1 = visitorDao.findById(3); assertEquals("Rohit-updated",
	  v1.getName());
	  
	  }
	  
	 
}
