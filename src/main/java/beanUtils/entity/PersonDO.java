package beanUtils.entity;

import lombok.Data;

import java.util.Date;
@Data
public class PersonDO {
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;

}
