package com.willliammb.sale.administration.controller

import com.willliammb.sale.administration.dto.UserCreate
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("USER")
class UserController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody user: UserCreate) {
        TODO()
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun edit(@PathVariable id: Int, @RequestBody user: UserCreate) {
        TODO()
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun list() {
        TODO()
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    fun getUser(@PathVariable id: Int) {
        TODO()
    }


    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        TODO()
    }
}
