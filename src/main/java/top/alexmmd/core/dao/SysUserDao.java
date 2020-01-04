package top.alexmmd.core.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.alexmmd.core.entity.SysUserEntity;

/**
 * @Description 系统用户DAO
 * @Author Sans
 * @CreateTime 2019/6/14 15:57
 */

@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

}
