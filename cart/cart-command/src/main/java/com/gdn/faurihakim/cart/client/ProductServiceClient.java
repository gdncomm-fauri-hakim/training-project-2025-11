package com.gdn.faurihakim.cart.client;

import com.blibli.oss.backend.common.model.response.Response;
import com.gdn.faurihakim.cart.client.model.GetProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "product-service", url = "${product.service.url}")
public interface ProductServiceClient {

    @GetMapping("/api/products")
    Response<GetProductResponse> getProduct(@RequestParam("productId") String productId);
}
