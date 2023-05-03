package com.example.m2s08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "empresaServlet", value = "/empresas")
public class EmpresaServlet extends HttpServlet {

    private List<Empresa> empresas = new ArrayList<>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<table><tr><th>CNPJ</th><th>Nome</th></tr>");
        for(Empresa empresa: empresas) {
            out.println("<tr><td>"+empresa.getCnpj()+"</td><td>"+empresa.getNome()+"</td></tr>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Empresa empresa = new Empresa();

        empresa.setCnpj(request.getParameter("cnpj"));
        empresa.setNome(request.getParameter("nome"));

        empresas.add(empresa);

        doGet(request, response);
    }

    public void destroy() {
    }
}