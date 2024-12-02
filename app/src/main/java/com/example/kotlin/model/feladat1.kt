package com.example.kotlin.model

import android.text.BoringLayout

data class Order {
    val orderId: Long,
    val customer: Customer,
    val shipping: Shipping,
    val payment: Payment,
    val status: String
}

data class Customer {
    val itemId: Long,
    val productName: String,
    val quantity: Int,
    val pricePerUnit: Double,
    val discount: Double
}

data class Shipping {
    val address: Address,
    val shippingMethod: String,
    val estimatedDeliveryDays: Int
}

data class Address {
    val street: String,
    val city: String,
    val postalCode: Int,
    val country: String
}

data class Payment {
    val paymentMethod: String,
    val totalAmount: Double,
    val paid: Boolean
}


//----------------------------------------------------------

data class Projekt {
    val projectName: String,
    val subject: String,
    val durationWeeks: Int,
    val teamMembers: List<TeamMembers>,
    val assignments: List<Sssigments>,
    val completed: Boolean
}

data class TeamMembers {
    val studentId: Long,
    val name: String,
    val grade: Int,
    val hasCompleted: Boolean
}

data class Sssigments {
    val assignmentName: String,
    val maxPoints: Int,
    val studentScores: StundentScrore,
}

data class StundentScrore {
    val STU123: Int,
    val STU124: Int,
    val STU125: Int
}

//----------------------------------------------------------

data class City {
    val cityName: String,
    val transitSystem: TransitSystem
}

data class TransitSystem {
    val buses: List<Buses>
}

data class Buses {
    val routeNumber: Int,
    val routeName: String,
    val vehicles: List<Vehicles>,
    val schedule: List<Schedule>,
}

data class Vehicles {
    val vehicleId: Long,
    val capacity: Int,
    val currentLocation: List<CurrentLocation>,
    val status: String
}

data class CurrentLocation {
    val latitude: Double,
    val longitude: Double
}

data class Schedule {
    weekday: List<Weekday>
}

data class Weekday {
    
}
