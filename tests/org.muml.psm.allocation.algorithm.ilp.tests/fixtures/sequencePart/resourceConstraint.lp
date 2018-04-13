max: 1;
// each class from sub1 should be related to at least one package from sub3
cls2pkg_ic.sub1.A1: ic.sub1.A1_ic.sub3.p1 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A1_ic.sub3.p3 >= 1;
cls2pkg_ic.sub1.A2: ic.sub1.A2_ic.sub3.p1 + ic.sub1.A2_ic.sub3.p2 + ic.sub1.A2_ic.sub3.p3 >= 1;
cls2pkg_ic.sub1.A3: ic.sub1.A3_ic.sub3.p1 + ic.sub1.A3_ic.sub3.p2 + ic.sub1.A3_ic.sub3.p3 >= 1;

cls2cls_ic.sub1.A1: ic.sub1.A1_ic.sub2.B1 + ic.sub1.A1_ic.sub2.B2 + ic.sub1.A1_ic.sub2.B3 >= 1;
cls2cls_ic.sub1.A2: ic.sub1.A2_ic.sub2.B1 + ic.sub1.A2_ic.sub2.B2 + ic.sub1.A2_ic.sub2.B3 >= 1;
cls2cls_ic.sub1.A3: ic.sub1.A3_ic.sub2.B1 + ic.sub1.A3_ic.sub2.B2 + ic.sub1.A3_ic.sub2.B3 >= 1;

// helpers
ic.sub1.A1_ic.sub3.p1_ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3 <= ic.sub1.A1_ic.sub3.p1;
ic.sub1.A1_ic.sub3.p1_ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3 <= ic.sub1.A1_ic.sub3.p2;
ic.sub1.A1_ic.sub3.p1_ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3 <= ic.sub1.A2_ic.sub2.B3;
ic.sub1.A1_ic.sub3.p1 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A2_ic.sub2.B3 <= 2 + ic.sub1.A1_ic.sub3.p1_ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3;

ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B2 <= ic.sub1.A1_ic.sub3.p1;
ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B2 <= ic.sub1.A2_ic.sub2.B2;
ic.sub1.A1_ic.sub3.p1 + ic.sub1.A2_ic.sub2.B2 <= 1 + ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B2;

res: 7 * ic.sub1.A1_ic.sub3.p1
	+ 8 * ic.sub1.A1_ic.sub3.p1_ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3
	+ 30 * ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B2 <= 42;
	
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
bin ic.sub1.A1_ic.sub3.p1_ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3;
bin ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B2;