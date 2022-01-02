package com.willliammb.sale.register.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var empCdEmployee: Int = 0

    var empDsEmployee: String = ""
}
