min: -10 * ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub2.B2_ic.sub1.A3_ic.sub3.p3
	 + 1 * ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub3.p2
	 + 5 * ic.sub1.A1_ic.sub3.p1
	 + -15 * ic.sub1.A3_ic.sub3.p1;
// each class from sub1 should be related to at least one package from sub3
cls2pkg_ic.sub1.A1: ic.sub1.A1_ic.sub3.p1 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A1_ic.sub3.p3 >= 1;
cls2pkg_ic.sub1.A2: ic.sub1.A2_ic.sub3.p1 + ic.sub1.A2_ic.sub3.p2 + ic.sub1.A2_ic.sub3.p3 >= 1;
cls2pkg_ic.sub1.A3: ic.sub1.A3_ic.sub3.p1 + ic.sub1.A3_ic.sub3.p2 + ic.sub1.A3_ic.sub3.p3 >= 1;

cls2cls_ic.sub1.A1: ic.sub1.A1_ic.sub2.B1 + ic.sub1.A1_ic.sub2.B2 + ic.sub1.A1_ic.sub2.B3 >= 1;
cls2cls_ic.sub1.A2: ic.sub1.A2_ic.sub2.B1 + ic.sub1.A2_ic.sub2.B2 + ic.sub1.A2_ic.sub2.B3 >= 1;
cls2cls_ic.sub1.A3: ic.sub1.A3_ic.sub2.B1 + ic.sub1.A3_ic.sub2.B2 + ic.sub1.A3_ic.sub2.B3 >= 1;

// helpers
ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub2.B2_ic.sub1.A3_ic.sub3.p3 <= ic.sub1.A1_ic.sub2.B1;
ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub2.B2_ic.sub1.A3_ic.sub3.p3 <= ic.sub1.A2_ic.sub2.B2;
ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub2.B2_ic.sub1.A3_ic.sub3.p3 <= ic.sub1.A3_ic.sub3.p3;
ic.sub1.A1_ic.sub2.B1 + ic.sub1.A2_ic.sub2.B2 + ic.sub1.A3_ic.sub3.p3 <= 2 + ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub2.B2_ic.sub1.A3_ic.sub3.p3;

ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub3.p2 <= ic.sub1.A1_ic.sub2.B1;
ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub3.p2 <= ic.sub1.A2_ic.sub3.p2;
ic.sub1.A1_ic.sub2.B1 + ic.sub1.A2_ic.sub3.p2 <= 1 + ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub3.p2;

// variables for ic.sub1.A1 (cls2pkg)
bin ic.sub1.A1_ic.sub3.p1;
bin ic.sub1.A1_ic.sub3.p2;
bin ic.sub1.A1_ic.sub3.p3;
// variables for ic.sub1.A2 (cls2pkg)
bin ic.sub1.A2_ic.sub3.p1;
bin ic.sub1.A2_ic.sub3.p2;
bin ic.sub1.A2_ic.sub3.p3;
// variables for ic.sub1.A3 (cls2pkg)
bin ic.sub1.A3_ic.sub3.p1;
bin ic.sub1.A3_ic.sub3.p2;
bin ic.sub1.A3_ic.sub3.p3;

// variables for ic.sub1.A1 (cls2cls)
bin ic.sub1.A1_ic.sub2.B1;
bin ic.sub1.A1_ic.sub2.B2;
bin ic.sub1.A1_ic.sub2.B3;
// variables for ic.sub1.A1 (cls2cls)
bin ic.sub1.A2_ic.sub2.B1;
bin ic.sub1.A2_ic.sub2.B2;
bin ic.sub1.A2_ic.sub2.B3;
// variables for ic.sub1.A1 (cls2cls)
bin ic.sub1.A3_ic.sub2.B1;
bin ic.sub1.A3_ic.sub2.B2;
bin ic.sub1.A3_ic.sub2.B3;

// helper variables
bin ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub2.B2_ic.sub1.A3_ic.sub3.p3;
bin ic.sub1.A1_ic.sub2.B1_ic.sub1.A2_ic.sub3.p2;
