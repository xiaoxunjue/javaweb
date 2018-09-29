package com.revenant.javaweb.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Table(name = "girl")
public class Girl {
    @Id
    private Long id;
    private Long age;
    private String name;
}
