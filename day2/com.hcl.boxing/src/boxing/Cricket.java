package boxing;

public class Cricket {
static int score;
public void inc(int x){
	score+=x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket fb=new Cricket();
		Cricket sb=new Cricket();
		Cricket ext=new Cricket();
		fb.inc(67);;
		sb.inc(10);
		ext.inc(0);
		System.out.println(Cricket.score);
		

	}

}
