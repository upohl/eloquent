max: 1;
// each package from sub3 should be related to at least one class from sub2
atLeastOnePkg_ic.sub3.p1: ic.sub3.p1_ic.sub2.B1 + ic.sub3.p1_ic.sub2.B2 + ic.sub3.p1_ic.sub2.B3 >= 1;
atLeastOnePkg_ic.sub3.p2: ic.sub3.p2_ic.sub2.B1 + ic.sub3.p2_ic.sub2.B2 + ic.sub3.p2_ic.sub2.B3 >= 1;
atLeastOnePkg_ic.sub3.p3: ic.sub3.p3_ic.sub2.B1 + ic.sub3.p3_ic.sub2.B2 + ic.sub3.p3_ic.sub2.B3 >= 1;

// for an empty premise, no inequalities are generated (it trivially holds)

// variables for ic.sub3.p1
bin ic.sub3.p1_ic.sub2.B1;
bin ic.sub3.p1_ic.sub2.B2;
bin ic.sub3.p1_ic.sub2.B3;
// variables for ic.sub3.p2
bin ic.sub3.p2_ic.sub2.B1;
bin ic.sub3.p2_ic.sub2.B2;
bin ic.sub3.p2_ic.sub2.B3;
// variables for ic.sub3.p3
bin ic.sub3.p3_ic.sub2.B1;
bin ic.sub3.p3_ic.sub2.B2;
bin ic.sub3.p3_ic.sub2.B3;