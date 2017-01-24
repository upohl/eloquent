max: 1;
// each component has to be allocated to exactly one ECU
alloc_c1: c1_platformtype.0.e1 + c1_platformtype.0.e2 + c1_platformtype.0.e3 = 1;
alloc_c2: c2_platformtype.0.e1 + c2_platformtype.0.e2 + c2_platformtype.0.e3 = 1;
alloc_sc1: sc1_platformtype.0.e1 + sc1_platformtype.0.e2 + sc1_platformtype.0.e3 = 1;
alloc_sc1.c1: sc1.c1_platformtype.0.e1 + sc1.c1_platformtype.0.e2 + sc1.c1_platformtype.0.e3 = 1;
// constraints for c1_platformtype.0.e1_c2_platformtype.0.e1
c1_platformtype.0.e1_c2_platformtype.0.e1 <= c1_platformtype.0.e1;
c1_platformtype.0.e1_c2_platformtype.0.e1 <= c2_platformtype.0.e1;
c1_platformtype.0.e1 + c2_platformtype.0.e1 <= 1 + c1_platformtype.0.e1_c2_platformtype.0.e1;
// constraints for c1_platformtype.0.e2_c2_platformtype.0.e2
c1_platformtype.0.e2_c2_platformtype.0.e2 <= c1_platformtype.0.e2;
c1_platformtype.0.e2_c2_platformtype.0.e2 <= c2_platformtype.0.e2;
c1_platformtype.0.e2 + c2_platformtype.0.e2 <= 1 + c1_platformtype.0.e2_c2_platformtype.0.e2;
// constraints for c1_platformtype.0.e3_c2_platformtype.0.e3
c1_platformtype.0.e3_c2_platformtype.0.e3 <= c1_platformtype.0.e3;
c1_platformtype.0.e3_c2_platformtype.0.e3 <= c2_platformtype.0.e3;
c1_platformtype.0.e3 + c2_platformtype.0.e3 <= 1 + c1_platformtype.0.e3_c2_platformtype.0.e3;
// same location constraint "foo"
foo_c1_c2: c1_platformtype.0.e1_c2_platformtype.0.e1 + c1_platformtype.0.e2_c2_platformtype.0.e2 + c1_platformtype.0.e3_c2_platformtype.0.e3 >= 1;
// constraints for sc1_platformtype.0.e1_sc1.c1_platformtype.0.e1
sc1_platformtype.0.e1_sc1.c1_platformtype.0.e1 <= sc1_platformtype.0.e1;
sc1_platformtype.0.e1_sc1.c1_platformtype.0.e1 <= sc1.c1_platformtype.0.e1;
sc1_platformtype.0.e1 + sc1.c1_platformtype.0.e1 <= 1 + sc1_platformtype.0.e1_sc1.c1_platformtype.0.e1;
// constraints for sc1_platformtype.0.e2_sc1.c1_platformtype.0.e2
sc1_platformtype.0.e2_sc1.c1_platformtype.0.e2 <= sc1_platformtype.0.e2;
sc1_platformtype.0.e2_sc1.c1_platformtype.0.e2 <= sc1.c1_platformtype.0.e2;
sc1_platformtype.0.e2 + sc1.c1_platformtype.0.e2 <= 1 + sc1_platformtype.0.e2_sc1.c1_platformtype.0.e2;
// constraints for sc1_platformtype.0.e3_sc1.c1_platformtype.0.e3
sc1_platformtype.0.e3_sc1.c1_platformtype.0.e3 <= sc1_platformtype.0.e3;
sc1_platformtype.0.e3_sc1.c1_platformtype.0.e3 <= sc1.c1_platformtype.0.e3;
sc1_platformtype.0.e3 + sc1.c1_platformtype.0.e3 <= 1 + sc1_platformtype.0.e3_sc1.c1_platformtype.0.e3;
// same location constraint "sc1Embedded":
sc1Embedded_sc1_sc1.c1: sc1_platformtype.0.e1_sc1.c1_platformtype.0.e1 + sc1_platformtype.0.e2_sc1.c1_platformtype.0.e2 + sc1_platformtype.0.e3_sc1.c1_platformtype.0.e3 >= 1;
// variables for c1
bin c1_platformtype.0.e1;
bin c1_platformtype.0.e2;
bin c1_platformtype.0.e3;
// variables for c2
bin c2_platformtype.0.e1;
bin c2_platformtype.0.e2;
bin c2_platformtype.0.e3;
// variables for sc1.c1
bin sc1.c1_platformtype.0.e1;
bin sc1.c1_platformtype.0.e2;
bin sc1.c1_platformtype.0.e3;
// variables for sc1
bin sc1_platformtype.0.e1;
bin sc1_platformtype.0.e2;
bin sc1_platformtype.0.e3;
// helper variables for the same location constraint "foo"
bin c1_platformtype.0.e1_c2_platformtype.0.e1;
bin c1_platformtype.0.e2_c2_platformtype.0.e2;
bin c1_platformtype.0.e3_c2_platformtype.0.e3;
// helper variables for the same location constraint "sc1Embedded"
bin sc1_platformtype.0.e1_sc1.c1_platformtype.0.e1;
bin sc1_platformtype.0.e2_sc1.c1_platformtype.0.e2;
bin sc1_platformtype.0.e3_sc1.c1_platformtype.0.e3;