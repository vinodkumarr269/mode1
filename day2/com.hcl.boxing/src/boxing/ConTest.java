package boxing;

public class ConTest {
int a,b;

public ConTest() {
	this.a=12;
	this.b=13;
}

public ConTest(int a, int b) {
	this.a = a;
	this.b = b;
}


@Override
public String toString() {
	return "ConTest [a=" + a + ", b=" + b + "]";
}

public static void main(String[] args) {
	ConTest x= new ConTest();
	System.out.println(x);
	ConTest y= new ConTest(55,33);
	System.out.println(y);
}
}
