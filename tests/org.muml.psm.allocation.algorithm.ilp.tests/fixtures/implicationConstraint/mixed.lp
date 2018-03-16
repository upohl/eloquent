max: 1;
// each class should be related to at least one package
atLeastOne_ic.sub1.A1: ic.sub1.A1_ic.sub3.p1 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A1_ic.sub3.p3 >= 1;
atLeastOne_ic.sub1.A2: ic.sub1.A2_ic.sub3.p1 + ic.sub1.A2_ic.sub3.p2 + ic.sub1.A2_ic.sub3.p3 >= 1;
atLeastOne_ic.sub1.A3: ic.sub1.A3_ic.sub3.p1 + ic.sub1.A3_ic.sub3.p2 + ic.sub1.A3_ic.sub3.p3 >= 1;

// our implication constraint results in three inequalities:
// (note the reordering due to the sorting)

// If sub1.A1 is related to sub3.p1, then
// (sub1.A1 is also related to sub3.p2 or sub1.A2 is related to sub3.p2)
mixed: ic.sub1.A1_ic.sub3.p1 <= 0 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A2_ic.sub3.p2;

// If (sub1.A1 is related to sub3.p1 and sub1.A2 is related to sub3.p2), then
// sub1.A3 is related to sub3.p3
mixed: ic.sub1.A1_ic.sub3.p1 + ic.sub1.A2_ic.sub3.p2 <= 1 + ic.sub1.A3_ic.sub3.p3;

// If (sub1.A2 is related to sub3.p2 and sub1.A3 is related to sub3.p3), then
// (sub1.A1 is related to sub3.p2 or sub1.A3 is also related to sub3.p2)
mixed: ic.sub1.A2_ic.sub3.p2 + ic.sub1.A3_ic.sub3.p3 <= 1 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A3_ic.sub3.p2;

// variables for ic.sub1.A1
bin ic.sub1.A1_ic.sub3.p1;
bin ic.sub1.A1_ic.sub3.p2;
bin ic.sub1.A1_ic.sub3.p3;
// variables for ic.sub1.A2
bin ic.sub1.A2_ic.sub3.p1;
bin ic.sub1.A2_ic.sub3.p2;
bin ic.sub1.A2_ic.sub3.p3;
// variables for ic.sub1.A3
bin ic.sub1.A3_ic.sub3.p1;
bin ic.sub1.A3_ic.sub3.p2;
bin ic.sub1.A3_ic.sub3.p3;