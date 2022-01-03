package com.willliammb.sale.register.database

import com.willliammb.sale.register.model.Stock
import org.springframework.data.repository.CrudRepository

interface StockRepository: CrudRepository<Stock, Long> {
}
