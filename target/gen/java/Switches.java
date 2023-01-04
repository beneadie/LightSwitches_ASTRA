/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Switches extends ASTRAClass {
	public Switches() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Switches", new int[] {16,9,16,30},
			new BeliefEvent('+',
				new Predicate("Switch", new Term[] {
					Primitive.newPrimitive("S1"),
					Primitive.newPrimitive("on")
				})
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {16,29,18,5},
				new Statement[] {
					new Subgoal(
						"Switches", new int[] {17,8,18,5},
						new Goal(
							new Predicate("edit_link", new Term[] {
								Primitive.newPrimitive("S1"),
								Primitive.newPrimitive("on")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {19,9,19,30},
			new BeliefEvent('+',
				new Predicate("Switch", new Term[] {
					Primitive.newPrimitive("S2"),
					Primitive.newPrimitive("on")
				})
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {19,29,21,5},
				new Statement[] {
					new Subgoal(
						"Switches", new int[] {20,8,21,5},
						new Goal(
							new Predicate("edit_link", new Term[] {
								Primitive.newPrimitive("S2"),
								Primitive.newPrimitive("on")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {24,9,24,31},
			new BeliefEvent('+',
				new Predicate("Switch", new Term[] {
					Primitive.newPrimitive("S1"),
					Primitive.newPrimitive("off")
				})
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {24,30,26,5},
				new Statement[] {
					new Subgoal(
						"Switches", new int[] {25,8,26,5},
						new Goal(
							new Predicate("edit_link", new Term[] {
								Primitive.newPrimitive("S1"),
								Primitive.newPrimitive("off")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {27,9,27,31},
			new BeliefEvent('+',
				new Predicate("Switch", new Term[] {
					Primitive.newPrimitive("S2"),
					Primitive.newPrimitive("off")
				})
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {27,30,29,5},
				new Statement[] {
					new Subgoal(
						"Switches", new int[] {28,8,29,5},
						new Goal(
							new Predicate("edit_link", new Term[] {
								Primitive.newPrimitive("S2"),
								Primitive.newPrimitive("off")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {31,9,31,41},
			new GoalEvent('+',
				new Goal(
					new Predicate("edit_link", new Term[] {
						new Variable(Type.STRING, "S",false),
						new Variable(Type.STRING, "V",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {31,40,40,5},
				new Statement[] {
					new If(
						"Switches", new int[] {32,8,40,5},
						new Comparison("==",
							new Variable(Type.STRING, "S"),
							Primitive.newPrimitive("S1")
						),
						new Block(
							"Switches", new int[] {32,22,35,9},
							new Statement[] {
								new BeliefUpdate('-',
									"Switches", new int[] {33,12,35,9},
									new Predicate("Link", new Term[] {
										new Variable(Type.STRING, "Q",false),
										new Variable(Type.STRING, "P",false)
									})
								),
								new BeliefUpdate('+',
									"Switches", new int[] {34,12,35,9},
									new Predicate("Link", new Term[] {
										new Variable(Type.STRING, "V"),
										new Variable(Type.STRING, "P")
									})
								)
							}
						)
					),
					new If(
						"Switches", new int[] {36,8,40,5},
						new Comparison("==",
							new Variable(Type.STRING, "S"),
							Primitive.newPrimitive("S2")
						),
						new Block(
							"Switches", new int[] {36,22,39,9},
							new Statement[] {
								new BeliefUpdate('-',
									"Switches", new int[] {37,12,39,9},
									new Predicate("Link", new Term[] {
										new Variable(Type.STRING, "Q",false),
										new Variable(Type.STRING, "P",false)
									})
								),
								new BeliefUpdate('+',
									"Switches", new int[] {38,12,39,9},
									new Predicate("Link", new Term[] {
										new Variable(Type.STRING, "Q"),
										new Variable(Type.STRING, "V")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {42,9,42,29},
			new BeliefEvent('+',
				new Predicate("Link", new Term[] {
					Primitive.newPrimitive("on"),
					Primitive.newPrimitive("off")
				})
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {42,28,49,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Switches", new int[] {43,8,49,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							new Variable(Type.STRING, "J",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {44,8,49,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {45,8,45,39},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L1 is in state: on")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {46,8,49,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							new Variable(Type.STRING, "K",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {47,8,49,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {48,8,48,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L1 is in state: off")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {51,9,51,28},
			new BeliefEvent('+',
				new Predicate("Link", new Term[] {
					Primitive.newPrimitive("off"),
					Primitive.newPrimitive("on")
				})
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {51,27,58,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Switches", new int[] {52,8,58,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							new Variable(Type.STRING, "J",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {53,8,58,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {54,8,54,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L1 is in state: off")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {55,8,58,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							new Variable(Type.STRING, "K",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {56,8,58,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {57,8,57,39},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L2 is in state: on")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {60,9,60,29},
			new BeliefEvent('+',
				new Predicate("Link", new Term[] {
					Primitive.newPrimitive("off"),
					Primitive.newPrimitive("off")
				})
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {60,28,67,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Switches", new int[] {61,8,67,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							new Variable(Type.STRING, "J",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {62,8,67,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {63,8,63,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L1 is in state: off")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {64,8,67,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							new Variable(Type.STRING, "K",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {65,8,67,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {66,8,66,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L2 is in state: off")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {69,9,69,27},
			new BeliefEvent('+',
				new Predicate("Link", new Term[] {
					Primitive.newPrimitive("on"),
					Primitive.newPrimitive("on")
				})
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {69,26,102,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Switches", new int[] {71,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							new Variable(Type.STRING, "J",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {72,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {73,8,73,39},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L1 is in state: on")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {74,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							new Variable(Type.STRING, "K",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {75,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {76,8,76,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L2 is in state: off")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"Switches", new int[] {77,8,77,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {79,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							new Variable(Type.STRING, "JA",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {80,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {81,8,81,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L1 is in state: off")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {82,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							new Variable(Type.STRING, "KA",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {83,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {84,8,84,39},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L2 is in state: on")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"Switches", new int[] {85,8,85,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {87,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							new Variable(Type.STRING, "JB",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {88,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {89,8,89,39},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L1 is in state: on")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {90,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							new Variable(Type.STRING, "KB",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {91,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {92,8,92,39},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L2 is in state: on")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"Switches", new int[] {93,8,93,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {95,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							new Variable(Type.STRING, "JC",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {96,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L1"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {97,8,97,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L1 is in state: off")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Switches", new int[] {98,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							new Variable(Type.STRING, "KC",false)
						})
					),
					new BeliefUpdate('+',
						"Switches", new int[] {99,8,102,5},
						new Predicate("Light", new Term[] {
							Primitive.newPrimitive("L2"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("C",
						"Switches", new int[] {100,8,100,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("L2 is in state: off")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Switches","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"Switches", new int[] {101,8,101,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {108,9,108,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("flip_switch", new Term[] {
						new Variable(Type.STRING, "S",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {108,32,118,5},
				new Statement[] {
					new Query(
						"Switches", new int[] {109,8,109,34},
						new Predicate("Switch", new Term[] {
							new Variable(Type.STRING, "S"),
							new Variable(Type.STRING, "U",false)
						})
					),
					new If(
						"Switches", new int[] {110,8,118,5},
						new Comparison("==",
							new Variable(Type.STRING, "U"),
							Primitive.newPrimitive("on")
						),
						new Block(
							"Switches", new int[] {110,23,113,13},
							new Statement[] {
								new BeliefUpdate('-',
									"Switches", new int[] {111,12,113,13},
									new Predicate("Switch", new Term[] {
										new Variable(Type.STRING, "S"),
										Primitive.newPrimitive("on")
									})
								),
								new BeliefUpdate('+',
									"Switches", new int[] {112,12,113,13},
									new Predicate("Switch", new Term[] {
										new Variable(Type.STRING, "S"),
										Primitive.newPrimitive("off")
									})
								)
							}
						)
					),
					new If(
						"Switches", new int[] {114,8,118,5},
						new Comparison("==",
							new Variable(Type.STRING, "U"),
							Primitive.newPrimitive("off")
						),
						new Block(
							"Switches", new int[] {114,24,117,9},
							new Statement[] {
								new BeliefUpdate('-',
									"Switches", new int[] {115,12,117,9},
									new Predicate("Switch", new Term[] {
										new Variable(Type.STRING, "S"),
										Primitive.newPrimitive("off")
									})
								),
								new BeliefUpdate('+',
									"Switches", new int[] {116,12,117,9},
									new Predicate("Switch", new Term[] {
										new Variable(Type.STRING, "S"),
										Primitive.newPrimitive("on")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Switches", new int[] {121,9,121,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "things",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Switches", new int[] {121,28,138,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Switches", new int[] {122,8,138,5},
						Primitive.newPrimitive(0)
					),
					new Declaration(
						new Variable(Type.INTEGER, "x"),
						"Switches", new int[] {123,8,138,5},
						Primitive.newPrimitive(1)
					),
					new While(
						"Switches", new int[] {124,8,138,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							new Variable(Type.INTEGER, "x")
						),
						new Block(
							"Switches", new int[] {124,21,137,9},
							new Statement[] {
								new ModuleCall("system",
									"Switches", new int[] {125,12,125,29},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(2000)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Subgoal(
									"Switches", new int[] {126,12,137,9},
									new Goal(
										new Predicate("flip_switch", new Term[] {
											Primitive.newPrimitive("S1")
										})
									)
								),
								new ModuleCall("system",
									"Switches", new int[] {127,12,127,29},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(2000)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Subgoal(
									"Switches", new int[] {128,12,137,9},
									new Goal(
										new Predicate("flip_switch", new Term[] {
											Primitive.newPrimitive("S1")
										})
									)
								),
								new Subgoal(
									"Switches", new int[] {129,12,137,9},
									new Goal(
										new Predicate("flip_switch", new Term[] {
											Primitive.newPrimitive("S2")
										})
									)
								),
								new ModuleCall("system",
									"Switches", new int[] {130,12,130,29},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(2000)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Subgoal(
									"Switches", new int[] {131,12,137,9},
									new Goal(
										new Predicate("flip_switch", new Term[] {
											Primitive.newPrimitive("S1")
										})
									)
								),
								new ModuleCall("system",
									"Switches", new int[] {132,12,132,29},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(2000)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Subgoal(
									"Switches", new int[] {133,12,137,9},
									new Goal(
										new Predicate("flip_switch", new Term[] {
											Primitive.newPrimitive("S1")
										})
									)
								),
								new Subgoal(
									"Switches", new int[] {134,12,137,9},
									new Goal(
										new Predicate("flip_switch", new Term[] {
											Primitive.newPrimitive("S2")
										})
									)
								),
								new ModuleCall("system",
									"Switches", new int[] {135,12,135,30},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(20000)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Switches","system")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("Light", new Term[] {
				Primitive.newPrimitive("L1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("Light", new Term[] {
				Primitive.newPrimitive("L2"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("Switch", new Term[] {
				Primitive.newPrimitive("S1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("Switch", new Term[] {
				Primitive.newPrimitive("S2"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("Link", new Term[] {
				Primitive.newPrimitive("off"),
				Primitive.newPrimitive("off")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Switches().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
