package com.willliammb.sale.administration.model

import java.time.OffsetDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min

@Entity
class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var usrCdUser: Int = 0

    @Email
    var usrDsEmail: String = ""

    @Min(5)
    @Max(20)
    var usrDsLogin: String = ""

    @Min(8)
    @Max(30)
    var usrDsPassword: String = ""

    var usrTsLastLogin: OffsetDateTime = OffsetDateTime.now()
}
