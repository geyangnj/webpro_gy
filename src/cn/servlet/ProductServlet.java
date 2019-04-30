package cn.servlet;

import cn.cn.service.ProductService;
import cn.model.Product;

import java.io.IOException;
import java.util.ArrayList;

public class ProductServlet extends javax.servlet.http.HttpServlet {

    private ProductServlet productService= new ProductService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
request.setCharacterEncoding(("UTF-8"));
response.setCharacterEncoding("UTF-8");

        Product product =new Product();
        product.setName(request.getParameter("name"));
        product.setRemark(request);
        productService.save(product);
 response.sendRedirect("/webpro_gy/search.jsp");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding(("UTF-8"));
        response.setCharacterEncoding("UTF-8");

        String keyword =request.getParameter("keyword));
                ArrayList<Product> proList= productService(keyword));
        ArrayList

    }




}
