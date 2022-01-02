package com.willliammb.sale.sale.model

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Positive

class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var ordCdOrder: Int = 0

    var ordCdClient: Int = 0

    var ordCdEmployee: Int = 0

    @Positive
    var ordVlValue: Double = 0.0
}
