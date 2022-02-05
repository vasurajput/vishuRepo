package com.javadream.Dao;

import org.springframework.data.repository.CrudRepository;

import com.javadream.Model.MyModel;

public interface MyDao extends CrudRepository<MyModel, Long> {

}
