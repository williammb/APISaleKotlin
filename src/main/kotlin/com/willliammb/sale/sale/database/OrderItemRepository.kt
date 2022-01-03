package com.willliammb.sale.sale.database

import com.willliammb.sale.sale.model.OrderItem
import org.springframework.data.repository.CrudRepository

interface OrderItemRepository: CrudRepository<OrderItem, Long> {
}
