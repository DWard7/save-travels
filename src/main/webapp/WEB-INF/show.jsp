<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Show Expense</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/main.css" />
    <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
    <!-- change to match your file/naming structure -->
  </head>
  <body>
    <div class="container mt-3">
      <h1>Expense Details</h1>
      
      <table class="table">
        <thead>
          <th>Expense Name</th>
          <th>Expense Description</th>
          <th>Vendor</th>
          <th>Amount Spent</th>
        </thead>
        <tr>
          <td>${save.expense}</td>
          <td>${save.description}</td>
          <td>${save.vendor}</td>
          <td>$ ${save.amount}</td>
        </tr>
      </table>
      <a href="/expenses"><button class="btn btn-outline-primary">Home</button></a>
    </div>
  </body>
</html>
