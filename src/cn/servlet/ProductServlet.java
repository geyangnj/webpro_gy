package cn.servlet;

import cn.cn.service.ProductService;
import cn.model.Product;

import java.io.IOException;

public class ProductServlet extends javax.servlet.http.HttpServlet {

    private ProductServlet productService= new ProductService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Product product =new Product();
        product.setName(request.getParameter("name"));
        product.setRemark(request);
        productService.save(product);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
