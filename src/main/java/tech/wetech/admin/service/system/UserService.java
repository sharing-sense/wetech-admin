package tech.wetech.admin.service.system;

import tech.wetech.admin.common.base.PageResultSet;
import tech.wetech.admin.common.exception.BizException;
import tech.wetech.admin.model.system.entity.User;
import tech.wetech.admin.model.system.response.UserDto;

import java.util.List;
import java.util.Set;

public interface UserService {

    PageResultSet<UserDto> findByPage(User user);

    /**
     * 创建用户
     * @param user
     */
    int createUser(User user) throws BizException;

    int updateUser(User user);

    void deleteUser(Long userId);

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    void changePassword(Long userId, String newPassword);


    User findOne(Long userId);

    List<User> findAll();

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    Set<String> findRoles(String username);

    /**
     * 根据用户名查找其权限
     * @param username
     * @return
     */
    Set<String> findPermissions(String username);

}