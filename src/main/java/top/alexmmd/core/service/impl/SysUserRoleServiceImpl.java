package top.alexmmd.core.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.alexmmd.core.dao.SysUserRoleDao;
import top.alexmmd.core.entity.SysUserRoleEntity;
import top.alexmmd.core.service.SysUserRoleService;

/**
 * @Description 用户与角色业务实现
 * @Author Alex
 * @CreateTime 2019/6/14 15:57
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

}