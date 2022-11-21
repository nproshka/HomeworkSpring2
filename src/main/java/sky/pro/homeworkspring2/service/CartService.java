package sky.pro.homeworkspring2.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@SessionScope //Немного не понял получится ли сделать это просто через Scope("prototype"), потому что когда так делаю, в 2х бразуерах всё равно 1 и тот же Set
//я так полагаю нужно, чтобы список создавался через конструктор и тогда будет работать?? или всё таки я правильно сделала через SessionScope?
public class CartService {

    private final Set<Integer> cart = new HashSet<>();


    public Set<Integer> getCart() {
        return cart;
    }

    public void addPurchase(List<Integer> ids) {
        cart.addAll(ids);
    }




}
