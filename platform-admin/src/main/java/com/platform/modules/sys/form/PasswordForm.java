/*
 * 项目名称:platform-plus
 * 类名称:PasswordForm.java
 * 包名称:com.platform.modules.sys.form
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04          初版完成
 *
 * Copyright (c) 2019-2019 软件
 */
package com.platform.modules.sys.form;

import lombok.Data;

/**
 * 密码表单
 *
 * @author
 */
@Data
public class PasswordForm {
    /**
     * 原密码
     */
    private String password;
    /**
     * 新密码
     */
    private String newPassword;
}
