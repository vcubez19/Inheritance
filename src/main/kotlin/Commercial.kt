
// Commercial class: Customer
class Commercial(private var propertyName: String,
                 private var constantRate: Float,
                 private var multipleProperties: Boolean,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double): Customer(customerName, customerPhone, customerAddress, squareFootage) {


    fun calculate() {

        // Total
        var total = (this.squareFootage / 1000) * constantRate


        // Applying 10% discount if multiple properties
        if ( this.multipleProperties ) {
            total -= total / 10
        }


        println("\n----Quote----")
        println("Property name: ${this.propertyName}")
        println("Constant rate: $${String.format("%,.2f", this.constantRate)} per 1,000 square feet")
        println("Has multiple properties: ${this.multipleProperties}")
        println("Name: ${this.customerName}")
        println("Phone: ${this.customerPhone}")
        println("Address: ${this.customerAddress}")
        println("Type of customer: Commercial")
        println("The weekly charge is $${String.format("%,.2f", total)}\n")


    }


}

