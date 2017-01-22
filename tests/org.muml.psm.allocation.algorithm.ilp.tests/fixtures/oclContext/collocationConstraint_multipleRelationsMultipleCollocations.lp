max: 1;
relA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c >= 1;
relA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c <= 3;
relB_m.pa.B: m.pa.B_m.pb.b + m.pa.B_m.pb.c >= 1;
relB_m.pa.B: m.pa.B_m.pb.b + m.pa.B_m.pb.c <= 2;
allocC_m.pa.C: m.pa.C_m.pb.A + m.pa.C_m.pb.b = 1;

// helpers
m.pa.A_m.pb.b_m.pa.B_m.pb.b <= m.pa.A_m.pb.b;
m.pa.A_m.pb.b_m.pa.B_m.pb.b <= m.pa.B_m.pb.b;
m.pa.A_m.pb.b + m.pa.B_m.pb.b <= 1 + m.pa.A_m.pb.b_m.pa.B_m.pb.b;

m.pa.A_m.pb.c_m.pa.B_m.pb.c <= m.pa.A_m.pb.c;
m.pa.A_m.pb.c_m.pa.B_m.pb.c <= m.pa.B_m.pb.c;
m.pa.A_m.pb.c + m.pa.B_m.pb.c <= 1 + m.pa.A_m.pb.c_m.pa.B_m.pb.c;

// first collocation constraint
collocateAAndB_m.pa.A_m.pa.B: m.pa.A_m.pb.b_m.pa.B_m.pb.b + m.pa.A_m.pb.c_m.pa.B_m.pb.c >= 1;

// helpers
m.pa.A_m.pb.A_m.pa.C_m.pb.A <= m.pa.A_m.pb.A;
m.pa.A_m.pb.A_m.pa.C_m.pb.A <= m.pa.C_m.pb.A;
m.pa.A_m.pb.A + m.pa.C_m.pb.A <= 1 + m.pa.A_m.pb.A_m.pa.C_m.pb.A;

m.pa.A_m.pb.b_m.pa.C_m.pb.b <= m.pa.A_m.pb.b;
m.pa.A_m.pb.b_m.pa.C_m.pb.b <= m.pa.C_m.pb.b;
m.pa.A_m.pb.b + m.pa.C_m.pb.b <= 1 + m.pa.A_m.pb.b_m.pa.C_m.pb.b;

// second collocation constraint
collocateAAndC_m.pa.A_m.pa.C: m.pa.A_m.pb.A_m.pa.C_m.pb.A + m.pa.A_m.pb.b_m.pa.C_m.pb.b >= 1;

// helpers
m.pa.B_m.pb.b_m.pa.C_m.pb.b <= m.pa.B_m.pb.b;
m.pa.B_m.pb.b_m.pa.C_m.pb.b <= m.pa.C_m.pb.b;
m.pa.B_m.pb.b + m.pa.C_m.pb.b <= 1 + m.pa.B_m.pb.b_m.pa.C_m.pb.b;

// third collocation constraint
collocateCAndB_m.pa.B_m.pa.C: m.pa.B_m.pb.b_m.pa.C_m.pb.b >= 1;

// variables for m.pa.A
bin m.pa.A_m.pb.A;
bin m.pa.A_m.pb.b;
bin m.pa.A_m.pb.c;
// variables for m.pa.B
bin m.pa.B_m.pb.b;
bin m.pa.B_m.pb.c;
// variables for m.pa.C
bin m.pa.C_m.pb.A;
bin m.pa.C_m.pb.b;
// helper variables
bin m.pa.A_m.pb.b_m.pa.B_m.pb.b;
bin m.pa.A_m.pb.c_m.pa.B_m.pb.c;

bin m.pa.A_m.pb.A_m.pa.C_m.pb.A;
bin m.pa.A_m.pb.b_m.pa.C_m.pb.b;

bin m.pa.B_m.pb.b_m.pa.C_m.pb.b;