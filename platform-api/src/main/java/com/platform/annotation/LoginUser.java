/*
 * 项目名称:platform-plus
 * 类名称:LoginUser.java
 * 包名称:com.platform.modules.app.annotation
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04          初版完成
 *
 * Copyright (c) 2019-2019 软件
 */
package com.platform.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 登录用户信息
 *
 * @author
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {

}
