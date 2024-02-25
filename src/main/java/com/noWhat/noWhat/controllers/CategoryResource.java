package com.noWhat.noWhat.controllers;

import com.noWhat.noWhat.Entities.Category;
import com.noWhat.noWhat.Services.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories", produces = "application/json")
//@Tag(name= "Rest API")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @Operation(summary = "Return every Category that has", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return Category with success")
    })
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Operation(summary = "Return Category by ID", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return Category with success")
    })
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category cat = service.findById(id);
        return ResponseEntity.ok().body(cat);
    }
}
