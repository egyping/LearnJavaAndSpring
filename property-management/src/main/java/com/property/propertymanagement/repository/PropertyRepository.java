package com.property.propertymanagement.repository;

import com.property.propertymanagement.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

// CrudRepository has all kind of supportive methods to query the model findbyid save delete ..etc.
public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {

}
