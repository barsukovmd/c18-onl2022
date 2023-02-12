<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="main.css"/>
  <title>Students</title>
</head>
<body>
<a href="students-database">
  <br>
  <h1><%="List of Students"%>
  </h1>
  <p
          class="blue_text">
    Blue Text

  </p>

  <p class="red_text">
    Red text
  </p>
</a></body>
<form action="database.jsp">
  Name: <label>
  <input name="name"/>
</label>
  <br><br>
  Surname: <label dir="auto">
  <input name="surname"/>
</label>
  <br><br>
  Age: <label>
  <input name="age" type="number" min=1/>
</label>
  <br><br>
  Course: <label>
  <input name="course" type="number" min=1/>
</label>
  <br><br>
  City: <label>
  <input city="city" type="text"/>
</label>
  <br><br/>
  <input type="submit" value="Submit"/>
</form>
</html>
