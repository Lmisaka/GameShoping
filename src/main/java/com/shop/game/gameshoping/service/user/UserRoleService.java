package com.shop.game.gameshoping.service.user;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: UserRoleService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/13 12:55
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/13     lijq           v1.0.0               修改原因
 */
public interface UserRoleService {

    int addUserRole(long userId);

    int delUserRole(long userId);

}
