<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>All the Games!</title>
</head>
<body>
  <c:forEach items="${requestScope.games}" var="game">
    <ul>
      <li>Red Team P1: <c:out value="${game.redTeamPlayer1}"/></li>
      <li>Red Team P2: <c:out value="${game.redTeamPlayer2}"/></li>
      <li>Red Team Score: <c:out value="${game.redTeamScore}"/></li>
      <li>Blue Team P1: <c:out value="${game.blueTeamPlayer1}"/></li>
      <li>Blue Team P2: <c:out value="${game.blueTeamPlayer2}"/></li>
      <li>Blue Team Score: <c:out value="${game.blueTeamScore}"/></li>
      <li><c:out value="${game.getWinner()}"/></li>
    </ul>
  </c:forEach>
</body>
</html>