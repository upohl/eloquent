max: ;
// each component has to be allocated to exactly one ECU
c1: c1_e1 + c1_e2 + c1_e3 = 1;
c2: c2_e1 + c2_e2 + c2_e3 = 1;
sc1: sc1_e1 + sc1_e2 + sc1_e3 = 1;
sc1.sc2: sc1.sc2_e1 + sc1.sc2_e2 + sc1.sc2_e3 = 1;
sc1.sc2.c1: sc1.sc2.c1_e1 + sc1.sc2.c1_e2 + sc1.sc2.c1_e3 = 1;
// variables for c1
bin c1_e1;
bin c1_e2;
bin c1_e3;
// variables for c2
bin c2_e1;
bin c2_e2;
bin c2_e3;
// variables for sc1.sc2.c1
bin sc1.sc2.c1_e1;
bin sc1.sc2.c1_e2;
bin sc1.sc2.c1_e3;
// variables for sc1.sc2
bin sc1.sc2_e1;
bin sc1.sc2_e2;
bin sc1.sc2_e3;
// variables for sc1
bin sc1_e1;
bin sc1_e2;
bin sc1_e3;
