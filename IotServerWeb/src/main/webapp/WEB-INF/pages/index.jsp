
<!DOCTYPE html>
<html lang="en">
<head>
<title>IoT Server</title>
</head>
  
<div class="jumbotron">
  <div class="container">
	<h1>${title}</h1>
	<p>
		<c:if test="${not empty name}">
			Hello ${name}
		</c:if>
 
		<c:if test="${empty name}">
			Welcome Welcome!
		</c:if>
    </p>
  </div>
</div>
 <!--
<div class="container">
  <hr>
  
   <c:forEach var="device" items="${allDeviceObjects}">
       <tr>
           <td><c:out value="${device.name}" /></td>

           <td><c:out value="${device.state1_name}" /></td>

           <td><c:out value="${device.curr_state1}" /></td>
           
		   <c:if test="${not empty device.state2_name}">
	           <td><c:out value="${device.state2_name}" /></td>
	
	           <td><c:out value="${device.curr_state2}" /></td>
		   </c:if>
           
       </tr>
   </c:forEach>
  
  
  <footer>
	<p>© Roman.com 2018</p>
  </footer>
</div>
 -->
</body>
</html>
