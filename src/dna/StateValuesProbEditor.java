//==============================================================================
//	
//	Copyright (c) 2018-
//	Authors:
//	* Joachim Klein <klein@tcs.inf.tu-dresden.de> (TU Dresden)
//	
//------------------------------------------------------------------------------
//	
//	This file is part of PRISM.
//	
//	PRISM is free software; you can redistribute it and/or modify
//	it under the terms of the GNU General Public License as published by
//	the Free Software Foundation; either version 2 of the License, or
//	(at your option) any later version.
//	
//	PRISM is distributed in the hope that it will be useful,
//	but WITHOUT ANY WARRANTY; without even the implied warranty of
//	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//	GNU General Public License for more details.
//	
//	You should have received a copy of the GNU General Public License
//	along with PRISM; if not, write to the Free Software Foundation,
//	Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//	
//==============================================================================

package dna;

import java.util.ArrayList;
import java.util.List;

import parser.State;
import parser.VarList;
import parser.type.TypeInt;
import prism.StateAndValueConsumer;


public class StateValuesProbEditor implements StateAndValueConsumer
{
	List<Integer> index;
	
	public StateValuesProbEditor()
	{
		index = new ArrayList<Integer>();
	}
	
	@Override
	public void accept(int[] varValues, double value, long stateIndex) {
		// TODO Auto-generated method stub
		if (value != 0) index.add(Math.toIntExact(stateIndex));
	}
	
	public List<Integer> getIndex(){
		return index;
	}
}
