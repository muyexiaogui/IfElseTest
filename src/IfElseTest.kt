import role.RootAdmin

fun main(args: Array<String>) {

    //If Else方式
    var s1: String = JudgeRole().judgeUseIfElse(Constants.Role().ROLE_ROOT_ADMIN)
    println(s1)

    //枚举方式
    var s2: String = JudgeRole().judgeUserEnum(Constants.Role().ROLE_ORDER_ADMIN)
    println(s2)

    var s3 = JudgeRole().judgeUsefactory(Constants.Role().ROLE_NORMAL)
    println(s3)

    var s4 =JudgeRole().judgeUseContext(RootAdmin(Constants.Role().ROLE_ROOT_ADMIN))
    println(s4)

}