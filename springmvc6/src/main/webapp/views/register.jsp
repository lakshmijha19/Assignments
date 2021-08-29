<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Form Validation</title>
      <style>
         .error {
         color: red
         }
      </style>
</head>
<body>
<form action="processForm" modelAttribute="registration">
         <div align="center">
            <h2>Register Here</h2>
            <table>
               <tr>
                  <td>First name</td>
                  <td>
                     <input type="text" path="firstName" />
                  </td>
                  <td>
                     <errors path="firstName" cssClass="error" />
                  </td>
                  </tr>
               <tr>
                  <td>Last name (*)</td>
                  <td>
                     <input type="text" path="lastName" />
                  </td>
                  <td>
                     <errors path="lastName" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Age </td>
                  <td>
                  <input type="text" path="age" />
                  </td>
                  <td>
                     <errors path="age" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Email </td>
                  <td>
                     <input type="text" path="email" />
                  </td>
                  <td>
                  <errors path="email" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td><input type="submit" value="Submit" /></td>
               </tr>
            </table>
         </div>
      </form>
</body>
</html>