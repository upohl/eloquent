max: 1;
// each class from sub1 should be related to at least one package from sub3
cls2pkg_ic.sub1.A1: ic.sub1.A1_ic.sub3.p1 + ic.sub1.A1_ic.sub3.p2 + ic.sub1.A1_ic.sub3.p3 >= 1;
cls2pkg_ic.sub1.A2: ic.sub1.A2_ic.sub3.p1 + ic.sub1.A2_ic.sub3.p2 + ic.sub1.A2_ic.sub3.p3 >= 1;
cls2pkg_ic.sub1.A3: ic.sub1.A3_ic.sub3.p1 + ic.sub1.A3_ic.sub3.p2 + ic.sub1.A3_ic.sub3.p3 >= 1;

cls2cls_ic.sub1.A1: ic.sub1.A1_ic.sub2.B1 + ic.sub1.A1_ic.sub2.B2 + ic.sub1.A1_ic.sub2.B3 >= 1;
cls2cls_ic.sub1.A2: ic.sub1.A2_ic.sub2.B1 + ic.sub1.A2_ic.sub2.B2 + ic.sub1.A2_ic.sub2.B3 >= 1;
cls2cls_ic.sub1.A3: ic.sub1.A3_ic.sub2.B1 + ic.sub1.A3_ic.sub2.B2 + ic.sub1.A3_ic.sub2.B3 >= 1;

r1: ic.sub1.A1_ic.sub2.B1 + ic.sub1.A1_ic.sub3.p1 = 1;
r1: ic.sub1.A2_ic.sub3.p1 = 1;

// group 2, eq class A_2
r2: ic.sub1.A1_ic.sub2.B3 = 1;
// group 2, eq class B_2
r2: ic.sub1.A2_ic.sub2.B3 + ic.sub1.A2_ic.sub3.p1 = 1;

// group 1 helpers
ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B1 <= ic.sub1.A1_ic.sub3.p1;
ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B1 <= ic.sub1.A2_ic.sub2.B1;
ic.sub1.A1_ic.sub3.p1 + ic.sub1.A2_ic.sub2.B1 <= 1 + ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B1;

ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2 <= ic.sub1.A1_ic.sub3.p2;
ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2 <= ic.sub1.A2_ic.sub2.B2;
ic.sub1.A1_ic.sub3.p2 + ic.sub1.A2_ic.sub2.B2 <= 1 + ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2;

ic.sub1.A1_ic.sub3.p3_ic.sub1.A2_ic.sub2.B3 <= ic.sub1.A1_ic.sub3.p3;
ic.sub1.A1_ic.sub3.p3_ic.sub1.A2_ic.sub2.B3 <= ic.sub1.A2_ic.sub2.B3;
ic.sub1.A1_ic.sub3.p3 + ic.sub1.A2_ic.sub2.B3 <= 1 + ic.sub1.A1_ic.sub3.p3_ic.sub1.A2_ic.sub2.B3;

ic.sub1.A2_ic.sub3.p1_ic.sub1.A3_ic.sub2.B1 <= ic.sub1.A2_ic.sub3.p1;
ic.sub1.A2_ic.sub3.p1_ic.sub1.A3_ic.sub2.B1 <= ic.sub1.A3_ic.sub2.B1;
ic.sub1.A2_ic.sub3.p1 + ic.sub1.A3_ic.sub2.B1 <= 1 + ic.sub1.A2_ic.sub3.p1_ic.sub1.A3_ic.sub2.B1;

ic.sub1.A2_ic.sub3.p3_ic.sub1.A3_ic.sub2.B3 <= ic.sub1.A2_ic.sub3.p3;
ic.sub1.A2_ic.sub3.p3_ic.sub1.A3_ic.sub2.B3 <= ic.sub1.A3_ic.sub2.B3;
ic.sub1.A2_ic.sub3.p3 + ic.sub1.A3_ic.sub2.B3 <= 1 + ic.sub1.A2_ic.sub3.p3_ic.sub1.A3_ic.sub2.B3;

// group 1, eq class A_1
r2: ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B1 + ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2 + ic.sub1.A1_ic.sub3.p3_ic.sub1.A2_ic.sub2.B3 = 1;
// group 1, eq class B_1
r2: ic.sub1.A2_ic.sub3.p1_ic.sub1.A3_ic.sub2.B1 + ic.sub1.A2_ic.sub3.p3_ic.sub1.A3_ic.sub2.B3 = 1;

// group 3 helpers
ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B3_ic.sub1.A2_ic.sub3.p2 <= ic.sub1.A1_ic.sub3.p1;
ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B3_ic.sub1.A2_ic.sub3.p2 <= ic.sub1.A2_ic.sub2.B3;
ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B3_ic.sub1.A2_ic.sub3.p2 <= ic.sub1.A2_ic.sub3.p2;
ic.sub1.A1_ic.sub3.p1 + ic.sub1.A2_ic.sub2.B3 + ic.sub1.A2_ic.sub3.p2 <= 2 + ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B3_ic.sub1.A2_ic.sub3.p2;

ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2 <= ic.sub1.A1_ic.sub3.p2;
ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2 <= ic.sub1.A2_ic.sub2.B2;
ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2 <= ic.sub1.A2_ic.sub3.p2;
ic.sub1.A1_ic.sub3.p2 + ic.sub1.A2_ic.sub2.B2 + ic.sub1.A2_ic.sub3.p2 <= 2 + ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2;

ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1 <= ic.sub1.A1_ic.sub3.p2;
ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1 <= ic.sub1.A2_ic.sub2.B3;
ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1 <= ic.sub1.A3_ic.sub3.p1;
ic.sub1.A1_ic.sub3.p2 + ic.sub1.A2_ic.sub2.B3 + ic.sub1.A3_ic.sub3.p1 <= 2 + ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1;

// group 3, eq class A_3
r2: ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B3_ic.sub1.A2_ic.sub3.p2 + ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2 = 1;
// group 3, eq class B_3
r2: ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1 = 1;

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
bin ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B1;
bin ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2;
bin ic.sub1.A1_ic.sub3.p3_ic.sub1.A2_ic.sub2.B3;
bin ic.sub1.A2_ic.sub3.p1_ic.sub1.A3_ic.sub2.B1;
bin ic.sub1.A2_ic.sub3.p3_ic.sub1.A3_ic.sub2.B3;
bin ic.sub1.A1_ic.sub3.p1_ic.sub1.A2_ic.sub2.B3_ic.sub1.A2_ic.sub3.p2;
bin ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B2_ic.sub1.A2_ic.sub3.p2;
bin ic.sub1.A1_ic.sub3.p2_ic.sub1.A2_ic.sub2.B3_ic.sub1.A3_ic.sub3.p1;