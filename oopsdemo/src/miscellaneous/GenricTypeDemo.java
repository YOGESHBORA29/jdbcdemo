package miscellaneous;
class sample<T>//Genric type /genric class
{ 
	private T data;

public sample(T data) {
	this.data = data;
}

public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}

}

public class GenricTypeDemo {

	public static void main(String[] args) {
		sample<String> s= new sample<String>("JAVA GENRIC");
		System.out.println("Display gentic class by passing sting"+s.getData());
		sample<Double>s1= new sample<Double>(2000.0);
		System.out.println("Display gentic class by passing double"+s1.getData());

	}

}
