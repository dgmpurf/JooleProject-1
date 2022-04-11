package com.Joole.demo.Repository;

import com.Joole.demo.Entity.ProjectProduct;
import com.Joole.demo.Entity.ProjectProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProjectProductRepository
        extends JpaRepository<ProjectProduct, ProjectProductId> {

}
