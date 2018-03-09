package com.td.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Structure implements Group {

	private List<Group> groups = new ArrayList<>();

	@Override
	public void assemble() {
		for (Group group : groups) {
			group.assemble();
		}
	}

	// Adds the group to the structure.
	public void add(Group group) {
		groups.add(group);
	}

	// Removes the group from the structure.
	public void remove(Group group) {
		groups.remove(group);
	}

}
