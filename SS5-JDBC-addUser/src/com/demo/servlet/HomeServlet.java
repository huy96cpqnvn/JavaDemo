package com.demo.servlet;

import com.demo.dao.ProductDAO;
import com.demo.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    ProductDAO dao = new ProductDAO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = insertProduct();
        request.setAttribute("products", getListProduct());
        request.setAttribute("message", msg);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected List<Product> getListProduct() {
        List<Product> list = dao.getProductByCategory(2);
        return list;
    }

    protected String updateProduct() {
        Product p = new Product();
        p.setId(3);
        p.setName("Iphone 11");
        p.setPrice(958);
        return dao.updateProduct(p);
    }

    protected String insertProduct() {
        Product p = new Product();
        p.setName("Iphone 8");
        p.setPrice(658);
        p.setQuantity(10);
        p.setCategoryID(2);
        return dao.insertProduct(p);
    }

    protected String deleteProduct() {
        return dao.deleteProduct(14);
    }
}
