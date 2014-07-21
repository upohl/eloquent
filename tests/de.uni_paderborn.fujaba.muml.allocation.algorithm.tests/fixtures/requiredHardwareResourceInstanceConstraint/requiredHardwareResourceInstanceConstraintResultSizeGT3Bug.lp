max: 1;
// each component has to be allocated to exactly one ECU
c1: c1_e1 + c1_e2 + c1_e3 = 1;
c2: c2_e1 + c2_e2 + c2_e3 = 1;
c3: c3_e1 + c3_e2 + c3_e3 = 1;
foo: c1_e1 + c1_e2 + c1_e3 = 1;
// variables for c1
bin c1_e1;
bin c1_e2;
bin c1_e3;
// variables for c2
bin c2_e1;
bin c2_e2;
bin c2_e3;
// variables for c3
bin c3_e1;
bin c3_e2;
bin c3_e3;