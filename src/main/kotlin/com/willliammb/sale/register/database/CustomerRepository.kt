package com.willliammb.sale.register.database

import com.willliammb.sale.register.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<Customer, Long> {
}
