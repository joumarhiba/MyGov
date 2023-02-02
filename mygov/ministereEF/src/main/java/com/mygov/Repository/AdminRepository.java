package com.mygov.Repository;

import com.mygov.models.Admin;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AdminRepository extends ElasticsearchRepository<Admin, String> {

        }
