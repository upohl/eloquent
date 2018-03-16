max: 1;
// each class from sub1 should be related to at least one package from sub3
atLeastOne_ic.sub1.A1: ic.sub1.A1_ic.sub3.p1 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A1_ic.sub3.p3 >= 1;
atLeastOne_ic.sub1.A2: ic.sub1.A2_ic.sub3.p1 + ic.sub1.A2_ic.sub3.p2 + ic.sub1.A2_ic.sub3.p3 >= 1;
atLeastOne_ic.sub1.A3: ic.sub1.A3_ic.sub3.p1 + ic.sub1.A3_ic.sub3.p2 + ic.sub1.A3_ic.sub3.p3 >= 1;

// each package from sub3 should be related to at least one class from sub2
atLeastOnePkg_ic.sub3.p1: ic.sub3.p1_ic.sub2.B1 + ic.sub3.p1_ic.sub2.B2 + ic.sub3.p1_ic.sub2.B3 >= 1;
atLeastOnePkg_ic.sub3.p2: ic.sub3.p2_ic.sub2.B1 + ic.sub3.p2_ic.sub2.B2 + ic.sub3.p2_ic.sub2.B3 >= 1;
atLeastOnePkg_ic.sub3.p3: ic.sub3.p3_ic.sub2.B1 + ic.sub3.p3_ic.sub2.B2 + ic.sub3.p3_ic.sub2.B3 >= 1;

// helpers
ic.sub1.A1_ic.sub3.p1_ic.sub3.p2_ic.sub2.B2 <= ic.sub1.A1_ic.sub3.p1;
ic.sub1.A1_ic.sub3.p1_ic.sub3.p2_ic.sub2.B2 <= ic.sub3.p2_ic.sub2.B2;
ic.sub1.A1_ic.sub3.p1 + ic.sub3.p2_ic.sub2.B2 <= 1 + ic.sub1.A1_ic.sub3.p1_ic.sub3.p2_ic.sub2.B2;

// imp1
imp1: ic.sub1.A1_ic.sub3.p1_ic.sub3.p2_ic.sub2.B2 <= 0 + ic.sub3.p3_ic.sub2.B3;

// imp2
imp2: ic.sub1.A1_ic.sub3.p1 <= 0 + ic.sub3.p3_ic.sub2.B3;
imp2: ic.sub1.A3_ic.sub3.p1 <= 0 + ic.sub3.p3_ic.sub2.B1;

// helpers
ic.sub1.A3_ic.sub3.p1_ic.sub3.p3_ic.sub2.B3 <= ic.sub1.A3_ic.sub3.p1;
ic.sub1.A3_ic.sub3.p1_ic.sub3.p3_ic.sub2.B3 <= ic.sub3.p3_ic.sub2.B3;
ic.sub1.A3_ic.sub3.p1 + ic.sub3.p3_ic.sub2.B3 <= 1 + ic.sub1.A3_ic.sub3.p1_ic.sub3.p3_ic.sub2.B3;

ic.sub1.A3_ic.sub3.p3_ic.sub3.p3_ic.sub2.B3 <= ic.sub1.A3_ic.sub3.p3; 
ic.sub1.A3_ic.sub3.p3_ic.sub3.p3_ic.sub2.B3 <= ic.sub3.p3_ic.sub2.B3;
ic.sub1.A3_ic.sub3.p3 + ic.sub3.p3_ic.sub2.B3 <= 1 + ic.sub1.A3_ic.sub3.p3_ic.sub3.p3_ic.sub2.B3;

//imp 3
imp3: ic.sub1.A3_ic.sub3.p1_ic.sub3.p3_ic.sub2.B3 + ic.sub1.A3_ic.sub3.p3_ic.sub3.p3_ic.sub2.B3
	<= 1 + ic.sub1.A1_ic.sub3.p1_ic.sub3.p2_ic.sub2.B2;

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

// helper variables
bin ic.sub1.A1_ic.sub3.p1_ic.sub3.p2_ic.sub2.B2;
bin ic.sub1.A3_ic.sub3.p1_ic.sub3.p3_ic.sub2.B3;
bin ic.sub1.A3_ic.sub3.p3_ic.sub3.p3_ic.sub2.B3;