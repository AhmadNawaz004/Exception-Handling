

public class Java7MultipleExceptions {

	public static void main(String[] args) {
		try{
			rethrow("abc");
		}catch(FirstException | SecondException | ThirdException e){
			//below assignment will throw compile time exception since e is final
			//e = new Exception();
			System.out.println(e.getMessage());
		}
	}

	static void rethrow(String s) throws FirstException, SecondException,
			ThirdException {
		try {
			if (s.equals("First"))
				throw new FirstException("First");
			else if (s.equals("Second"))
				throw new SecondException("Second");