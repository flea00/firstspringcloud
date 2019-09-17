package org.flea.provider.service;

import org.flea.provider.bean.Student;

import java.util.Collection;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/14 20:04
 * @Description: org.flea.provider.service
 * @version: 1.0
 */
public interface StudentService {
    Collection<Student> findAll();

    Student getById(long id);

    Integer update(Student student);

    Integer insert(Student student);

    Integer deleteById(long id);

}
