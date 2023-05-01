package com.springbootdemo.springboot.login;


import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    @RequestMapping(value = "/product-list", method = RequestMethod.GET)
    String[] getAllProductList() {
        return new String[]{"ProductOne", "ProductTwo", "ProductThree"};
    }

    @RequestMapping(value = "/add-product", method = RequestMethod.POST)
    String addProduct(@RequestBody Product product) {
        return "Success";
    }

    /*
    @PostMapping("/update-product")
    String updateProduct(@RequestParam("id") String id) {
        return "Success";
    }



    @GetMapping("/")
    String home() {
        return "Hello, World!";
    }
    */
}