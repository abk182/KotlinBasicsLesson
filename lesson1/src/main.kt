import people.user.User
import people.SaySmth
import people.admin.Admin


fun main (args: Array<String>) {
    var user1 = User("Ivan", 12)

    print(user1.name)
    if (user1.works) println(" works") else println(" doesn't work")

    user1.works = true


    SaySmth()
    var admin = Admin()
    admin.SayAdmin();
}