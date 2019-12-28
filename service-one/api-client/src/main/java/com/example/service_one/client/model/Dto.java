/*
 * 服务1接口地址 API SPECIFICATION
 * Service one api
 *
 * OpenAPI spec version: v1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.service_one.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Dto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-28T23:04:14.652+08:00")
public class Dto {
    @JsonProperty("age")
    private Integer age = null;

    @JsonProperty("gender")
    private String gender = null;

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("name")
    private String name = null;

    public Dto age(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * 年龄
     *
     * @return age
     **/
    @ApiModelProperty(value = "年龄")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dto gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * 性别
     *
     * @return gender
     **/
    @ApiModelProperty(value = "性别")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     *
     * @return id
     **/
    @ApiModelProperty(value = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     *
     * @return name
     **/
    @ApiModelProperty(value = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dto dto = (Dto) o;
        return Objects.equals(this.age, dto.age) &&
                Objects.equals(this.gender, dto.gender) &&
                Objects.equals(this.id, dto.id) &&
                Objects.equals(this.name, dto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, gender, id, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dto {\n");

        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
