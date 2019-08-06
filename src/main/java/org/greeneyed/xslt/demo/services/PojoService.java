package org.greeneyed.xslt.demo.services;

import java.util.Arrays;
import java.util.List;

import org.greeneyed.xslt.demo.model.MyPojo;
import org.springframework.stereotype.Service;

@Service
public class PojoService {
	public List<MyPojo> getPojos() {
		return Arrays.asList(new MyPojo("anId", "aName"), new MyPojo("anotherId", "anotherName"));
	}
}
