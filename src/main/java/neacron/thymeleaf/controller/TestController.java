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
        items.add(new Item("Big dead piggy", new Date(), "The saddest dead pig", "$8", "https://images.twinkl.co.uk/tr/image/upload/t_illustration/illustation/dead-pig.png"));
        items.add(new Item("Big dead piggy", new Date(), "The happiest dead pig", "$8", "https://live.staticflickr.com/3659/3702924755_cf3b188bf8_b.jpg"));
        items.add(new Item("Bislan", new Date(), "The prettiest java-developer", "$0", "https://s00.yaplakal.com/pics/pics_original/7/3/3/6690337.jpg"));
        items.add(new Item("Bislan", new Date(), "The scariest  java-developer", "$0", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Osama_bin_Laden_portrait.jpg/250px-Osama_bin_Laden_portrait.jpg"));
        items.add(new Item("Bislan", new Date(), "The dangerous java-developer", "$0", "https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/51y8GUVKJoL._AC_UF894,1000_QL80_.jpg"));
        items.add(new Item("Andrey", new Date(), "The strongest java-developer", "$1337", "https://s3.yandexcloud.net/zulip-avatars/7/9adb1924eb5df0a1185c8f1e2ea02d02a22244d4?version=1&s=50"));
        items.add(new Item("Misha", new Date(), "The strongest mentor", "$1337", "https://s3.yandexcloud.net/zulip-avatars/7/bb3e1698bd1de913dfef0c7a90f200a54198cf85?version=1&s=50"));
        items.add(new Item("Murad", new Date(), "The strongest screening interviewer", "$1337", "https://s3.yandexcloud.net/zulip-avatars/7/9fbb9d7947906d0b52ac8be41cea151ed6f93a45?version=1&s=50"));
        items.add(new Item("Toalettpapper", new Date(), "The softest toalettpapper", "129,99 рябчиков", "https://imgproxy.sbermarket.ru/imgproxy/size-1646-1646/aHR0cHM6Ly9pbWdwcm94eS5zYmVybWFya2V0LnJ1L2ltZ3Byb3h5L3dpZHRoLWF1dG8vY3pNNkx5OWpiMjUwWlc1MExXbHRZV2RsY3kxd2NtOWtMM0J5YjJSMVkzUnpMemN3TmpJeEwyOXlhV2RwYm1Gc0x6RXZNakF5TXkwd01pMHlNVlF3TnlVelFUSTNKVE5CTkRNdU5qUTFOVGswSlRKQ01EQWxNMEV3TUM4M01EWXlNVjh4TG1wd1p3PT0uanBn.png"));
        items.add(new Item("Milk", new Date(), "The whitest milk", "74,99 рябчиков", "https://imgproxy.sbermarket.ru/imgproxy/size-1646-1646/aHR0cHM6Ly9pbWdwcm94eS5zYmVybWFya2V0LnJ1L2ltZ3Byb3h5L3dpZHRoLWF1dG8vY3pNNkx5OWpiMjUwWlc1MExXbHRZV2RsY3kxd2NtOWtMM0J5YjJSMVkzUnpMekV3TVRneEwyOXlhV2RwYm1Gc0x6RXZNakF5TWkwd09DMHlNMVF3TWlVelFURXlKVE5CTlRZdU56WTBNREF3SlRKQ01EQWxNMEV3TUM4eE1ERTRNVjh4TG1wd1pXYz0uanBlZw.png"));
        items.add(new Item("Java skills", new Date(), "This product not for losers as you", "Priceless рябчиков", "https://www.comnews.ru/sites/default/files2019/articles/2021-02/Java.jpg"));
        items.add(new Item("Spring's dad", new Date(), "Batya of spring", "Priceless $", "https://images.ctfassets.net/oxjq45e8ilak/39hFvyKKjeuuuGi0sMcky8/6e8931c1532ea81a2b49c6d535eca770/juergen_hoeller_2017__1_.jpg?w=300"));

        model.addAttribute("items", items);
        return "index";
    }
}
