package com.willliammb.sale.administration.database

import com.willliammb.sale.administration.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {

}
