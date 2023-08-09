package com.core.im.modal.user;

import com.core.im.constant.CategoryEnum;
import com.core.im.constant.RoleEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_role")
@Data
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "name", nullable = false)
    private String roleName;

    @Transient
    private RoleEnum roleEnum;

    public void setRoleEnum(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
        this.roleName = roleEnum.getValue();
    }
}
