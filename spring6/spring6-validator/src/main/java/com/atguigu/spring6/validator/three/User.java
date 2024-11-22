package com.atguigu.spring6.validator.three;

import com.atguigu.spring6.validator.four.CannotBlank;
import jakarta.validation.constraints.*;

public class User {
    @NotNull
    private String name;
    @Min(0)
    @Max(100)
    private int age;

    @Pattern(regexp = "^1(3|4|7|8)\\d{9}",message = "请输入正确格式")
    @NotBlank(message = "手机号不能为空")
    private String phone;

    @CannotBlank
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
