package top.alexmmd.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.alexmmd.core.entity.SysUserRoleEntity;

/**
 * @Description 用户与角色关系DAO
 * @Author Alex
 * @CreateTime 2019/6/14 15:57
 */

@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {

}
