
// Residential class: Customer
class Residential(private var constantRate: Float,
                 private var senior: Boolean,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double): Customer(customerName, customerPhone, customerAddress, squareFootage) {


    /*
        Function that calculates total based on applicable discounts and displays
        quote with user info
     */
    fun calculate() {

        // Final total
        var total = (this.squareFootage / 1000) * constantRate


        // Applying 15% discount if senior
        if ( this.senior ) {
            total -= (total / 10) + (total / 10) / 2
        }


        println("\n----Quote----")
        println("Constant rate: $${String.format("%,.2f", this.constantRate)} per 1,000 square feet")
        println("Is a senior Citizen: ${this.senior}")
        println("Name: ${this.customerName}")
        println("Phone: ${this.customerPhone}")
        println("Address: ${this.customerAddress}")
        println("Type of customer: Residential")
        println("The weekly charge is $${String.format("%,.2f", total)}\n")


    }


}

