package com.willliammb.sale.register.database

import com.willliammb.sale.register.model.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository: CrudRepository<Product, Long> {
}
