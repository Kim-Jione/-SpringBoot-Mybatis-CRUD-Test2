package site.metacoding.firstapp.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.orders.OrdersDao;
import site.metacoding.firstapp.domain.product.Product;
import site.metacoding.firstapp.domain.product.ProductDao;
import site.metacoding.firstapp.service.ProductService;

@RequiredArgsConstructor
@Controller
public class ProductController {
	private final ProductService productService;
	private final ProductDao productDao;
	private final OrdersDao buyDao;
	private final HttpSession session;

	// 상품 목록 페이지
	@GetMapping({ "/listForm", "/" })
	public String list(Model model) {
		List<Product> product = productDao.findAll();
		model.addAttribute("product", product);
		return "product/listForm";
	}

	// 상품 상세보기 페이지
	@GetMapping("/product/{productId}")
	public String detail(@PathVariable Integer productId, Model model) {
		model.addAttribute("detail", productDao.findById(productId));
		return "product/detailForm";
	}

	// 구매목록 페이지
	@GetMapping("/buyList")
	public String buyList() {
		return "buy/historyForm";
	}

}