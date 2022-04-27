<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Add Shuffleboard Game!</title>
</head>
<body>
  <h2>Add a Shuffleboard Game!</h2>
  <form action="/games" method="post">
    <div>
      <label for="redTeamPlayer1">Red Team Player 1</label>
      <input type="text" id="redTeamPlayer1" name="redTeamPlayer1">
    </div>
    <div>
      <label for="redTeamPlayer2" >Red Team Player 2</label>
      <input type="text" id="redTeamPlayer2" name="redTeamPlayer2">
    </div>
    <div>
      <label for="redTeamScore" >Red Team Score</label>
      <input type="text" id="redTeamScore" name="redTeamScore">
    </div>
    <div>
      <label for="blueTeamPlayer1" >Blue Team Player 1</label>
      <input type="text" id="blueTeamPlayer1" name="blueTeamPlayer1">
    </div>
    <div>
      <label for="blueTeamPlayer2" >Blue Team Player 2</label>
      <input type="text" id="blueTeamPlayer2" name="blueTeamPlayer2">
    </div>
    <div>
      <label for="blueTeamScore" >Blue Team Score</label>
      <input type="text" id="blueTeamScore" name="blueTeamScore">
    </div>
    <input type="submit"/>
  </form>
</body>
</html>