package com.willliammb.sale.sale.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Positive

@Entity
class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var oriCdOrderPayment: Int = 0

    var oriCdOrder: Int = 0

    var oriCdProduct: Int = 0

    @Positive
    var oriVlValue: Double = 0.0

    @Positive
    var oriVlAmount: Double = 0.0
}
