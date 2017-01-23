max: 1;
// each component has to be allocated to exactly one ECU
alloc_c1: c1_platformtype.0.e1 + c1_platformtype.0.e2 + c1_platformtype.0.e3 + c1_test.e1 = 1;
alloc_c2: c2_platformtype.0.e1 + c2_platformtype.0.e2 + c2_platformtype.0.e3 + c2_test.e1 = 1;
alloc_c3: c3_platformtype.0.e1 + c3_platformtype.0.e2 + c3_platformtype.0.e3 + c3_test.e1= 1;
// variables for c1
bin c1_platformtype.0.e1;
bin c1_platformtype.0.e2;
bin c1_platformtype.0.e3;
bin c1_test.e1;
// variables for c2
bin c2_platformtype.0.e1;
bin c2_platformtype.0.e2;
bin c2_platformtype.0.e3;
bin c2_test.e1;
// variables for c3
bin c3_platformtype.0.e1;
bin c3_platformtype.0.e2;
bin c3_platformtype.0.e3;
bin c3_test.e1;