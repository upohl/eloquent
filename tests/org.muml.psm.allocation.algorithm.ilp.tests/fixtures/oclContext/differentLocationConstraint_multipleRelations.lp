max: 1;
relA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c >= 1;
relA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c <= 3;
relB_m.pa.B: m.pa.B_m.pb.b + m.pa.B_m.pb.c >= 1;
relB_m.pa.B: m.pa.B_m.pb.b + m.pa.B_m.pb.c <= 2;

// helpers
m.pa.A_m.pb.b_m.pa.B_m.pb.b <= m.pa.A_m.pb.b;
m.pa.A_m.pb.b_m.pa.B_m.pb.b <= m.pa.B_m.pb.b;
m.pa.A_m.pb.b + m.pa.B_m.pb.b <= 1 + m.pa.A_m.pb.b_m.pa.B_m.pb.b;

m.pa.A_m.pb.c_m.pa.B_m.pb.c <= m.pa.A_m.pb.c;
m.pa.A_m.pb.c_m.pa.B_m.pb.c <= m.pa.B_m.pb.c;
m.pa.A_m.pb.c + m.pa.B_m.pb.c <= 1 + m.pa.A_m.pb.c_m.pa.B_m.pb.c;

// differentLocation
diffLocAAndB_m.pa.A_m.pa.B: m.pa.A_m.pb.b_m.pa.B_m.pb.b + m.pa.A_m.pb.c_m.pa.B_m.pb.c = 0;

// variables for m.pa.A
bin m.pa.A_m.pb.A;
bin m.pa.A_m.pb.b;
bin m.pa.A_m.pb.c;
// variables for m.pa.B
bin m.pa.B_m.pb.b;
bin m.pa.B_m.pb.c;
// helper variables
bin m.pa.A_m.pb.b_m.pa.B_m.pb.b;
bin m.pa.A_m.pb.c_m.pa.B_m.pb.c;
