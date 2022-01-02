package com.willliammb.sale.register.model

import com.willliammb.sale.register.enuns.PaymentType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PaymentTerm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var ptrCdPaymentTerm: Int = 0

    var ptrDsPaymentTerm: String = ""

    var ptrCdPaymentType: PaymentType = PaymentType.CASH
}
