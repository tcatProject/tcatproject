package spring.project.tcat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.project.tcat.persistence.HostDAOImp;

@Service
public class HostServiceImp implements HostService {

	@Autowired
	HostDAOImp hDao;
	
}
