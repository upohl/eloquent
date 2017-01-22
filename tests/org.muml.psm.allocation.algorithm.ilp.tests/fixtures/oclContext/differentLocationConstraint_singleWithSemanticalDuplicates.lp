max: 1;
allocation_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c = 1;
allocation_m.pa.B: m.pa.B_m.pb.A + m.pa.B_m.pb.b + m.pa.B_m.pb.c = 1;
allocation_m.pa.C: m.pa.C_m.pb.A + m.pa.C_m.pb.b + m.pa.C_m.pb.c = 1;

// helpers
// A
m.pa.A_m.pb.A_m.pa.B_m.pb.A <= m.pa.A_m.pb.A;
m.pa.A_m.pb.A_m.pa.B_m.pb.A <= m.pa.B_m.pb.A;
m.pa.A_m.pb.A + m.pa.B_m.pb.A <= 1 + m.pa.A_m.pb.A_m.pa.B_m.pb.A;

m.pa.A_m.pb.b_m.pa.B_m.pb.b <= m.pa.A_m.pb.b;
m.pa.A_m.pb.b_m.pa.B_m.pb.b <= m.pa.B_m.pb.b;
m.pa.A_m.pb.b + m.pa.B_m.pb.b <= 1 + m.pa.A_m.pb.b_m.pa.B_m.pb.b;

m.pa.A_m.pb.c_m.pa.B_m.pb.c <= m.pa.A_m.pb.c;
m.pa.A_m.pb.c_m.pa.B_m.pb.c <= m.pa.B_m.pb.c;
m.pa.A_m.pb.c + m.pa.B_m.pb.c <= 1 + m.pa.A_m.pb.c_m.pa.B_m.pb.c;

m.pa.A_m.pb.A_m.pa.C_m.pb.A <= m.pa.A_m.pb.A;
m.pa.A_m.pb.A_m.pa.C_m.pb.A <= m.pa.C_m.pb.A;
m.pa.A_m.pb.A + m.pa.C_m.pb.A <= 1 + m.pa.A_m.pb.A_m.pa.C_m.pb.A;

m.pa.A_m.pb.b_m.pa.C_m.pb.b <= m.pa.A_m.pb.b;
m.pa.A_m.pb.b_m.pa.C_m.pb.b <= m.pa.C_m.pb.b;
m.pa.A_m.pb.b + m.pa.C_m.pb.b <= 1 + m.pa.A_m.pb.b_m.pa.C_m.pb.b;

m.pa.A_m.pb.c_m.pa.C_m.pb.c <= m.pa.A_m.pb.c;
m.pa.A_m.pb.c_m.pa.C_m.pb.c <= m.pa.C_m.pb.c;
m.pa.A_m.pb.c + m.pa.C_m.pb.c <= 1 + m.pa.A_m.pb.c_m.pa.C_m.pb.c;

// B
m.pa.B_m.pb.A_m.pa.C_m.pb.A <= m.pa.B_m.pb.A;
m.pa.B_m.pb.A_m.pa.C_m.pb.A <= m.pa.C_m.pb.A;
m.pa.B_m.pb.A + m.pa.C_m.pb.A <= 1 + m.pa.B_m.pb.A_m.pa.C_m.pb.A;

m.pa.B_m.pb.b_m.pa.C_m.pb.b <= m.pa.B_m.pb.b;
m.pa.B_m.pb.b_m.pa.C_m.pb.b <= m.pa.C_m.pb.b;
m.pa.B_m.pb.b + m.pa.C_m.pb.b <= 1 + m.pa.B_m.pb.b_m.pa.C_m.pb.b;

m.pa.B_m.pb.c_m.pa.C_m.pb.c <= m.pa.B_m.pb.c;
m.pa.B_m.pb.c_m.pa.C_m.pb.c <= m.pa.C_m.pb.c;
m.pa.B_m.pb.c + m.pa.C_m.pb.c <= 1 + m.pa.B_m.pb.c_m.pa.C_m.pb.c;

// differentLocation constraint ("duplicates" were removed during
// the transformation)
semdup_m.pa.A_m.pa.B: m.pa.A_m.pb.A_m.pa.B_m.pb.A + m.pa.A_m.pb.b_m.pa.B_m.pb.b + m.pa.A_m.pb.c_m.pa.B_m.pb.c = 0;
semdup_m.pa.A_m.pa.C: m.pa.A_m.pb.A_m.pa.C_m.pb.A + m.pa.A_m.pb.b_m.pa.C_m.pb.b + m.pa.A_m.pb.c_m.pa.C_m.pb.c = 0;
semdup_m.pa.B_m.pa.C: m.pa.B_m.pb.A_m.pa.C_m.pb.A + m.pa.B_m.pb.b_m.pa.C_m.pb.b + m.pa.B_m.pb.c_m.pa.C_m.pb.c = 0;

// variables for m.pa.A
bin m.pa.A_m.pb.A;
bin m.pa.A_m.pb.b;
bin m.pa.A_m.pb.c;
// variables for m.pa.B
bin m.pa.B_m.pb.A;
bin m.pa.B_m.pb.b;
bin m.pa.B_m.pb.c;
// variables for m.pa.C
bin m.pa.C_m.pb.A;
bin m.pa.C_m.pb.b;
bin m.pa.C_m.pb.c;
// helper variables
// A
bin m.pa.A_m.pb.A_m.pa.B_m.pb.A;
bin m.pa.A_m.pb.b_m.pa.B_m.pb.b;
bin m.pa.A_m.pb.c_m.pa.B_m.pb.c;
bin m.pa.A_m.pb.A_m.pa.C_m.pb.A;
bin m.pa.A_m.pb.b_m.pa.C_m.pb.b;
bin m.pa.A_m.pb.c_m.pa.C_m.pb.c;
// B
bin m.pa.B_m.pb.A_m.pa.C_m.pb.A;
bin m.pa.B_m.pb.b_m.pa.C_m.pb.b;
bin m.pa.B_m.pb.c_m.pa.C_m.pb.c;
