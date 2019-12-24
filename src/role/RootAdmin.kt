package role

import `interface`.RoleOperation


/**
 * 系统管理员  有A权限
 */

class RootAdmin(roleName : String) : RoleOperation
{
    var roleNameValue = roleName

    override fun op(): String {

        return roleNameValue + " : " + "Has A permission"
    }

}