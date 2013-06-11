import java.math.BigDecimal;
import java.math.MathContext;


public class BigDecimalTest {

	
	private BigDecimal test;
	
	public static void main( String[] args )
	{
	 
		BigDecimalTest t = new BigDecimalTest(new BigDecimal(3));
		//곱합기
		System.out.println(t.getTest().multiply(new BigDecimal(3.3333333)));
		//자리수 만큼 반올림
		System.out.println(t.getTest().multiply(new BigDecimal(3.3333333),  new MathContext(20)));
	}
	
	public BigDecimalTest(BigDecimal in) {
		this.test = in; 
		
	}
	
	public BigDecimal getTest() {
		return test;
	}

	public void setTest(BigDecimal test) {
		this.test = test;
	}

	   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((test == null) ? 0 : test.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BigDecimalTest other = (BigDecimalTest) obj;
		if (test == null) {
			if (other.test != null)
				return false;
		} else if (!test.equals(other.test))
			return false;
		return true;
	}
	
	
	
}
