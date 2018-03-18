max: 1;
// each class from sub1 should be related to at least one package from sub3
atLeastOne_ic.sub1.A1: ic.sub1.A1_ic.sub3.p1 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A1_ic.sub3.p3 >= 1;
atLeastOne_ic.sub1.A2: ic.sub1.A2_ic.sub3.p1 + ic.sub1.A2_ic.sub3.p2 + ic.sub1.A2_ic.sub3.p3 >= 1;
atLeastOne_ic.sub1.A3: ic.sub1.A3_ic.sub3.p1 + ic.sub1.A3_ic.sub3.p2 + ic.sub1.A3_ic.sub3.p3 >= 1;

// each package from sub3 should be related to at least one class from sub2
atLeastOnePkg_ic.sub3.p1: ic.sub3.p1_ic.sub2.B1 + ic.sub3.p1_ic.sub2.B2 + ic.sub3.p1_ic.sub2.B3 >= 1;
atLeastOnePkg_ic.sub3.p2: ic.sub3.p2_ic.sub2.B1 + ic.sub3.p2_ic.sub2.B2 + ic.sub3.p2_ic.sub2.B3 >= 1;
atLeastOnePkg_ic.sub3.p3: ic.sub3.p3_ic.sub2.B1 + ic.sub3.p3_ic.sub2.B2 + ic.sub3.p3_ic.sub2.B3 >= 1;

// each class from sub2 can be related to arbitrary many classes from sub1
cl2cls_ic.sub2.B1: ic.sub2.B1_ic.sub1.A1 + ic.sub2.B1_ic.sub1.A2 + ic.sub2.B1_ic.sub1.A3 >= 0;
cl2cls_ic.sub2.B2: ic.sub2.B2_ic.sub1.A1 + ic.sub2.B2_ic.sub1.A2 + ic.sub2.B2_ic.sub1.A3 >= 0;
cl2cls_ic.sub2.B3: ic.sub2.B3_ic.sub1.A1 + ic.sub2.B3_ic.sub1.A2 + ic.sub2.B3_ic.sub1.A3 >= 0;

// helpers
ic.sub1.A1_ic.sub3.p1_ic.sub2.B1_ic.sub1.A1_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2_ic.sub2.B2 <= ic.sub1.A1_ic.sub3.p1;
ic.sub1.A1_ic.sub3.p1_ic.sub2.B1_ic.sub1.A1_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2_ic.sub2.B2 <= ic.sub2.B1_ic.sub1.A1;
ic.sub1.A1_ic.sub3.p1_ic.sub2.B1_ic.sub1.A1_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2_ic.sub2.B2 <= ic.sub2.B2_ic.sub1.A2;
ic.sub1.A1_ic.sub3.p1_ic.sub2.B1_ic.sub1.A1_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2_ic.sub2.B2 <= ic.sub3.p2_ic.sub2.B2;
ic.sub1.A1_ic.sub3.p1 + ic.sub2.B1_ic.sub1.A1 + ic.sub2.B2_ic.sub1.A2 + ic.sub3.p2_ic.sub2.B2 <= 3 + ic.sub1.A1_ic.sub3.p1_ic.sub2.B1_ic.sub1.A1_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2_ic.sub2.B2;

ic.sub1.A2_ic.sub3.p2_ic.sub2.B2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p3_ic.sub2.B3 <= ic.sub1.A2_ic.sub3.p2;
ic.sub1.A2_ic.sub3.p2_ic.sub2.B2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p3_ic.sub2.B3 <= ic.sub2.B2_ic.sub1.A2;
ic.sub1.A2_ic.sub3.p2_ic.sub2.B2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p3_ic.sub2.B3 <= ic.sub2.B3_ic.sub1.A3;
ic.sub1.A2_ic.sub3.p2_ic.sub2.B2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p3_ic.sub2.B3 <= ic.sub3.p3_ic.sub2.B3;
ic.sub1.A2_ic.sub3.p2 + ic.sub2.B2_ic.sub1.A2 + ic.sub2.B3_ic.sub1.A3 + ic.sub3.p3_ic.sub2.B3 <= 3 + ic.sub1.A2_ic.sub3.p2_ic.sub2.B2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p3_ic.sub2.B3;

