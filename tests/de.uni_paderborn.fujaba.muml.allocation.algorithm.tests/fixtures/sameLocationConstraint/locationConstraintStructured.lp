max: ;
// each component has to be allocated to exactly one ECU
c1: c1_e1 + c1_e2 + c1_e3 = 1;
c2: c2_e1 + c2_e2 + c2_e3 = 1;
sc1: sc1_e1 + sc1_e2 + sc1_e3 = 1;
sc1.c1: sc1.c1_e1 + sc1.c1_e2 + sc1.c1_e3 = 1;
// constraints for c1_e1_c2_e1
c1_e1_c2_e1 <= c1_e1;
c1_e1_c2_e1 <= c2_e1;
c1_e1 + c2_e1 <= 1 + c1_e1_c2_e1;
// constraints for c1_e2_c2_e2
c1_e2_c2_e2 <= c1_e2;
c1_e2_c2_e2 <= c2_e2;
c1_e2 + c2_e2 <= 1 + c1_e2_c2_e2;
// constraints for c1_e3_c2_e3
c1_e3_c2_e3 <= c1_e3;
c1_e3_c2_e3 <= c2_e3;
c1_e3 + c2_e3 <= 1 + c1_e3_c2_e3;
// same location constraint "foo"
foo: c1_e1_c2_e1 + c1_e2_c2_e2 + c1_e3_c2_e3 = 1;
// constraints for sc1_e1_sc1.c1_e1
sc1_e1_sc1.c1_e1 <= sc1_e1;
sc1_e1_sc1.c1_e1 <= sc1.c1_e1;
sc1_e1 + sc1.c1_e1 <= 1 + sc1_e1_sc1.c1_e1;
// constraints for sc1_e2_sc1.c1_e2
sc1_e2_sc1.c1_e2 <= sc1_e2;
sc1_e2_sc1.c1_e2 <= sc1.c1_e2;
sc1_e2 + sc1.c1_e2 <= 1 + sc1_e2_sc1.c1_e2;
// constraints for sc1_e3_sc1.c1_e3
sc1_e3_sc1.c1_e3 <= sc1_e3;
sc1_e3_sc1.c1_e3 <= sc1.c1_e3;
sc1_e3 + sc1.c1_e3 <= 1 + sc1_e3_sc1.c1_e3;
// same location constraint "sc1Embedded":
sc1Embedded: sc1_e1_sc1.c1_e1 + sc1_e2_sc1.c1_e2 + sc1_e3_sc1.c1_e3 = 1;
// variables for c1
bin c1_e1;
bin c1_e2;
bin c1_e3;
// variables for c2
bin c2_e1;
bin c2_e2;
bin c2_e3;
// variables for sc1.c1
bin sc1.c1_e1;
bin sc1.c1_e2;
bin sc1.c1_e3;
// variables for sc1
bin sc1_e1;
bin sc1_e2;
bin sc1_e3;
// helper variables for the same location constraint "foo"
bin c1_e1_c2_e1;
bin c1_e2_c2_e2;
bin c1_e3_c2_e3;
// helper variables for the same location constraint "sc1Embedded"
bin sc1_e1_sc1.c1_e1;
bin sc1_e2_sc1.c1_e2;
bin sc1_e3_sc1.c1_e3;