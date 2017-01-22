max: 1;
// A should be related to at least 1 and at most 42 packages
// B should be related/allocated to exactly 1 package
// C should be related to at least 0 and at most 1 package
relationA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c >= 1;
relationA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c <= 42;
allocB_m.pa.B: m.pa.B_m.pb.A + m.pa.B_m.pb.b + m.pa.B_m.pb.c = 1;
relateC_m.pa.C: m.pa.C_m.pb.b + m.pa.C_m.pb.c >= 0;
relateC_m.pa.C: m.pa.C_m.pb.b + m.pa.C_m.pb.c <= 1;
// variables for m.pa.A
bin m.pa.A_m.pb.A;
bin m.pa.A_m.pb.b;
bin m.pa.A_m.pb.c;
// variables for m.pa.B
bin m.pa.B_m.pb.A;
bin m.pa.B_m.pb.b;
bin m.pa.B_m.pb.c;
// variables for m.pa.C
bin m.pa.C_m.pb.b;
bin m.pa.C_m.pb.c;