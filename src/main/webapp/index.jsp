<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
   %>
    
   <%@ taglib prefix="b" tagdir="/WEB-INF/tags" %>
 
<b:base title="Home">
<header style="height: 30px;background-color: #3f51b5;">
   </header>
   
 <div class="container">

    
     <hr/>
     <form action="auth" method="post">
      <div class="form-group">
     	 <label>Username</label>
     	 <input type="text" name="username" class="form-control" style="width:50%">
     </div>
     
      <div class="form-group">
     	 <label>Password</label>
     	 <input type="password" name="password" class="form-control" style="width:50%">
     </div>
     
      <div class="form-group">
     	<button type="submit" class="btn btn-primary">Sign In</button>
     </div>
     </form>
     <a href="v1/register">Register User</a>
    <p class="text-primary" >${msg }</p>
     <p class="text-danger">${error }</p>
     
    
</div>
     
     



</b:base>