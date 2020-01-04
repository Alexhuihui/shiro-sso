package top.alexmmd.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.alexmmd.core.entity.SysMenuEntity;

import java.util.List;

/**
 * @Description 权限业务接口
 * @Author Alex
 * @CreateTime 2019/6/14 15:57
 */
public interface SysMenuService extends IService<SysMenuEntity> {


    /**
     * 根据角色查询用户权限
     *
     * @Author Sans
     * @CreateTime 2019/6/19 10:14
     * @Param roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<SysMenuEntity> selectSysMenuByRoleId(Long roleId);

}

