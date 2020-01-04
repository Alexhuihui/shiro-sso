package top.alexmmd.core.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.alexmmd.core.dao.SysRoleMenuDao;
import top.alexmmd.core.entity.SysRoleMenuEntity;
import top.alexmmd.core.service.SysRoleMenuService;

/**
 * @Description 角色与权限业务实现
 * @Author Alex
 * @CreateTime 2019/6/14 15:57
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}