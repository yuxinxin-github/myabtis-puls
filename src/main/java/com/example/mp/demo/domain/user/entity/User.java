package com.example.mp.demo.domain.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends Model<User> {

    private Long id;
    private String userName;
    @TableField(select = false)
    private String password;

    @TableField("name")
    private String realName;
    private Integer age;

    private String email;

    @TableField(exist = false)
    private String address;

}