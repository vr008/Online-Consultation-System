<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>
<form action="WelcomeServlet" method ="post">
<label>Patient Details</label>
<pre>
Name                  <input type="text" name="name"><br>
Phone No              <input type="text" name="phone"><br>
Age                   <input type="text" name="age"><br>
Appointment Date      <input type="text" name="date"><br>
Illness               <input type="text" name="problem"><br>
<label for="timeslot">Select Time Slot:           <select name="timeslot" id="timeslot">
  <option value="9-10 AM">9-10 AM</option>
  <option value="10-11 AM">10-11 AM</option>
  <option value="11-12 AM">11-12 AM</option>
  <option value="12-1 PM">12-1 PM</option>
   <option value="3-4 PM">3-4 PM</option>
  <option value="4-5 PM">4-5 PM</option>
  <option value="5-6 PM">5-6 PM</option>
  <option value="6-7 PM">6-7 PM</option>
  <option value="7-8 PM">7-8 PM</option>
  <option value="8-9 PM">8-9 PM</option>
 
  
</select>
</label> 
<input type="submit" value="book appointment">  <input type="reset">
</pre>
</form>

</body>
</html>