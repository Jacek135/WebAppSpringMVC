<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>
<h2>Hello you little buster</h2>

Session: <%= session.getAttribute("name")%> <p/>
Request: <%= request.getAttribute("name")%> <p/>

Request (using EL): ${name} <p/>
<c:out value="${name}"></c:out>

<sql:query var="rs" dataSource="jdbc/spring">
    select id, name, emial, text from offers
</sql:query>
    <br/>
<c:forEach var="row" items="${rs.rows}">
    ID ${row.id}<br/>
    Name: ${row.name}<br/>
</c:forEach>

</body>
</html>
