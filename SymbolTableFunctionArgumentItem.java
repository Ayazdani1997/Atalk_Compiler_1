public class SymbolTableFunctionArgumentItem extends SymbolTableVariableItemBase {
	
	public SymbolTableFunctionArgumentItem(Variable variable, int offset) {
		super(variable, offset);
	}

	public boolean useMustBeComesAfterDef()
	{
		return true;
	}

	@Override
	public Register getBaseRegister() {
		return Register.TEMP9;
	}
}