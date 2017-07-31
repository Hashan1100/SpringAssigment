<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hashan
  Date: 7/27/17
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Student Details</title>
    <style>
        .error {
            color: #ff0000;
            font-style: italic;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Enter Student Details</h2>
    <div class="row">
        <div class="col-sm-6 col-md-6 col-lg-6" >
            <form:form method="post" action="student" commandName="student" >

            <div class="form-group">
                <form:label path="name">Enter Student Name</form:label>
                <form:input id="name" name="name" path="name" class="form-control" placeholder="Enter name"/>
                <form:errors path="name" class="error"/>
            </div>

            <div class="form-group">
                <form:label path="id">Please enter Student Id</form:label>
                <form:input id="id" name="id" path="id" class="form-control" placeholder="Enter ID"/>
                <form:errors path="id" class="error"/>
            </div>

            <div class="form-group">
                <form:label path="gendar">Please enter Student Gender</form:label>
                <form:select id="gendar" path="gendar" name="gendar" multiple="false" class="form-control">
                    <form:options items="${genderList}" />
                </form:select>
            </div>

            <div class="form-group">
                <form:label path="birthday">Please enter Student Birthday</form:label>
                <form:input id="birthday" name="birthday" path="birthday" class="form-control" placeholder="Select birthday"/>
            </div>

            <div class="form-group">
                <form:label path="address">Please enter Student Address</form:label>
                <form:textarea id="address" name="address" path="address" class="form-control" placeholder="Enter Address"/>
            </div>

                <input type="submit" value="Submit" class="btn btn-default"/>
            </form:form>
        </div>
        <div class="col-sm-6 col-md-6 col-lg-6">
        </div>
    </div>
</div>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<script src="http://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<scrip src="https://code.jquery.com/ui/1.12.0/jquery-ui.min.js" integrity="sha256-eGE6blurk5sHj+rmkfsGYeKyZx3M4bG+ZlFyA7Kns7E=" crossorigin="anonymous"></scrip>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.css" crossorigin="anonymous">
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js" crossorigin="anonymous"></script>

<script>
    $(document).ready(function() {
        $(function () {
            $("#birthday").datepicker();
        });
    });
</script>

</body>
</html>
