package com.willliammb.sale.sale.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Positive

@Entity
class OrderPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var orpCdOrderPayment: Int = 0

    var orpCdOrder: Int = 0

    var orpCdPaymentTerm: Int = 0

    @Positive
    var orpVlValue: Double = 0.0
}
