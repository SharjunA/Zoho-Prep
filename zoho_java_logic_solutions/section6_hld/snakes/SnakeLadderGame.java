
package snakes;
import java.util.*;
public class SnakeLadderGame {
    private final Map<Integer,Integer> snakes = new HashMap<>();
    private final Map<Integer,Integer> ladders = new HashMap<>();
    private final Map<String,Integer> positions = new LinkedHashMap<>();
    private final Random rnd = new Random();
    public SnakeLadderGame(){ snakes.put(17,7); snakes.put(54,34); ladders.put(3,22); ladders.put(5,8); }
    public void addPlayer(String name){ positions.put(name,0); }
    private int apply(int pos){ if(snakes.containsKey(pos)) return snakes.get(pos); if(ladders.containsKey(pos)) return ladders.get(pos); return pos; }
    public boolean move(String name){
        int roll = rnd.nextInt(6)+1; int pos = positions.get(name)+roll;
        if(pos<=100) pos = apply(pos); else pos = positions.get(name);
        positions.put(name,pos); System.out.println(name + " rolled " + roll + " -> " + pos); return pos==100;
    }
    public static void main(String[] args){
        SnakeLadderGame g = new SnakeLadderGame(); g.addPlayer("A"); g.addPlayer("B");
        boolean over=false; while(!over){ over = g.move("A") || g.move("B"); }
    }
}
