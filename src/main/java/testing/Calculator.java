package testing;

public class Calculator {
public int add(int n1,int n2) {
	if(n1>n2) System.out.println("Some random message");
	int sum=n1+n2;
	return sum;
}
public float add(float n1,float n2) {
	return n1+n2;
}

public float divide(int n1,int n2) {
	return n1/n2;
}
}
