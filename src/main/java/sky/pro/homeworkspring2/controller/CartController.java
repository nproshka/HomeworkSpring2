package sky.pro.homeworkspring2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.homeworkspring2.service.CartService;

import java.util.List;
import java.util.Set;

@RestController
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/store/order/add")
    public void addPurchase (@RequestParam List<Integer> ids) {
        cartService.addPurchase(ids);
    }
    @GetMapping("/store/order/get")
    public Set<Integer> getCart () {
        return cartService.getCart();
    }
}
