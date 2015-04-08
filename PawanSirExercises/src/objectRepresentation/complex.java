package objectRepresentation;

public class complex {
	float real, img;
	
	public void print(){
		System.out.println(real + "+" + "i" + img);
	}
	
	public void myDouble(){
		real =  real * 2;
		img =  img * 2;
	}
	
	public void ktimes(int k){
		real = real * k;
		img = img * k;
	}
	
	public float magsq(){
		float t;
		t =  real * real + img * img;
		return t;
	}
	
	public static void print2(complex a){
		System.out.println(a.getreal() + "+" + "i" + a.getimaginary());
	}

	private float getreal() {
		return real;
	}

	private float getimaginary() {
		return img;
	}
	
	public void set(float x, float y){
		real = x;
		img = y;
	}
	
	public void add(complex x){
		real += x.getreal();
		img += x.getimaginary();
	}
	
	public void add(complex x, complex y){
		real = x.getreal() + y.getreal();
		img = x.getimaginary() + y.getimaginary();
	}
	
	public complex add3(complex x){
		
		float a, b;
		a =  real + x.getreal();
		b = img + x.getimaginary();
		complex c = new complex();
		c.set(a, b);
		return c;
	}
	
	public static complex add4(complex x, complex y){
		float a, b;
		a =  x.getreal() + y.getreal();
		b = x.getimaginary() + y.getimaginary();
		complex c = new complex();
		c.set(a, b);
		return c;
	}
	
}
