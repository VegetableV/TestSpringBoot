package com.exception.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor@NoArgsConstructor
public class Guest {

    @NotBlank(message = "{guest.name.notblank}")//另一个文件的文件名不能写错
    private String name;
    @NotBlank(message = "role is null")
    private String role;

}
