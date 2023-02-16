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
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/main.css" />
    <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
    <!-- change to match your file/naming structure -->
  </head>
  <body>
    <h1>Edit Expense</h1>
    <form:form action="/expenses/${save.id}" method="post" modelAttribute="save">
      <input type="hidden" name="_method" value="put">
      <div class="form-control">
        <form:label path="expense">Expense Name:</form:label>
        <form:errors path="expense" class="text-danger"/>
        <form:input path="expense"></form:input>
      </div>
        <div class="form-control">
          <form:label path="vendor">Vendor:</form:label>
          <form:errors path="vendor" class="text-danger" />
          <form:input path="vendor"></form:input>
        </div>
        <div class="form-control">
          <form:label path="amount">Amount:</form:label>
          <form:errors path="amount" class="text-danger" />
          <form:input path="amount"></form:input>
        </div>
        <div class="form-control">
          <form:label path="description">Description:</form:label>
          <form:errors path="description" class="text-danger" />
          <form:input path="description"></form:input>
        </div>
        <button type="submit" class="btn btn-outline-primary">Submit</button>
    </form:form>
  </body>
</html>