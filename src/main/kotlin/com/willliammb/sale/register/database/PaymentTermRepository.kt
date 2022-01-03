package com.willliammb.sale.register.database

import com.willliammb.sale.register.model.PaymentTerm
import org.springframework.data.repository.CrudRepository

interface PaymentTermRepository: CrudRepository<PaymentTerm, Long> {
}
