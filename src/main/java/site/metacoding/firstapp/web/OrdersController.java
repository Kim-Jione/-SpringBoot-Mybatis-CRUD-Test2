package site.metacoding.firstapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.orders.OrdersDao;
import site.metacoding.firstapp.domain.users.Users;

@RequiredArgsConstructor
@Controller
public class OrdersController {

	private final OrdersDao ordersDao;
	private final HttpSession session;

	@GetMapping("orders/ordersList")
	public String ordersList(Model model) {
		Users userPS = (Users) session.getAttribute("principal");
		model.addAttribute("orderList", ordersDao.findAll(userPS.getUsersId()));
		System.out.println(userPS.getUsersId());	
		return "orders/historyForm";
	}
}
