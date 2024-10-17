package com.GCP_CRUD_RestAPI.model;

import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name = "student")
@Data
@AllArgsConstructor
public class Student {
    @PrimaryKey
    private String docid;
    private String name;
}
