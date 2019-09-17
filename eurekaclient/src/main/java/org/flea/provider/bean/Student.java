package org.flea.provider.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/14 16:23
 * @Description: org.flea.provider.bean
 * @version: 1.0
 */
@Data
public class Student {
    @TableId
    private long id;
    private String name;
    private int age;
}
