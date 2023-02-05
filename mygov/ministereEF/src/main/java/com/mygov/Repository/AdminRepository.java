package com.mygov.Repository;

import com.mygov.models.Admin;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends ElasticsearchRepository<Admin, String> {

        }
