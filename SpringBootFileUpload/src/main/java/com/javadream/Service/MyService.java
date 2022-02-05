package com.javadream.Service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javadream.Dao.MyDao;
import com.javadream.Model.MyModel;

@Service
public class MyService {

	private static final Logger logger = LoggerFactory.getLogger("MyService.class");
	@Autowired
	private MyDao dao;

	public int saveImage(MyModel model) {
		try {
			dao.save(model);
			return 1;
		} catch (Exception e) {
			logger.error("ERROR", e);
			return 0;
		}
	}

	public MyModel getImages(Long id) {
		Optional findById = dao.findById(id);
		if (findById.isPresent()) {
			MyModel getImageDetails = (MyModel) findById.get();
			logger.info("id= " + getImageDetails.getId() + " name= " + getImageDetails.getName());
			return getImageDetails;
		} else {
			return null;
		}
	}
}
