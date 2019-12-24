import `interface`.RoleOperation
import role.NormalRole
import role.OrderAdmin
import role.RootAdmin

class RoleFactory{

    var roleOperationMap = mutableMapOf<String,RoleOperation>()

    //在初始化中聚合所有情况
    init {
        roleOperationMap.put(Constants.Role().ROLE_ROOT_ADMIN,RootAdmin(Constants.Role().ROLE_ROOT_ADMIN))
        roleOperationMap.put(Constants.Role().ROLE_ORDER_ADMIN,OrderAdmin(Constants.Role().ROLE_ORDER_ADMIN))
        roleOperationMap.put(Constants.Role().ROLE_NORMAL,NormalRole(Constants.Role().ROLE_NORMAL))
    }


    fun getOp(roleName : String) : RoleOperation{
        return roleOperationMap.getValue(roleName)
    }
}