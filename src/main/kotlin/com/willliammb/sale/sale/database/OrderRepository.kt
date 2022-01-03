package com.willliammb.sale.sale.database

import com.willliammb.sale.sale.model.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository: CrudRepository<Order, Long> {
}
