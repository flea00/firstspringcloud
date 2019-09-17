package org.flea.provider.controller;

import org.flea.provider.bean.Student;
import org.flea.provider.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/14 20:06
 * @Description: org.flea.provider.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Student getById(@PathVariable long id) {
        return studentService.getById(id);
    }

    @PutMapping("/update")
    public Integer update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @PostMapping("/insert")
    public Integer insert(@RequestBody Student student) {
        return studentService.insert(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public Integer deleteById(@PathVariable long id) {
        return studentService.deleteById(id);
    }

    @GetMapping("/getPort")
    public String getPort() {
        return this.port;
    }

}
