package com.willliammb.sale.register.database

import com.willliammb.sale.register.model.Employee
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository: CrudRepository<Employee, Long> {
}
