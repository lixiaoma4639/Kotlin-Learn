package 第三章

/**
 * 日期 : 2020/10/20.
 * 创建 : xin.li
 * 描述 :
 *
 */

class User(val id: Int , val name : String , val address : String)

/**
 * 局部函数的使用
 */
fun saveUser2Db(user: User){
    fun validate(value : String , filedName : String){
        if (value.isEmpty()){
            throw IllegalArgumentException("不能保存user, ${user.id} : $filedName 是空的...")
        }
    }

    validate(user.name , "name")
    validate(user.address , "address")
}

/**
 * user的扩展函数中使用局部函数
 */
fun User.validateBeforSave(){
    fun validate(value : String , filedName : String){
        if (value.isEmpty()){
            //此处的$id 相当于${this.id}
            throw IllegalArgumentException("不能保存user, $id : $filedName 是空的...")
        }
    }

    validate(name , "name")
    validate(address , "address")
}
fun saveUser(user: User){
    user.validateBeforSave()
}


fun main() {
    saveUser2Db(User(1 , "李鑫" , "北京"))
//    saveUser2Db(User(1 , "张三" , ""))
    saveUser(User(1 , "李四" , ""))
}