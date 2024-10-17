package com.GCP_CRUD_RestAPI.repository;

import com.GCP_CRUD_RestAPI.model.Student;
import com.google.cloud.spring.data.spanner.repository.SpannerRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentRepo extends SpannerRepository<Student,String> {
}
