import  java.io.*;
import  java.util.*;
//Set game's locations. Check user's guess right or wrong
class DotCom {
    private ArrayList<String> locationCells;
	private String name;
	
    public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
    }
	
	public void setName(String dotComName){
		name = dotComName;
	}
	
    public String checkYourself(String stringGuess){
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
class GameHelper {
    String getUserInput(String prompt) {
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
	public ArrayList<String> placeDotCom(int numOfLocation){
		
	}
}
class firstImprove {
	/*Declare necessary variable.*/
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	//Declare an integer variable to record times of user's guesses.
	private int numOfGuesses = 0;
	
	private void SetUpGame(){
		DotCom one = new DotCom();
		one.setName("Alibaba.com");
		DotCom two = new DotCom();
		two.setName("Tencent.com");
		DotCom three = new DotCom();
		three.setName("Baidu.com");
		
		dotComName.add(one);
		dotComName.add(two);
		dotComName.add(three);
		/*Repeat with each of DotCom object in the dotComsList array.And*/
		for(DotCom dotComToSet : dotComsList){
			ArrayList<String> locations = helper.placeDotCom(3);
			dotComToSet.setLocationCells(locations);
		}
	}
}