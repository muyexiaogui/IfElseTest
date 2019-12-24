import `interface`.RoleOperation

enum class RoleEnum : RoleOperation {

    ROLE_ROOT_ADMIN {
        override fun op(): String {
            return Constants.Role().ROLE_ROOT_ADMIN + " : " + "has  A Permisiion"
        }
    },
    ROLE_ORDER_ADMIN {
        override fun op(): String {
            return Constants.Role().ROLE_ORDER_ADMIN + " : " + "has B permission"
        }
    },
    ROLE_NORMAL {
        override fun op(): String {
            return Constants.Role().ROLE_NORMAL + " : " + "has C permission"
        }
    }

}