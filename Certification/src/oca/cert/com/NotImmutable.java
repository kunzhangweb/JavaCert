package oca.cert.com;

public class NotImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("initial");		
		NotImmutable problem = new NotImmutable(sb);
		sb.append(" added");
		StringBuilder gotBuilder = problem.getBuilder();
		gotBuilder.append(" more");
		System.out.println(problem.getBuilder());
	}// end main
	
	private StringBuilder builder;
	public NotImmutable(StringBuilder b) {
		builder = b;
	}
	public StringBuilder getBuilder() {
		return builder;
	}
}
