package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Product;
import com.cdac.dto.Admin;
import com.cdac.dto.Users;
import com.cdac.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productServices;
	
	@RequestMapping("/AddProduct_Form")
	public String showform3() {
		
		return "AddProduct_Form";
		
		
	}
	
	@RequestMapping(path = "/addproduct",method = RequestMethod.POST)
	public String AddProduct(Product product,HttpSession session) {
		int adminId = ((Admin)session.getAttribute("adminlogin")).getAdminId();
		product.setAdminId(adminId);
		productServices.addProduct(product);
		return "Adminhome";
		
	}
	
		
	@RequestMapping(path= "/showProduct",method = RequestMethod.GET)
	public String AllProduct(ModelMap map,HttpSession session) {
		int adminId = ((Admin)session.getAttribute("adminlogin")).getAdminId();
		System.out.println(adminId);
        List<Product> li = productServices.selectAll();
        
        for(Product p : li)
        {
		System.out.println(p);
        }
        map.put("productlist",li);
		return "Product_listForm";

	
		
	}
	@RequestMapping(value = "/Product_delete",method = RequestMethod.GET)
	public String productDelete(@RequestParam int productId,ModelMap map,HttpSession session) {
		
		productServices.removeProduct(productId); 
		
		int adminId = ((Admin)session.getAttribute("adminlogin")).getAdminId();
        List<Product> li = productServices.selectAll();
		map.put("productlist", li);
		return "Product_listForm";
	}
	
	@RequestMapping(path = "/Update_Form",method = RequestMethod.GET)
	public String expenseUpdateForm(@RequestParam int productId,ModelMap map) {
		
		Product pro = productServices.findProduct(productId);
		map.put("product", pro);
		
		return "Update_Form";
	}
	
	
	
	@RequestMapping(path = "/updateproduct.htm",method = RequestMethod.POST)
	public String productUpdate(Product product,ModelMap map,HttpSession session) {
		
		int adminId = ((Admin)session.getAttribute("adminlogin")).getAdminId();
		product.setAdminId(adminId);
		productServices.modifyProduct(product);
			
        List<Product> li = productServices.selectAll();
		map.put("productlist", li);
		return "Product_listForm";
	}

	
	
	@RequestMapping(path= "/showProductuser",method = RequestMethod.GET)
	public String AllProduct1(ModelMap map,HttpSession session) {
        List<Product> li = productServices.selectAll();

        for(Product p : li)
        {
		System.out.println(p);
        }
        map.put("productlist1",li);
		return "Product_listForm_User";

	
		
	}

}