package interpreter;

public class ProgramNode extends Node {
	private Node commandListNode;
	public void parse(Context context) throws ParseException{
		context.skipToken("program");
		commandLineNode = new CommmandListNode();
		commandListNode.parse(context);
	}
	public String toString() {
		return "[program " + programListNode + "]";
	}
}
