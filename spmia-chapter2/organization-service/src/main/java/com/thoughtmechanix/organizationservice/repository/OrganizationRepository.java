package com.thoughtmechanix.organizationservice.repository;

import com.thoughtmechanix.organizationservice.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrganizationRepository extends CrudRepository<Organization,String> {
    public Organization findById(String organizationId);
}
