package com.willliammb.sale.sale.database

import com.willliammb.sale.sale.model.OrderPayment
import org.springframework.data.repository.CrudRepository

interface OrderPaymentRepository: CrudRepository<OrderPayment, Long> {
}
