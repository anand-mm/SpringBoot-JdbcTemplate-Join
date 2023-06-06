package com.codeforyou.springjdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Repo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    String JOIN_QUERY = "SELECT wi.id,wi.tendertitle,pc.name as productcategory "
            + "FROM gep_tender_work_items wi "
            + "JOIN gep_product_category pc ON pc.id = wi.productcategory "
            + "limit 10 ";

    // System.out.println(JOIN_QUERY);

    public List<Model> getTestData() {
        return jdbcTemplate.query(JOIN_QUERY, new BeanPropertyRowMapper<Model>(Model.class));
    }

}
