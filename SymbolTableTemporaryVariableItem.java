public class SymbolTableTemporaryVariableItem extends SymbolTableVariableItemBase {
	public int isLValue;
	public SymbolTableTemporaryVariableItem(Variable variable, int offset) {
		super(variable, offset);
		isLValue = 1;
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
