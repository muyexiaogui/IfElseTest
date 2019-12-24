import `interface`.RoleOperation

class RoleContext(operation : RoleOperation){

    //根据传入的策略对象，执行不同的逻辑对象
    var operationValue = operation

    fun execute() : String{
        return operationValue.op()
    }
}