package com.willliammb.sale.register.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var stcCdStock: Int = 0

    var stcDsStock: String = ""
}
