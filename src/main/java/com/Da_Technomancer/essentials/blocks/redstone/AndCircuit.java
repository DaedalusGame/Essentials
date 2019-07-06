package com.Da_Technomancer.essentials.blocks.redstone;

import com.Da_Technomancer.essentials.tileentities.CircuitTileEntity;

public class AndCircuit extends AbstractCircuit{

	public AndCircuit(){
		super("and_circuit");
	}

	@Override
	public boolean useInput(CircuitTileEntity.Orient or){
		return or == CircuitTileEntity.Orient.CCW || or == CircuitTileEntity.Orient.CW;
	}

	@Override
	public float getOutput(float in0, float in1, float in2, CircuitTileEntity te){
		return in0 != 0 && in2 != 0 ? 1 : 0;
	}
}