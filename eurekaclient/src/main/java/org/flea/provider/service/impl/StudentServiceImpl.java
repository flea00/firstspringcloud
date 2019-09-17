package org.flea.provider.service.impl;

import org.flea.provider.bean.Student;
import org.flea.provider.dao.StudentDao;
import org.flea.provider.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/14 20:05
 * @Description: org.flea.provider.service.impl
 * @version: 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Collection<Student> findAll() {
        return studentDao.selectList(null);
    }

    @Override
    public Student getById(long id) {
        return studentDao.selectById(id);
    }

    @Override
    public Integer update(Student student) {
        return studentDao.updateById(student);
    }

    @Override
    public Integer insert(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public Integer deleteById(long id) {
        return studentDao.deleteById(id);
    }
}
