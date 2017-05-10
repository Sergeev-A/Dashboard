<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<c:out value=
               "${requestScope.all}" escapeXml="false"/><br>
<c:out value=
               "${requestScope.sadas}" escapeXml="false"/><br>
<c:out value=
               "555" escapeXml="false"/><br>
</body>
</html>