fun main() {


    // Main loop with menu
    do {

        // Variable for ending loop
        var endLoop = false


        println("\n1) Residential customer")
        println("2) Commercial customer")
        println("3) Done\n")


        // Getting user's choice
        print("Please enter the number of your choice:  ")


        // Response to action
        when (readLine()!!.toInt()) {
            !in 1..3 -> println("Choice out of range")
            1 -> constructResidentialCustomer()
            2 -> constructCommercialCustomer()
            3 -> endLoop = true
            else -> println("Unknown choice")
        }


        // End loop if 3
    } while (!endLoop)
    println("Have a nice day!")


}


/*
    Function to collect universal customer data
    whether residential or commercial
 */
fun constructCustomer(): Customer {


    println("\nPlease enter your name:  ")
    val name = readLine()!!.toString()

    println("Please enter your phone number:  ")
    val phoneNumber = readLine()!!.toString()

    println("Please enter your address:  ")
    val address = readLine()!!.toString()

    println("Please enter the square footage of your property:  ")
    val squareFootage = readLine()!!.toDouble()

    // Returning a Customer object with input data
    return Customer(name, phoneNumber, address, squareFootage)


}


fun constructResidentialCustomer() {

    // Instantiating the customer collected before
    val customer = constructCustomer()

    // Declaring a Residential object
    val finalCustomer: Residential


    // Unique question for Residential customers
    println("Are you a senior citizen?:  Y/N")


    // If senior, create class specifying so and assign to finalCustomer
    when (readLine()!!.toString().lowercase()) {
        "y" -> {
            finalCustomer = Residential(6F,
                true,
                customer.customerName,
                customer.customerPhone,
                customer.customerAddress,
                customer.squareFootage)


            // Give them their final quote
            finalCustomer.calculate()

        }
        // Create class if not senior specifying so
        "n" -> {
            finalCustomer = Residential(6F,
                false,
                customer.customerName,
                customer.customerPhone,
                customer.customerAddress,
                customer.squareFootage)


            finalCustomer.calculate()


        }
        else -> println("Unknown option")


    }


}


fun constructCommercialCustomer() {

    val customer = constructCustomer()

    // This time, a Commercial object
    val finalCustomer: Commercial


    // Unique question for Commercial customer
    println("Please enter your property name:  ")
    val propertyName = readLine()!!.toString()


    println("Do you have multiple properties?:  Y/N")


    // Fill out specified information
    when (readLine()!!.toString().lowercase()) {
        "y" -> {
            finalCustomer = Commercial(
                propertyName,
                5F,
                true,
                customer.customerName,
                customer.customerPhone,
                customer.customerAddress,
                customer.squareFootage
            )


            // Final quote
            finalCustomer.calculate()

        }
        "n" -> {
            finalCustomer = Commercial(
                propertyName,
                5F,
                false,
                customer.customerName,
                customer.customerPhone,
                customer.customerAddress,
                customer.squareFootage
            )


            finalCustomer.calculate()


        }
        else -> println("Unknown option")


    }


}

