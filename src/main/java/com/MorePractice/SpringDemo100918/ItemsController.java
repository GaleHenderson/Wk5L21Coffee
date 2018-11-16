package com.MorePractice.SpringDemo100918;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class ItemsController {
	
	
	@Autowired
	ItemsRepository itemRepo;
	
	@Autowired
	CartItemRepository cartitemRepo;
	
	@RequestMapping("/orderOnline")
	public ModelAndView orderOnline() {
		return new ModelAndView("orderOnline", "inventorylist", itemRepo.findAll());
	}
	
	@RequestMapping("/addToCart")
	public ModelAndView addToCart(CartItem cartitem) {
		cartitemRepo.save(cartitem);
		return new ModelAndView("checkout", "cartlist", cartitemRepo.findAll());
	}
	
}
//	
//	@RequestMapping("/search")
//	public ModelAndView searchResults(@RequestParam("itemid") Integer id) {
//		Optional<Items> test = item.findById(id);
//		return new ModelAndView("searchStuff", "results", item.findById(id));
//	}
//
//	@RequestMapping("/items")
//	public ModelAndView listItems(@RequestParam(value = "id", required = false) int id) {
//		ModelAndView mv = new ModelAndView("list-items");
//			mv.addObject("items", item.findById(id));
//			mv.addObject("id", id);
//		
//		return mv;
//	}
//
//	@RequestMapping("/addItem")
//	public ModelAndView addItems(Items thing) {
//		ModelAndView mv = new ModelAndView("list-food");
//		//item.save(thing.getName(), thing.getDescription(), thing.getQuantity(), thing.getPrice());
//		mv.addObject("food", item.findAll());
//
//		return mv;
//	}
//
//	@RequestMapping("/update")
//	public ModelAndView updateForm(@RequestParam("id") int idFromPage) {
//		return new ModelAndView("update-form", "id", idFromPage);
//	}
//
//	@RequestMapping("update-food")
//	public ModelAndView updateItems(Items updateItemslist) {
//		//item.updateItems(updateItemslist.getName(), updateItemslist.getDescription(), updateItemslist.getQuantity(), updateItemslist.getPrice());
//		return new ModelAndView("redirect:/item");
//	}
//	
//	@RequestMapping("/delete")
//	public ModelAndView remove(int id) {
//		item.deleteById(id);
//		return new ModelAndView("redirect:/item");
//	}
//
//}
