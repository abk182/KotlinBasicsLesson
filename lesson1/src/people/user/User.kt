package people.user

class User(var name: String, private var age: Byte) {

    var works: Boolean = false
        get(){
            return age>18 && age<55
        }
        set(value){
            if(value){
                println("yes")
            }
            field = value
        }
}