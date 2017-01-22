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

// differentLocation constraint (note: this equality
// makes the problem infeasible (due to the relation's lower bounds)
diffLocAAndB_m.pa.A_m.pa.B: m.pa.A_m.pb.b_m.pa.B_m.pb.b + m.pa.A_m.pb.c_m.pa.B_m.pb.c = 0;

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
