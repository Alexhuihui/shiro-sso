package top.alexmmd.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.alexmmd.core.entity.SysMenuEntity;

import java.util.List;

/**
 * @Description 权限DAO
 * @Author Alex
 * @CreateTime 2019/6/14 15:57
 */

@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

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
