package com.willliammb.sale.register.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.PositiveOrZero

@Entity
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var proCdProduct: Int = 0

    var proDsProduct: String = ""

    var proCdProductGroup: Int = 0

    @PositiveOrZero
    var proVlCust: Double = 0.0

    @PositiveOrZero
    var proVlPrice: Double = 0.0

    var proVlAmount: Double = 0.0

}
