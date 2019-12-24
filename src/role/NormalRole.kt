package role

import `interface`.RoleOperation


/**
 * 普通用户  有C权限
 */
class NormalRole(roleName : String): RoleOperation {
    var roleNamevalue = roleName

    override fun op(): String {
        return roleNamevalue + " : " + "has C permisiion"
    }

}