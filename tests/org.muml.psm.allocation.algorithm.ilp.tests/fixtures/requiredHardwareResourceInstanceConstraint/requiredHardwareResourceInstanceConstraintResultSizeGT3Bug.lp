max: 1;
// each component has to be allocated to exactly one ECU
c1: c1_platformtype.0.e1 + c1_platformtype.0.e2 + c1_platformtype.0.e3 = 1;
c2: c2_platformtype.0.e1 + c2_platformtype.0.e2 + c2_platformtype.0.e3 = 1;
c3: c3_platformtype.0.e1 + c3_platformtype.0.e2 + c3_platformtype.0.e3 = 1;
foo: c1_platformtype.0.e1 + c1_platformtype.0.e2 + c1_platformtype.0.e3 = 1;
// variables for c1
bin c1_platformtype.0.e1;
bin c1_platformtype.0.e2;
bin c1_platformtype.0.e3;
// variables for c2
bin c2_platformtype.0.e1;
bin c2_platformtype.0.e2;
bin c2_platformtype.0.e3;
// variables for c3
bin c3_platformtype.0.e1;
bin c3_platformtype.0.e2;
bin c3_platformtype.0.e3;