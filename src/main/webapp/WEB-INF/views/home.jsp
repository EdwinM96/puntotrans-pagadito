<%-- 
    Document   : home
    Created on : 08-31-2021, 04:25:48 AM
    Author     : Edwin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script type="text/javascript" src="<c:url value="/resources/cybs_devicefingerprint.js"/>"></script>
        <script type="text/javascript">
            document.write(cybs_dfprofiler("pagadito", "SANDBOX"));
        </script>
    </body>
</html>
