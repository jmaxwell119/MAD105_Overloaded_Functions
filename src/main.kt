
fun customerInfo(contactName: String, phoneNumber: String): String{
    var ans = contactName + ", " + phoneNumber
    return ans
}

fun customerInfo(businessName: String, contactName: String, phoneNumber: String): String{
    var ans = businessName + ", " + contactName + ", " + phoneNumber
    return ans
}

fun main(){
    println("Enter a number to select customer type")
    do{
        println("1. Residential customer")
        println("2. Business customer")
        println("3. exit")
        print("Enter a number to select the customer type: ")
        var answer = readLine()!!.toInt()
        if (answer == 1){
            print("Enter customer name: ")
            var contactName = readLine()!!
            print("Enter customer phone number: ")
            var phoneNumber = readLine()!!
            println(customerInfo(contactName, phoneNumber))
        }
        else if (answer == 2){
            print("Enter business name: ")
            var businessName = readLine()!!
            print("Enter customer name: ")
            var contactName = readLine()!!
            print("Enter customer phone number: ")
            var phoneNumber = readLine()!!
            println(customerInfo(businessName, contactName, phoneNumber))
        }
    }while(answer != 3)

}