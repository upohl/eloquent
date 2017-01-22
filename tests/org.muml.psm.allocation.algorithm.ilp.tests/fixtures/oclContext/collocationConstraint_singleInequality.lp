max: 1;
rel_m.pa.A: m.pa.A_m.pb.b + m.pa.A_m.pb.c >= 2;
rel_m.pa.A: m.pa.A_m.pb.b + m.pa.A_m.pb.c <= 3;
rel_m.pa.B: m.pa.B_m.pb.b + m.pa.B_m.pb.c >= 2;
rel_m.pa.B: m.pa.B_m.pb.b + m.pa.B_m.pb.c <= 3;
rel_m.pa.C: m.pa.C_m.pb.b + m.pa.C_m.pb.c >= 2;
rel_m.pa.C: m.pa.C_m.pb.b + m.pa.C_m.pb.c <= 3;

// helpers
m.pa.A_m.pb.b_m.pa.B_m.pb.b <= m.pa.A_m.pb.b;
m.pa.A_m.pb.b_m.pa.B_m.pb.b <= m.pa.B_m.pb.b;
m.pa.A_m.pb.b + m.pa.B_m.pb.b <= 1 + m.pa.A_m.pb.b_m.pa.B_m.pb.b;

m.pa.A_m.pb.c_m.pa.B_m.pb.c <= m.pa.A_m.pb.c;
m.pa.A_m.pb.c_m.pa.B_m.pb.c <= m.pa.B_m.pb.c;
m.pa.A_m.pb.c + m.pa.B_m.pb.c <= 1 + m.pa.A_m.pb.c_m.pa.B_m.pb.c;

// collocation (this is an example why it is important to generate
// a >= 1 inequality instead of a "= 1" equality): A and B are related
// to the same package_S_
collocateAAndB_m.pa.A_m.pa.B: m.pa.A_m.pb.b_m.pa.B_m.pb.b + m.pa.A_m.pb.c_m.pa.B_m.pb.c >= 1;

// variables for m.pa.A
bin m.pa.A_m.pb.b;
bin m.pa.A_m.pb.c;
// variables for m.pa.B
bin m.pa.B_m.pb.b;
bin m.pa.B_m.pb.c;
// variables for m.pa.C
bin m.pa.C_m.pb.b;
bin m.pa.C_m.pb.c;
// helper variables
bin m.pa.A_m.pb.b_m.pa.B_m.pb.b;
bin m.pa.A_m.pb.c_m.pa.B_m.pb.c;
