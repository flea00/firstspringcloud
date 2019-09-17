package org.flea.resttemplate.controller;

import org.flea.resttemplate.RestTemplateApplication;
import org.flea.resttemplate.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/14 21:14
 * @Description: org.flea.resttemplate.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        Collection collection = restTemplate.getForObject("http://provider/student/findAll", Collection.class);
        return collection;
    }

    @GetMapping("/getById/{id}")
    public Student findById(@PathVariable long id) {
        return restTemplate.getForObject("http://provider/student/getById/{id}", Student.class, id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://provider/student/update", student);
    }

    @PostMapping("/insert")
    public Integer insert(@RequestBody Student student) {
        return restTemplate.postForObject("http://provider/student/insert", student, Integer.class);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable long id) {
        restTemplate.delete("http://provider/student/deleteById/{id}", id);
    }

    @GetMapping("/getPort")
    public String getPort() {
        return restTemplate.getForObject("http://provider/student/getPort", String.class);
    }
}
