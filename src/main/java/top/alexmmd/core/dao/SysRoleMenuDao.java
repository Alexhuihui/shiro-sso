package top.alexmmd.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.alexmmd.core.entity.SysRoleMenuEntity;

/**
 * @Description 角色权限关系DAO
 * @Author Sans
 * @CreateTime 2019/6/14 15:57
 */

@Mapper
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {

}
