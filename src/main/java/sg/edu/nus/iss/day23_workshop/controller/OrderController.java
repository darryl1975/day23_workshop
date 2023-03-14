package sg.edu.nus.iss.day23_workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.MergedAnnotations.Search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.day23_workshop.payload.SearchRequest;
import sg.edu.nus.iss.day23_workshop.service.OrderRestTemplateService;

@Controller
@RequestMapping("/orders")
public class OrderController {
    
    @Autowired
    OrderRestTemplateService orts;

    @GetMapping
    public String searchOrder(Model model) {
        SearchRequest sr = new SearchRequest();
        model.addAttribute("searchObject", sr);

        return "searchorder";
    }
}
