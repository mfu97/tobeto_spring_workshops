package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("api/products")
    public class ProductsController {

        @GetMapping("/get")
        public String getProducts(){
            return "Product List";
        }
        @PostMapping("/add")
        public String postProduct(){
            return "Added New Product";
        }

        @PutMapping("/update")
        public String putProduct(){
            return "Updated Product";
        }

        @DeleteMapping("/delete")
        public String deleteProduct(){
            return "Deleted Product";
        }
}
