package com.hwqj.springboot.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HelloComtroller {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @ResponseBody
    @RequestMapping("/query")
    public Map<String ,Object> map(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from student");
             return list.get(0);
    }
}
