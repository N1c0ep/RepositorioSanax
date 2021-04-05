<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="./userInfo" method="POST">
            <table>
                <tr>
                    <td>Id</td>
                    <td><input type="text" name="id" value="${user.id}" /></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstname" value="${user.firstname}" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastname" value="${user.lastname}" /></td>
                </tr>
                <tr>
                    <td>Location</td>
                    <td><input type="text" name="location" value="${user.location}" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="${user.email}" /></td>
                </tr>
                <tr>
                    <td>Birth Date</td>
                    <td><input type="text" name="birth" value="${user.birth}" /></td>
                </tr>
                <tr>
                    <td>Telephonic number</td>
                    <td><input type="text" name="telephone" value="${user.telephone}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Next" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>