ic.sub1.A3_ic.sub3.p1_ic.sub2.B1_ic.sub1.A3_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1_ic.sub2.B3 <= ic.sub1.A3_ic.sub3.p1;
ic.sub1.A3_ic.sub3.p1_ic.sub2.B1_ic.sub1.A3_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1_ic.sub2.B3 <= ic.sub2.B1_ic.sub1.A3;
ic.sub1.A3_ic.sub3.p1_ic.sub2.B1_ic.sub1.A3_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1_ic.sub2.B3 <= ic.sub2.B3_ic.sub1.A3;
ic.sub1.A3_ic.sub3.p1_ic.sub2.B1_ic.sub1.A3_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1_ic.sub2.B3 <= ic.sub3.p1_ic.sub2.B3;
ic.sub1.A3_ic.sub3.p1 + ic.sub2.B1_ic.sub1.A3 + ic.sub2.B3_ic.sub1.A3 + ic.sub3.p1_ic.sub2.B3 <= 3 + ic.sub1.A3_ic.sub3.p1_ic.sub2.B1_ic.sub1.A3_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1_ic.sub2.B3;

// constraint c1
c1: ic.sub1.A1_ic.sub3.p1_ic.sub2.B1_ic.sub1.A1_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2_ic.sub2.B2
	+ ic.sub1.A2_ic.sub3.p2_ic.sub2.B2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p3_ic.sub2.B3
	+ ic.sub1.A3_ic.sub3.p1_ic.sub2.B1_ic.sub1.A3_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1_ic.sub2.B3 = 0;
	
// constraint c2
c2: ic.sub2.B1_ic.sub1.A2 + ic.sub2.B2_ic.sub1.A3 = 0;

// helpers
ic.sub1.A2_ic.sub3.p2_ic.sub2.B1_ic.sub1.A1_ic.sub3.p3_ic.sub2.B3 <= ic.sub1.A2_ic.sub3.p2;
ic.sub1.A2_ic.sub3.p2_ic.sub2.B1_ic.sub1.A1_ic.sub3.p3_ic.sub2.B3 <= ic.sub2.B1_ic.sub1.A1;
ic.sub1.A2_ic.sub3.p2_ic.sub2.B1_ic.sub1.A1_ic.sub3.p3_ic.sub2.B3 <= ic.sub3.p3_ic.sub2.B3;
ic.sub1.A2_ic.sub3.p2 + ic.sub2.B1_ic.sub1.A1 + ic.sub3.p3_ic.sub2.B3 <= 2 + ic.sub1.A2_ic.sub3.p2_ic.sub2.B1_ic.sub1.A1_ic.sub3.p3_ic.sub2.B3;

ic.sub1.A3_ic.sub3.p3_ic.sub2.B2_ic.sub1.A2_ic.sub3.p1_ic.sub2.B1 <= ic.sub1.A3_ic.sub3.p3;
ic.sub1.A3_ic.sub3.p3_ic.sub2.B2_ic.sub1.A2_ic.sub3.p1_ic.sub2.B1 <= ic.sub2.B2_ic.sub1.A2;
ic.sub1.A3_ic.sub3.p3_ic.sub2.B2_ic.sub1.A2_ic.sub3.p1_ic.sub2.B1 <= ic.sub3.p1_ic.sub2.B1;
ic.sub1.A3_ic.sub3.p3 + ic.sub2.B2_ic.sub1.A2 + ic.sub3.p1_ic.sub2.B1 <= 2 + ic.sub1.A3_ic.sub3.p3_ic.sub2.B2_ic.sub1.A2_ic.sub3.p1_ic.sub2.B1;

// constraint c3
c3: ic.sub1.A2_ic.sub3.p2_ic.sub2.B1_ic.sub1.A1_ic.sub3.p3_ic.sub2.B3 + ic.sub1.A3_ic.sub3.p3_ic.sub2.B2_ic.sub1.A2_ic.sub3.p1_ic.sub2.B1 = 0;

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

// variables for ic.sub2.B1
bin ic.sub2.B1_ic.sub1.A1;
bin ic.sub2.B1_ic.sub1.A2;
bin ic.sub2.B1_ic.sub1.A3;
// variables for ic.sub2.B2
bin ic.sub2.B2_ic.sub1.A1;
bin ic.sub2.B2_ic.sub1.A2;
bin ic.sub2.B2_ic.sub1.A3;
// variables for ic.sub2.B3
bin ic.sub2.B3_ic.sub1.A1;
bin ic.sub2.B3_ic.sub1.A2;
bin ic.sub2.B3_ic.sub1.A3;

bin ic.sub1.A1_ic.sub3.p1_ic.sub2.B1_ic.sub1.A1_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2_ic.sub2.B2;
bin ic.sub1.A2_ic.sub3.p2_ic.sub2.B2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p3_ic.sub2.B3;
bin ic.sub1.A3_ic.sub3.p1_ic.sub2.B1_ic.sub1.A3_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1_ic.sub2.B3;
bin ic.sub1.A2_ic.sub3.p2_ic.sub2.B1_ic.sub1.A1_ic.sub3.p3_ic.sub2.B3;
bin ic.sub1.A3_ic.sub3.p3_ic.sub2.B2_ic.sub1.A2_ic.sub3.p1_ic.sub2.B1;
