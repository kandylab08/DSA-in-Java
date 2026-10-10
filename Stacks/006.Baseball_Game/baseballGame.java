java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scoreRecord = new Stack<>();
        int finalScore = 0;
        for(String s : operations)
        {
            switch(s)
            {
                case "+":
                    int sc1 = scoreRecord.pop();
                    int sc2 = scoreRecord.peek();
                    scoreRecord.push(sc1);
                    scoreRecord.push(sc1+sc2);
                    break;
                case "D":
                    int lastScore = scoreRecord.peek();
                    scoreRecord.push(2 * lastScore);
                    break;
                case "C":
                    scoreRecord.pop();
                    break;
                default:   
                    scoreRecord.push(Integer.parseInt(s));          
            }
        }
        while(!scoreRecord.isEmpty())
        {
            int score = scoreRecord.pop();
            finalScore += score;
        }
        return finalScore;
    }
}