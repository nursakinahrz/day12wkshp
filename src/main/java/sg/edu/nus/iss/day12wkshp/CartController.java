package sg.edu.nus.iss.day12wkshp;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//it is case sensitive - no space after 'cart'
@RequestMapping(path = { "/cart"})
public class CartController {
    
    @GetMapping(produces = { "text/html"})
    public String displayCart(Model model) {
        CartService cs = new CartService();
        List<Item> cartItems = cs.getShoppingItems();
        model.addAttribute("cart", cartItems);
        

        return "cart";   
     }
}
