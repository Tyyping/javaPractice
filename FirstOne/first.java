import  java.io.*;
import  java.util.ArrayList;
//Set game's locations.Check user's guess right or wrong
class DotCom{
    ArrayList<String> locationCells;
	
    void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
    }
    String checkYourself(String stringGuess){
        String result = "miss";
		
		boolean isHit = locationCells.contains(stringGuess);
		if(isHit){
			locationCells.remove(stringGuess);
			if(locationCells.isEmpty()){
				result = "kill";
			}else{
				result = "hit";
			}
		}
		
        System.out.println(result);
        return result;
    }
}
class GameHelper{
    String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + "  ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }
        }
        catch(IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}

public class first {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom dot = new DotCom();
		ArrayList<String> gameList = new ArrayList<String>();
		
        int randomNum = (int)(Math.random() * 8);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		for(int temp : locations){
			gameList.add(String.valueOf(temp));
		}
			
        dot.setLocationCells(gameList);

        boolean isAlive = true;

        while(isAlive){
            String guess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses!");
            }
        }
    }
}