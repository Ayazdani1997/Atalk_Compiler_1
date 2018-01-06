public class SymbolTableCursorItem extends SymbolTableLocalVariableItem {
	public int foreachloopLabelNum;
	public int foreachendLabelNum;
	public int elementOffset;
	public SymbolTableCursorItem(Variable variable, int offset) {
		super(variable, offset);
	}

	@Override
	public Register getBaseRegister() {
		return Register.SP;
	}

	@Override
	public boolean useMustBeComesAfterDef() {
		return false;
	}
}