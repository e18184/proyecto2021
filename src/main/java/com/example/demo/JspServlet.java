package com.example.demo;
import javax.servlet.annotation.WebServlet;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@WebServlet(urlPatterns = "*.jsp",name = "JspServlet")
public class JspServlet extends org.apache.jasper.servlet.JspServlet {

}