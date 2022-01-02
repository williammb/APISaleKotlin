package com.willliammb.sale.register.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class ProductGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var pgrCdProductGroup: Int = 0

    var pgrDsProductGroup: String = ""
}
