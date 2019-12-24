package role

import `interface`.RoleOperation

/**
 * 订单管理员  有B权限
 */
class OrderAdmin(roleName : String) : RoleOperation
{
    var roleNameValue  = roleName

    override fun op(): String {
       return roleNameValue + " : " + "has B permission"
    }

}