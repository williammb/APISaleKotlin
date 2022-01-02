package com.willliammb.sale.register.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var cusCdCustomer: Int = 0

    var cusDsCustomer: String = ""
}
