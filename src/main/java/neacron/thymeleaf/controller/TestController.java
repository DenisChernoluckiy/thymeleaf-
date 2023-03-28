package neacron.thymeleaf.controller;

import neacron.thymeleaf.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {

    @GetMapping("/")
    public String getHtml(Model model) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Apple", new Date(), "The greatest green apple", "$10", "https://healthiersteps.com/wp-content/uploads/2021/12/green-apple-benefits.jpeg"));
        items.add(new Item("Orange", new Date(), "The sweetest orange", "$12", "https://media.istockphoto.com/id/185284489/photo/orange.jpg?s=612x612&w=0&k=20&c=m4EXknC74i2aYWCbjxbzZ6EtRaJkdSJNtekh4m1PspE="));
        items.add(new Item("Bananas", new Date(), "The yellowest bananas", "$8", "https://www.bobtailfruit.co.uk/pub/media/mageplaza/blog/post/4/2/42e9as7nataai4a6jcufwg.jpeg"));
        items.add(new Item("Toalettpapper", new Date(), "The softest toalettpapper", "129,99 рябчиков", "https://imgproxy.sbermarket.ru/imgproxy/size-1646-1646/aHR0cHM6Ly9pbWdwcm94eS5zYmVybWFya2V0LnJ1L2ltZ3Byb3h5L3dpZHRoLWF1dG8vY3pNNkx5OWpiMjUwWlc1MExXbHRZV2RsY3kxd2NtOWtMM0J5YjJSMVkzUnpMemN3TmpJeEwyOXlhV2RwYm1Gc0x6RXZNakF5TXkwd01pMHlNVlF3TnlVelFUSTNKVE5CTkRNdU5qUTFOVGswSlRKQ01EQWxNMEV3TUM4M01EWXlNVjh4TG1wd1p3PT0uanBn.png"));
        items.add(new Item("Milk", new Date(), "The whitest milk", "74,99 рябчиков", "https://imgproxy.sbermarket.ru/imgproxy/size-1646-1646/aHR0cHM6Ly9pbWdwcm94eS5zYmVybWFya2V0LnJ1L2ltZ3Byb3h5L3dpZHRoLWF1dG8vY3pNNkx5OWpiMjUwWlc1MExXbHRZV2RsY3kxd2NtOWtMM0J5YjJSMVkzUnpMekV3TVRneEwyOXlhV2RwYm1Gc0x6RXZNakF5TWkwd09DMHlNMVF3TWlVelFURXlKVE5CTlRZdU56WTBNREF3SlRKQ01EQWxNMEV3TUM4eE1ERTRNVjh4TG1wd1pXYz0uanBlZw.png"));

        model.addAttribute("items", items);
        return "index";
    }
}
