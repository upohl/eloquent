max: 1;
// each component has to be allocated to exactly one ECU
c1: c1_platformtype.0.e1 + c1_platformtype.0.e2 + c1_platformtype.0.e3 = 1;
c2: c2_platformtype.0.e1 + c2_platformtype.0.e2 + c2_platformtype.0.e3 = 1;
c3: c3_platformtype.0.e1 + c3_platformtype.0.e2 + c3_platformtype.0.e3 = 1;
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
// constraints for c1_platformtype.0.e1_c3_platformtype.0.e1
c1_platformtype.0.e1_c3_platformtype.0.e1 <= c1_platformtype.0.e1;
c1_platformtype.0.e1_c3_platformtype.0.e1 <= c3_platformtype.0.e1;
c1_platformtype.0.e1 + c3_platformtype.0.e1 <= 1 + c1_platformtype.0.e1_c3_platformtype.0.e1;
// constraints for c1_platformtype.0.e2_c3_platformtype.0.e2
c1_platformtype.0.e2_c3_platformtype.0.e2 <= c1_platformtype.0.e2;
c1_platformtype.0.e2_c3_platformtype.0.e2 <= c3_platformtype.0.e2;
c1_platformtype.0.e2 + c3_platformtype.0.e2 <= 1 + c1_platformtype.0.e2_c3_platformtype.0.e2;
// constraints for c1_platformtype.0.e3_c3_platformtype.0.e3
c1_platformtype.0.e3_c3_platformtype.0.e3 <= c1_platformtype.0.e3;
c1_platformtype.0.e3_c3_platformtype.0.e3 <= c3_platformtype.0.e3;
c1_platformtype.0.e3 + c3_platformtype.0.e3 <= 1 + c1_platformtype.0.e3_c3_platformtype.0.e3;
// constraints for c2_platformtype.0.e1_c3_platformtype.0.e1
c2_platformtype.0.e1_c3_platformtype.0.e1 <= c2_platformtype.0.e1;
c2_platformtype.0.e1_c3_platformtype.0.e1 <= c3_platformtype.0.e1;
c2_platformtype.0.e1 + c3_platformtype.0.e1 <= 1 + c2_platformtype.0.e1_c3_platformtype.0.e1;
// constraints for c2_platformtype.0.e2_c3_platformtype.0.e2
c2_platformtype.0.e2_c3_platformtype.0.e2 <= c2_platformtype.0.e2;
c2_platformtype.0.e2_c3_platformtype.0.e2 <= c3_platformtype.0.e2;
c2_platformtype.0.e2 + c3_platformtype.0.e2 <= 1 + c2_platformtype.0.e2_c3_platformtype.0.e2;
// constraints for c2_platformtype.0.e3_c3_platformtype.0.e3
c2_platformtype.0.e3_c3_platformtype.0.e3 <= c2_platformtype.0.e3;
c2_platformtype.0.e3_c3_platformtype.0.e3 <= c3_platformtype.0.e3;
c2_platformtype.0.e3 + c3_platformtype.0.e3 <= 1 + c2_platformtype.0.e3_c3_platformtype.0.e3;
// different location constraint "foo"
foo_c1_c2: c1_platformtype.0.e1_c2_platformtype.0.e1
	+ c1_platformtype.0.e2_c2_platformtype.0.e2
	+ c1_platformtype.0.e3_c2_platformtype.0.e3 = 0;
foo_c1_c3: c1_platformtype.0.e1_c3_platformtype.0.e1
	+ c1_platformtype.0.e2_c3_platformtype.0.e2
	+ c1_platformtype.0.e3_c3_platformtype.0.e3 = 0;
foo_c2_c3: c2_platformtype.0.e1_c3_platformtype.0.e1
	+ c2_platformtype.0.e2_c3_platformtype.0.e2
	+ c2_platformtype.0.e3_c3_platformtype.0.e3 = 0;
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
// helper variables for the different location constraint "foo"
bin c1_platformtype.0.e1_c2_platformtype.0.e1;
bin c1_platformtype.0.e2_c2_platformtype.0.e2;
bin c1_platformtype.0.e3_c2_platformtype.0.e3;
bin c1_platformtype.0.e1_c3_platformtype.0.e1;
bin c1_platformtype.0.e2_c3_platformtype.0.e2;
bin c1_platformtype.0.e3_c3_platformtype.0.e3;
bin c2_platformtype.0.e1_c3_platformtype.0.e1;
bin c2_platformtype.0.e2_c3_platformtype.0.e2;
bin c2_platformtype.0.e3_c3_platformtype.0.e3;