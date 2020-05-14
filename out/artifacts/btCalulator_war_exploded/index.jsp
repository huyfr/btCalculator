<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/05/2020
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="css/style.css">
<head>
    <title>
        [Bài tập] Ứng dụng Calculator</title>
</head>
<body>
<h1>Simple calculator</h1>
<form method="post" action="/process">
    <table>
        <tbody>
        <tr>
            <td>First operand</td>
            <td><input type="text" name="first"></td>
        </tr>
        <tr>
            <td>Operator</td>
            <td><select name="operator">
                <option value="add">+</option>
                <option value="minus">-</option>
                <option value="multiple">*</option>
                <option value="divide">/</option>
            </select></td>
        </tr>
        <tr>
            <td>Second operand</td>
            <td><input type="text" name="second"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="Calculate"></td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
