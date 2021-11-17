<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
   %>
    
   <%@ taglib prefix="b" tagdir="/WEB-INF/tags" %>
 
<b:base title="User Registration">
<div class="container mt-5 ms-5 pt-5">

<div class=" mb-5 ">
<h4>User Registration</h4>
</div>

<form class="row g-3 pe-3 ps-3" method="POST">
<div class="col-md-4">
    <label for="FName" class="form-label">First name</label>
    <input type="text" class="form-control" id="FName" name="FName" value="Mark" required>
    
  </div>
  <div class="col-md-4">
    <label for="LName" class="form-label">Last name</label>
    <input type="text" class="form-control" id="LName" name="LName" value="Otto" required>
   
  </div>
  <div class="col-md-4">
    <label for="validationCustomUsername" class="form-label">Username</label>
    <div class="input-group has-validation">
      <span class="input-group-text" id="inputGroupPrepend">@</span>
      <input type="text" class="form-control" id="validationCustomUsername" name="username" aria-describedby="inputGroupPrepend" required>
      <div class="invalid-feedback">
        Please choose a username.
      </div>
    </div>
  </div>
    <div class="col-md-12">
    <label for="inputPassword4" class="form-label">Password</label>
    <input type="password" class="form-control" id="inputPassword4" name="password">
  </div>
  <div class="col-md-6">
    <label for="ssn" class="form-label">SSN</label>
    <input type="text" class="form-control" id="ssn" name="ssn">
  </div>
<div class="col-md-6">
    <label for="inputEmail4" class="form-label">Email</label>
    <input type="email" class="form-control" id="inputEmail4" name="email">
  </div>

  <div class="col-12">
    <label for="inputAddress" class="form-label">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St" name="Street">
  </div>
  <div class="col-12">
    <label for="inputAddress2" class="form-label">Address 2</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor" name="unit">
  </div>
  <div class="col-md-6">
    <label for="inputCity" class="form-label">City</label>
    <input type="text" class="form-control" id="inputCity" name="city">
  </div>
  
  <div class="col-md-4">
    <label for="inputState" class="form-label">State</label>
    <select id="inputState" class="form-select" name="state">
      <option hidden selected>Choose...</option>
      <option value="MN">MN</option>
      <option value="TX">TX</option>
      <option value="AZ">AZ</option>
    </select>
  </div>
  <div class="col-md-2">
    <label for="inputZip" class="form-label">Zip</label>
    <input type="text" class="form-control" id="inputZip" name="zip">
  </div>
  <div class="col-md-4">
    <label for="country" class="form-label">Country</label>
    <input type="text" class="form-control" id="country" name="country">
  </div>
  <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck" name="isadmin">
      <label class="form-check-label" for="gridCheck">
        Admin
      </label>
    </div>
  </div>
  <div class="col-12">
    <button type="submit" class="btn btn-primary" >Register</button>
    <button type="submit" class="btn btn-primary" formaction="index.jsp">Cancel</button>
  </div>
</form>

</div>
<p class="text-success">${msg}</p>

<p class="text-danger">${error}</p>


</b:base>