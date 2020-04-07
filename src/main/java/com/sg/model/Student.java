package com.sg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Student implements Serializable {
    @ApiModelProperty(value=" 主键ID ")
    private Integer id;

    @ApiModelProperty(value=" 名称 ")
    private String name;

    @ApiModelProperty(value=" 性别 ")
    private String sex;

    @ApiModelProperty(value=" 年龄 ")
    private Integer age;

    @ApiModelProperty(value=" 学号 ")
    private Integer number;

    @ApiModelProperty(value=" 班级 ")
    private String calss;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCalss() {
        return calss;
    }

    public void setCalss(String calss) {
        this.calss = calss;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", number=").append(number);
        sb.append(", calss=").append(calss);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}