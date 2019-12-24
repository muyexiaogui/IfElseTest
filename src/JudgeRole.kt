import `interface`.RoleOperation

class JudgeRole
{
    /**
     * 使用if-else方法
     */
    fun judgeUseIfElse(roleName : String) : String
    {
        var result : String = ""
        if(roleName.equals(Constants.Role().ROLE_ROOT_ADMIN)) {
            result = Constants.Role().ROLE_ROOT_ADMIN + " : " + "has A permisiion"
        }else if (roleName.equals(Constants.Role().ROLE_ORDER_ADMIN)) {
            result = Constants.Role().ROLE_ORDER_ADMIN + " : " + "has B permission"
        }else if(roleName.equals(Constants.Role().ROLE_NORMAL)) {
            result = Constants.Role().ROLE_NORMAL + " : " + "has C permission"
        }else{
            result = "visitor user"
        }
        return result
    }

    /**
     * 使用枚举方法
     */
    fun judgeUserEnum(roleName : String) : String
    {
        return RoleEnum.valueOf(roleName).op()
    }

    /**
     *  使用工厂模式
     */
    fun judgeUsefactory(roleName: String) : String
    {
        return RoleFactory().getOp(roleName).op()
    }

    /**
     * 使用策略模式
     */
    fun judgeUseContext(operation: RoleOperation) : String
    {
        return RoleContext(operation).execute()
    }



}