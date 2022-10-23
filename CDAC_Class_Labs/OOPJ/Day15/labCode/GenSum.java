class TwoSum<T extends Number> { // T cannot be String as its not Subclass of Number
	T a;
	T b;

	TwoSum(T a, T b) {
		this.a = a;
		this.b = b;
	}

	double getSum() {
		double res = a.doubleValue() + b.doubleValue();
		return res;
	}

}

class GenSum {

	public static void main(String[] args) {

		TwoSum<Integer> ts1 = new TwoSum<>(5, 10); // lower bound : Integer
		int res1 = (int) ts1.getSum();
		System.out.println("Sum: " + res1);

		TwoSum<Double> ts2 = new TwoSum<>(5.8, 10.4); // lower bound : Double
		double res2 = ts2.getSum();
		System.out.println("Sum: " + res2);

		// TwoSum<String> ts3 = new TwoSum<>("Hi", "Its me"); // error
		
		TwoSum <Number> ts3 = new TwoSum<>(5, 3); // lower bound : Number == upper bound : Number ==> Allowed
	}
}