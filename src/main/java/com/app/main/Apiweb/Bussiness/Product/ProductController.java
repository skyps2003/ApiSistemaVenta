package com.app.main.Apiweb.Bussiness.Product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.Apiweb.Bussiness.Product.ResponseObject.ResponseGetData;
@RestController
@RequestMapping("product")
public class ProductController {
    @GetMapping(path = "getdata")
   public ResponseEntity <ResponseGetData> getData() {
       ResponseGetData responseGetData = new ResponseGetData();
       responseGetData.codigo = "CI001";
       responseGetData.nombre = "Laptop";
       responseGetData.precio = "20.40";
       return new ResponseEntity<>(responseGetData, HttpStatus.OK);
   }
   
}